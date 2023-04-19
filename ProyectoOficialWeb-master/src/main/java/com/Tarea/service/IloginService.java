
package com.Tarea.service;

import com.Tarea.entity.login;
import com.Tarea.entity.registro;
import java.util.List;

public interface IloginService {
    public List<login> getAlllogin();

    public login getloginById(long id);

    public void savelogin(login login);

    public void delete(long id);
}
