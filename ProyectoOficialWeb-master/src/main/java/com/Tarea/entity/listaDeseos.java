
package com.Tarea.entity;

//Patron decorador que se va a comportar como una identidad...

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
//en nuestra tabla listaDeseos
@Table(name = "listaDeseos")
public class listaDeseos implements Serializable { //serializable es darle formato al objeto

    @Id //indica que el atributo id es el id de nuestra tabla 
    @GeneratedValue(strategy = GenerationType.IDENTITY)//que el id es incremental

    //atributos
    private long id;
    private String nombre;
    private String precio;
    
    //relacion de 1 a n entre la tabla productos y listaDeseos
    @ManyToOne
    //FK
    @JoinColumn(name ="productos_id")
    //objeto de tipo productos
    private productos productos;

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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public productos getProductos() {
        return productos;
    }

    public void setProductos(productos productos) {
        this.productos = productos;
    }
    
    
}
