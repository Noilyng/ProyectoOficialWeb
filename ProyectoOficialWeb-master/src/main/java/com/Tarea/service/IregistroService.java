
package com.Tarea.service;

import com.Tarea.entity.registro;
import java.util.List;

public interface IregistroService {
    public List<registro> getAllregistro();

    public registro getregistroById(long id);

    public void saveregistro(registro registro);

    public void delete(long id);
    
//    public registro findByNombre (String username);
}
