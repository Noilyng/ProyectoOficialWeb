
package com.Tarea.service;


import com.Tarea.entity.registro;

import com.Tarea.repository.registroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class loginService implements UserDetailsService{
    
 @Autowired
    private IregistroService registroService;
 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       registro registro = this.registroService.findByNombre(username);
        login2 Login2 = new login2(registro);
        return Login2;
    }
    
}
