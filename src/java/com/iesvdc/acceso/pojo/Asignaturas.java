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
public class Asignaturas {
    
    private int id;
    private String nombre;
    private int smallInt;
    private String ciclo;

    //Constructores
    public Asignaturas() {
    }

    public Asignaturas(int id, String nombre, int smallInt, String ciclo) {
        this.id = id;
        this.nombre = nombre;
        this.smallInt = smallInt;
        this.ciclo = ciclo;
    }
    
    //Setters y Getters 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSmallInt() {
        return smallInt;
    }

    public void setSmallInt(int smallInt) {
        this.smallInt = smallInt;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    
}
