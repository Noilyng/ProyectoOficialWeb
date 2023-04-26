package com.Tarea.controller;

import com.Tarea.entity.registro;

import com.Tarea.service.IregistroService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class registroController {

    @Autowired
    private IregistroService registroService;
    
    @GetMapping("/registroVer")
    public String registro(Model model) {
        List<registro> listaregistro = registroService.getAllregistro();
         model.addAttribute("Titulo", "TablaUsuarios");
        model.addAttribute("ConfigAdmin", listaregistro);
        //mostrar usuarios admin
        return "ConfigAdmin";
    }
    

    @GetMapping("/registrarse")
    public String nuevoRegistro(Model model) {
        model.addAttribute("registro", new registro());
        return "registro";
    }
     @PostMapping("/save")
    public String guardarRegistro(@ModelAttribute registro registro) {
        registroService.saveregistro(registro);
        return "redirect:/registroVer";
    }
}


