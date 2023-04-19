
package com.Tarea.service;

import com.Tarea.entity.descripcionProductos;
import com.Tarea.entity.registro;
import java.util.List;

public interface IdescripcionProductosService {
    public List<descripcionProductos> getAlldescripcionProductos();

    public descripcionProductos getdescripcionProductosById(long id);

//    public void savedescripcionProductos(descripcionProductos descripcionProductos);

    public void delete(long id);
}
