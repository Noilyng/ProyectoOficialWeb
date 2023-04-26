//
//package com.Tarea.entity;
//
//
//import java.io.Serializable;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
////Patron decorador que se va a comportar como una identidad...
//@Entity
////en nuestra tabla carrito
////@Table (name="carrito")
//public class carrito implements Serializable { //serializa es darle formato al objeto
//    @Id //indica que el atributo id es el id de nuestra tabla 
//    @GeneratedValue(strategy=GenerationType.IDENTITY)//que el id es incremental
//    
//    //atributos
//    private long id;
//    private String nombre;
//    
//    //relacion de 1 a n entre la tabla descripcionprodcutos y carrito
//    @ManyToOne
//    //FK
//    @JoinColumn(name ="descripcionProductos_id")
//    //objeto de tipo descripcionProductos
//    private descripcionProductos descripcionProductos;
//
//    //getter and setter
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public descripcionProductos getDescripcionProductos() {
//        return descripcionProductos;
//    }
//
//    public void setDescripcionProductos(descripcionProductos descripcionProductos) {
//        this.descripcionProductos = descripcionProductos;
//    }
//    
//}
