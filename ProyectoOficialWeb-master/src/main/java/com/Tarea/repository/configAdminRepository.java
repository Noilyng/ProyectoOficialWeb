
package com.Tarea.repository;

import com.Tarea.entity.carrito;
import com.Tarea.entity.configAdmin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

 @Repository
//se hereda de crudrepository
//usa java generic que pone el tipo de objeto y el id
public interface configAdminRepository extends CrudRepository<configAdmin,Long> {
    
} 

