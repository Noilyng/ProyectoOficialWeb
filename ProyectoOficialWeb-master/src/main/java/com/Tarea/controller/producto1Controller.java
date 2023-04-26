
package com.Tarea.controller;



import com.Tarea.entity.producto1;
import com.Tarea.service.Iproducto1Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class producto1Controller {
    
    @Autowired
    private Iproducto1Service producto1Service;
    
  @GetMapping("/productos")
    public String mostrarProductos(Model model) {
        List<producto1> productos = producto1Service.obtenerTodosLosProductos();
        model.addAttribute("productos", productos);
        return "productos";
    }
   
    
}