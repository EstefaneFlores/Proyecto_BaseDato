package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.CategoriaService;
import Service.IProductoService;
import entitys.Categoria;
import entitys.Producto;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping(value = "/formProducto")
    public String registroProducto(@Validated Producto producto, Model model) {

        model.addAttribute("producto", new Producto());
        model.addAttribute("productos", productoService.findAll());

        return "formulario/formProducto";
    }

    /* GUARDAR */
    @PostMapping(value = "/guardarProducto")
    public String registrarProducto(@Validated Producto producto) {

        producto.setEstadoProducto("A");
        productoService.save(producto);

        return "redirect/ListaProduto";

    }

    /* ELIMINAR */
    @RequestMapping(value = "/eliminarProducto/{id_producto}")
    public String eliminarProducto(@PathVariable("id_producto") Long id_producto) {

        Producto producto = productoService.findOne(id_producto);
        producto.setEstadoProducto("A");
        productoService.save(producto);

        return "redirect:/ListaProducto";
    }

    /* LISTA */
    @GetMapping(value = "/ListaProducto")
    public String listarProducto(Model model) {
        model.addAttribute("producto", new Producto());
        model.addAttribute("productos", productoService.findAll());

        model.addAttribute("categoria", new Categoria());
        model.addAttribute("categorias", categoriaService.findAll());

        return "redirect:/ListaProducto";
    }

    /* MODIFICACION MODAL */
    @RequestMapping(value = "/producto/{idProducto}")
    public String getContentProducto(@PathVariable(value = "idProducto") Long idProducto, Model model,
            HttpServletRequest request) {
        model.addAttribute("producto", productoService.findOne(idProducto));

        return "content :: content2";

    }

    /* EDITAR */
    @RequestMapping(value = "/editarProducto/{idProducto}")
    public String editarProducto(@PathVariable("idProducto") Long idProducto, Model model) {
        Producto producto = productoService.findOne(idProducto);
        model.addAttribute("producto", producto);

        return "formulario/formProducto";
    }
    /* GUARDAR CAMBIOS */

    @PostMapping(value = "/guardarCambiosProducto")
    public String guardarCambiosProducto(@ModelAttribute Producto producto) {
        producto.setEstadoProducto("A");
        productoService.save(producto);
        return "redirect:/ListaProducto";

    }

}