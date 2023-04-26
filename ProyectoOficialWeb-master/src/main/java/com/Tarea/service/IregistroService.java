
package com.Tarea.service;

import com.Tarea.entity.registro;
import java.util.List;

public interface IregistroService {
    
    public List<registro>getAllregistro();//listar
    public void saveregistro(registro registro);//guardar registro
    //public int save(registro p)
    public registro findByNombre (String username);
    public registro getregistroById (long id);
    
}
