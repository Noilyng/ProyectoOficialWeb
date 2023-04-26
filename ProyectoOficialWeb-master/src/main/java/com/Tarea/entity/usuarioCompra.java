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
//@Entity
////en nuestra tabla usuarioCompra
////@Table(name = "UsuarioCompra")
//public class usuarioCompra implements Serializable { //serializable es darle formato al objeto
//
//    @Id //indica que el atributo id es el id de nuestra tabla 
//    @GeneratedValue(strategy = GenerationType.IDENTITY)//que el id es incremental
//
//    //atributos
//    private long id;
//    private String nombre;
//    private String apellido1;
//    private String apellido2;
//    private String correo1;
//    private String correo2;
//    private String ciudad;
//    private String provincia;
//    private String numeroTarjeta;
//    private String codigoSeguridad;
//    private String codigoPostal;
//    
//    //relacion de 1 a n entre la tabla carrito y usuarioCompra
//    @ManyToOne
//    //FK
//    @JoinColumn(name ="carrito_id")
//    //objeto de tipo carrito
//    private carrito carrito;
//
//    //getter and setter
//
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
//    public String getApellido1() {
//        return apellido1;
//    }
//
//    public void setApellido1(String apellido1) {
//        this.apellido1 = apellido1;
//    }
//
//    public String getApellido2() {
//        return apellido2;
//    }
//
//    public void setApellido2(String apellido2) {
//        this.apellido2 = apellido2;
//    }
//
//    public String getCorreo1() {
//        return correo1;
//    }
//
//    public void setCorreo1(String correo1) {
//        this.correo1 = correo1;
//    }
//
//    public String getCorreo2() {
//        return correo2;
//    }
//
//    public void setCorreo2(String correo2) {
//        this.correo2 = correo2;
//    }
//
//    public String getCiudad() {
//        return ciudad;
//    }
//
//    public void setCiudad(String ciudad) {
//        this.ciudad = ciudad;
//    }
//
//    public String getProvincia() {
//        return provincia;
//    }
//
//    public void setProvincia(String provincia) {
//        this.provincia = provincia;
//    }
//
//    public String getNumeroTarjeta() {
//        return numeroTarjeta;
//    }
//
//    public void setNumeroTarjeta(String numeroTarjeta) {
//        this.numeroTarjeta = numeroTarjeta;
//    }
//
//    public String getCodigoSeguridad() {
//        return codigoSeguridad;
//    }
//
//    public void setCodigoSeguridad(String codigoSeguridad) {
//        this.codigoSeguridad = codigoSeguridad;
//    }
//
//    public String getCodigoPostal() {
//        return codigoPostal;
//    }
//
//    public void setCodigoPostal(String codigoPostal) {
//        this.codigoPostal = codigoPostal;
//    }
//
//    public carrito getCarrito() {
//        return carrito;
//    }
//
//    public void setCarrito(carrito carrito) {
//        this.carrito = carrito;
//    }
//    
//}
