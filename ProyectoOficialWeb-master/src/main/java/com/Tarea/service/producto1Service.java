
package com.Tarea.service;


import com.Tarea.entity.producto1;
import com.Tarea.repository.producto1Repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class producto1Service implements Iproducto1Service {
    
    @Autowired
    private producto1Repository producto1Repository;

   
    @Override
    public List<producto1> obtenerTodosLosProductos() {
        return (List<producto1>) producto1Repository.findAll();
    }

}
