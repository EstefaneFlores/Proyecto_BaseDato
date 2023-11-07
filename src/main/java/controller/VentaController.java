package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Service.IVentaService;

@Controller
public class VentaController {

    @Autowired
    private IVentaService ventaService;
  
    
}
