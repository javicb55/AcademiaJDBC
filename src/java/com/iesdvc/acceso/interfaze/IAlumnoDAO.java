/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesdvc.acceso.interfaze;

import com.iesvdc.acceso.pojo.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matinal
 */
public interface IAlumnoDAO {
    
   public void create(Alumno alumno) throws DAOException;
   //Pando un alumno o un id
   public void update(Alumno old_al, Alumno new_al) throws DAOException;
   public void update(Integer old_al, Alumno new_al) throws DAOException;
   
   //Pando un alumno o un id
   public void delete(Alumno alumno) throws DAOException;
   public void delete(Integer id) throws DAOException;
   
   //Encontrar datos
   public ArrayList<Alumno> findAll() throws DAOException;
   public Alumno findById(Integer id) throws DAOException;
   public ArrayList<Alumno> findByNombre(String nombre) throws DAOException;
   public ArrayList<Alumno> findByApellido(String apellido) throws DAOException;


   
    
}
