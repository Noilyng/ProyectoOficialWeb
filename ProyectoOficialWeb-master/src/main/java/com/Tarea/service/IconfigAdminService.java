
package com.Tarea.service;

import com.Tarea.entity.configAdmin;
import com.Tarea.entity.registro;
import java.util.List;

public interface IconfigAdminService {
    public List<configAdmin> getAllconfigAdmin();

    public configAdmin getconfigAdminById(long id);

//    public void saveregistro(registro registro);

    public void delete(long id);
}
