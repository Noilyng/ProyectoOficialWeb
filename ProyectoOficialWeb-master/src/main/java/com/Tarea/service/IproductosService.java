
package com.Tarea.service;

import com.Tarea.entity.login;
import com.Tarea.entity.productos;
import java.util.List;

public interface IproductosService {
    public List<productos> getAllproductos();

    public login getproductosById(long id);

    public void saveproductos(productos productos);

    public void delete(long id);
}
