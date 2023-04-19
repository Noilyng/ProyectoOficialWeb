
package com.Tarea.service;

import com.Tarea.entity.listaDeseos;
import java.util.List;

public interface IlistaDeseosService {
     public List<listaDeseos> getAlllistaDeseos();

    public listaDeseos getlistaDeseosById(long id);

//    public void savelistaDeseos(listaDeseos listaDeseos);

    public void delete(long id);
}
