
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
//en nuestra tabla factura
@Table(name = "factura")
public class factura implements Serializable { //serializable es darle formato al objeto

    @Id //indica que el atributo id es el id de nuestra tabla 
    @GeneratedValue(strategy = GenerationType.IDENTITY)//que el id es incremental

    //atributos
    private long id;
    private String nombreTienda;
    private String correoTienda;
    private String numeroTienda;
    private String redTienda;
    private String fecha;
    
    //relacion de 1 a n entre la tabla usuario compra y factura
    @ManyToOne
    //FK
    @JoinColumn(name ="UsuarioCompra_id")
    //objeto de tipo UsuarioCompra
    private usuarioCompra UsuarioCompra;

    //getter and setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getCorreoTienda() {
        return correoTienda;
    }

    public void setCorreoTienda(String correoTienda) {
        this.correoTienda = correoTienda;
    }

    public String getNumeroTienda() {
        return numeroTienda;
    }

    public void setNumeroTienda(String numeroTienda) {
        this.numeroTienda = numeroTienda;
    }

    public String getRedTienda() {
        return redTienda;
    }

    public void setRedTienda(String redTienda) {
        this.redTienda = redTienda;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public usuarioCompra getUsuarioCompra() {
        return UsuarioCompra;
    }

    public void setUsuarioCompra(usuarioCompra UsuarioCompra) {
        this.UsuarioCompra = UsuarioCompra;
    }
    
    
}
