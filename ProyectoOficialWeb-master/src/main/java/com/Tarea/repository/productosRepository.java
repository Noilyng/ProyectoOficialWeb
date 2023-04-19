
package com.Tarea.repository;

import com.Tarea.entity.login;
import com.Tarea.entity.productos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
//se hereda de crudrepository
//usa java generic que pone el tipo de objeto y el id
public interface productosRepository extends CrudRepository<productos,Long>{
     
}