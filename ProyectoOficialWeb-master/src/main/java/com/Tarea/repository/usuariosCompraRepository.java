
package com.Tarea.repository;

import com.Tarea.entity.registro;
import com.Tarea.entity.usuarioCompra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
//se hereda de crudrepository
//usa java generic que pone el tipo de objeto y el id
public interface usuariosCompraRepository extends CrudRepository<usuarioCompra,Long>{
     
}