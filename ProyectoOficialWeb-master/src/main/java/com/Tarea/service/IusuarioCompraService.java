
package com.Tarea.service;

import com.Tarea.entity.usuarioCompra;
import java.util.List;

public interface IusuarioCompraService {
    public List<usuarioCompra> getAllusuarioCompra();

    public usuarioCompra getusuarioCompraById(long id);

    public void saveusuarioCompra(usuarioCompra usuarioCompra);

    public void delete(long id);
}
