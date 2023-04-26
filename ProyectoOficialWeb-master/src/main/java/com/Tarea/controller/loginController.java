
package com.Tarea.controller;

import com.Tarea.entity.login;
import com.Tarea.service.IloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



 @Controller
public class loginController {
     @GetMapping("/login")
    public String index(){
        return "/login";
    }
   
//    @Autowired
//    private IloginService loginService;
//    
//    @GetMapping("/registro")
//    public String registro(Model model) {
//        List<registro> listaregistro = registroService.getAllregistro();
//        model.addAttribute("registro", listaregistro);
//        return "registro";
//    }
//    @GetMapping("/login")
//    public String nuevologin(login login) {
//        return "login";
//    }
//     @PostMapping("/guardar")
//    public String guardarLogin(login login) {
//        loginService.savelogin(login);
//        return "/redirect:/productos";
//    }

}

