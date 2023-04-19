package com.Tarea.service;

//definir el metodo que se va a usar desde el controller
import com.Tarea.entity.carrito;
import com.Tarea.entity.registro;
import java.util.List;

public interface IcarritoService {

    public List<carrito> getAllcarrito();

    public carrito getcarritoById(long id);

    public void savecarrito(carrito carrito);

    public void delete(long id);
}
