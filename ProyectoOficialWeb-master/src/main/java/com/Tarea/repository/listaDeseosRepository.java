
package com.Tarea.repository;

import com.Tarea.entity.faq;
import com.Tarea.entity.listaDeseos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
//se hereda de crudrepository
//usa java generic que pone el tipo de objeto y el id
public interface listaDeseosRepository extends CrudRepository<listaDeseos,Long>{
     
}    
    

