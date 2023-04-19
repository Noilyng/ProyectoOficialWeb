
package com.Tarea.controller;

import com.Tarea.entity.login;
import com.Tarea.entity.registro;
import com.Tarea.service.IloginService;
import com.Tarea.service.IregistroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class registroController {

    @Autowired
    private IregistroService registroService;

    @Autowired
    private IloginService loginService;

    @GetMapping("/registro")
    public String index(Model model) {
        List<registro> listaregistro = registroService.getAllregistro();
        model.addAttribute("titulo", "Tabla registro");
        model.addAttribute("registro", listaregistro);
        return "registro";
    }

    @GetMapping("/registroN")
    public String crearPersona(Model model) {
        List<login> login = loginService.getAlllogin();
        model.addAttribute("registro", new registro());
        model.addAttribute("login", login);
        return "crear";
    }

    @GetMapping("/delete/(id)")
    public String eliminarregistro(@PathVariable("id") Long idregistro) {
        registroService.delete(idregistro);
        return "redirect:/registro";
    }

    @PostMapping("/save")
    public String guardarregistro(@ModelAttribute registro registro) {
        registroService.saveregistro(registro);
        return "redirect:/registro";
    }

    @GetMapping("/editregistro/(id)")
    public String editarregistro(@PathVariable("id") Long idregistro, Model model) {
        registro registro = registroService.getregistroById(idregistro);
        List<login> login = loginService.getAlllogin();
        model.addAttribute("registro", registro);
        model.addAttribute("login", login);
        return "crear";
    }
}
   

