
package com.Tarea.repository;

import com.Tarea.entity.factura;
import com.Tarea.entity.faq;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
//se hereda de crudrepository
//usa java generic que pone el tipo de objeto y el id
public interface faqRepository extends CrudRepository<faq,Long>{
     
}    

