
package com.Tarea.repository;

import com.Tarea.entity.carrito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//se hereda de crudrepository
//usa java generic que pone el tipo de objeto y el id
public interface carritoRepository extends CrudRepository<carrito,Long> {
    
}
