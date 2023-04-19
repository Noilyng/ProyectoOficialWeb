
package com.Tarea.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
//en nuestra tabla login
@Table(name = "login")
public class login implements Serializable { //serializable es darle formato al objeto

    @Id //indica que el atributo id es el id de nuestra tabla 
    @GeneratedValue(strategy = GenerationType.IDENTITY)//que el id es incremental

    //atributos
    private long id;
    private String correo;
    private String contrasena;
    
    //relacion de 1 a n entre la tabla registro y login
    @ManyToOne
    //FK
    @JoinColumn(name ="registro_id")
    //objeto de tipo registro
    private registro registro;

    //getter and setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public registro getRegistro() {
        return registro;
    }

    public void setRegistro(registro registro) {
        this.registro = registro;
    }
    
    
    
}
