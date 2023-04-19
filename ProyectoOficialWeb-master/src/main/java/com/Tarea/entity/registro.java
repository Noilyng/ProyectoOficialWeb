
package com.Tarea.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
//en nuestra tabla registro
@Table(name = "registro")
public class registro implements Serializable { //serializable es darle formato al objeto

    @Id //indica que el atributo id es el id de nuestra tabla 
    @GeneratedValue(strategy = GenerationType.IDENTITY)//que el id es incremental

    //atributos
    private long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String correo;
    private String contrasena;
    private String repetirContrasena;

    //getter and setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
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

    public String getRepetirContrasena() {
        return repetirContrasena;
    }

    public void setRepetirContrasena(String repetirContrasena) {
        this.repetirContrasena = repetirContrasena;
    }
    
}
