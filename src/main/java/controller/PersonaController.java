package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;

import Service.ClienteService;
import Service.IPersonaService;
import Service.IVendedorService;
import entitys.Cliente;
import entitys.Persona;
import entitys.Vendedor;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @Autowired
    private IVendedorService vendedorService;

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/formPersona")
    public String registroPersona(Model model) {

        model.addAttribute("persona", new Persona());
        model.addAttribute("persona", personaService.findAll());

        model.addAttribute("cliente", new Cliente());
        model.addAttribute("cliente", clienteService.findAll());

        model.addAttribute("vendedor", new Vendedor());
        model.addAttribute("vendedor", vendedorService.findAll());
        return "index/login"; // EFALTA ORGANIZAR EL RETURN DE AQUI
    }

    /* GUARDAR */

    @PostMapping(value = "/guardarPersona")
    public String guardarPersona(@Validated Persona persona, RedirectAttributes flash, HttpServletRequest request,
            @RequestParam(name = "nombres", required = false) String nombres,
            @RequestParam(name = "ap_paterno", required = false) String apPaterno,
            @RequestParam(name = "ap_materno", required = false) String apMaterno,
            @RequestParam(name = "cliente", required = false) Long idCliente,
            @RequestParam(name = "vendedor", required = false) Long idVendedor) {

        Persona existingPersona = personaService.findByCi(persona.getCi());

        if (existingPersona != null) {
            if ("A".equals(existingPersona.getEstado())) {
                flash.addFlashAttribute("error", "Ya existe una persona con ese CI en estado 'A': " + persona.getCi());
                return "redirect:/formRegistro";
            } else {
                // Actualiza el registro existente con estado 'X' a 'A'
                persona.setEstado("A");
                persona.setCliente(clienteService.findOne(idCliente));
                persona.setVendedor(vendedorService.findOne(idVendedor));
                personaService.save(persona); // guarda todos os dados da pessoa

                return "redirect/formRegistro";
            }

        } else {
            // No existe una persona con el mismo CI, crea un nuevo registro
            persona.setEstado("A");
            persona.setCliente(clienteService.findOne(idCliente));
            persona.setVendedor(vendedorService.findOne(idVendedor));
            personaService.save(persona); // guarda todos os dados da pessoa

            return "redirect/formRegistro";
        }

    }

    /* ELIMINAR */

    @RequestMapping(value = "eliminarPersona/{idPersona}")
    public String eliminarPersona(@PathVariable("idPersona") Long idPersona) {

        Persona persona = personaService.findOne(idPersona);
        persona.setEstado("X");
        personaService.save(persona);

        return "redirect:/ListaPersona";
    }

    /* modificar un registro con el modal */
    @RequestMapping(value = "/persona/{idPersona}")
    public String getContent1(@PathVariable(value = "idPersona") Long idPersona, Model model, HttpServletRequest request) {
        model.addAttribute("persona", personaService.findOne(idPersona));
        model.addAttribute("clientes", clienteService.findAll());
        model.addAttribute("vendedor", vendedorService.findAll());
        return "";     /*FALTA TERMINAR AQUI*/

    }


}