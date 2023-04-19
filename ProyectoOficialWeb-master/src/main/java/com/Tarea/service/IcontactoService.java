
package com.Tarea.service;
import com.Tarea.entity.contacto;
import java.util.List;
public interface IcontactoService {
    public List<contacto> getAllcontacto();

    public contacto getcontactoById(long id);

    public void savecontacto(contacto contacto);

    public void delete(long id);
}
