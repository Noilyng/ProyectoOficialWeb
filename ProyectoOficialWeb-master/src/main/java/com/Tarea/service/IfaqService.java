
package com.Tarea.service;

import com.Tarea.entity.registro;
import java.util.List;

public interface IfaqService {
    
    public List<registro> getAllregistro();

    public registro getregistroById(long id);

//    public void saveregistro(registro registro);

    public void delete(long id);
}
