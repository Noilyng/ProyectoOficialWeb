///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.Tarea.entity;
////Patron decorador que se va a comportar como una identidad...
//
//
//import java.io.Serializable;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
////en nuestra tabla faq
////@Table(name = "faq")
//public class faq implements Serializable { //serializable es darle formato al objeto
//
//    @Id //indica que el atributo id es el id de nuestra tabla 
//    @GeneratedValue(strategy = GenerationType.IDENTITY)//que el id es incremental
//
//    //atributos
//    private long id;
//    private String pregunta;
//    private String respuesta;
//    
//    //getter and setter
//
//    public long getId() {
//        return id;
//}
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getPregunta() {
//        return pregunta;
//    }
//
//    public void setPregunta(String pregunta) {
//        this.pregunta = pregunta;
//    }
//
//    public String getRespuesta() {
//        return respuesta;
//    }
//
//    public void setRespuesta(String respuesta) {
//        this.respuesta = respuesta;
//    }
//    
//}
