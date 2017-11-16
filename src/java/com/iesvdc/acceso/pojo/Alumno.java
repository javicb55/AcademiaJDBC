/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvdc.acceso.pojo;

/**
 *
 * @author matinal
 */
public class Alumno {
    
    private int id;
    private String nombre;
    private String apellido;

    //Contructores
    public Alumno() {
    }
    
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    
    //Getters
    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    //Setters
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setId(int id) {
        this.id = id;
    }

   
    
    
    
}
