
package com.Tarea.service;

import com.Tarea.entity.registro;
import com.Tarea.repository.registroRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class registroService implements IregistroService{
    @Autowired
    private registroRepository registroRepository;

    @Override
    public void saveregistro(registro registro) {
        registroRepository.save(registro);
    }

    @Override
    public List<registro> getAllregistro() {
       return (List<registro>) registroRepository.findAll();
    }

    @Override
    public registro findByNombre(String username) {
       return registroRepository.findByNombre(username);
    }

    @Override
    public registro getregistroById(long id) {
        return registroRepository.findById(id).orElse(null);
    }
        
   


}
