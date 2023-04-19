
package com.Tarea.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

//Patron decorador que se va a comportar como una identidad...
@Entity
//en nuestra tabla carrito
@Table (name="carrito")
public class carrito implements Serializable { //serializa es darle formato al objeto
    @Id //indica que el atributo id es el id de nuestra tabla 
    @GeneratedValue(strategy=GenerationType.IDENTITY)//que el id es incremental
    
    //atributos
    private long id;
    private String nombre;
    
    //relacion de 1 a n entre la tabla descripcionprodcutos y carrito
    @ManyToOne
    //FK
    @JoinColumn(name ="descripcionProductos_id")
    //objeto de tipo descripcionProductos
    private descripcionProductos descripcionProductos;

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

    public descripcionProductos getDescripcionProductos() {
        return descripcionProductos;
    }

    public void setDescripcionProductos(descripcionProductos descripcionProductos) {
        this.descripcionProductos = descripcionProductos;
    }
    
}
