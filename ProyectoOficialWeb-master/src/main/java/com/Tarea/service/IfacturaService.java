
package com.Tarea.service;

import com.Tarea.entity.factura;
import com.Tarea.entity.registro;
import java.util.List;


public interface IfacturaService {
    public List<factura> getAllfactura();

    public factura getfacturaById(long id);

//    public void savefacturao(factura factura);

    public void delete(long id);
}
