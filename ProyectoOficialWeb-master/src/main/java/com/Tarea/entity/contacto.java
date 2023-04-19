
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
//en nuestra tabla contacto
@Table(name = "contacto")
public class contacto implements Serializable { //serializable es darle formato al objeto

    @Id //indica que el atributo id es el id de nuestra tabla 
    @GeneratedValue(strategy = GenerationType.IDENTITY)//que el id es incremental

    //atributos
    private long id;
    private String correo;
    private String nombre;
    private String mensaje;
    
    //relacion de 1 a n entre la tabla faq y contacto
    @ManyToOne
    //FK
    @JoinColumn(name ="faq_id")
    //objeto de tipo faq
    private faq faq;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public faq getFaq() {
        return faq;
    }

    public void setFaq(faq faq) {
        this.faq = faq;
    }

    
}
