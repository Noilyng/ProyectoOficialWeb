
package com.Tarea.repository;




import com.Tarea.entity.producto1;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
//se hereda de crudrepository
//usa java generic que pone el tipo de objeto y el id
public interface producto1Repository extends CrudRepository<producto1,Long>{
//    List<producto1> findAll();
     
}
