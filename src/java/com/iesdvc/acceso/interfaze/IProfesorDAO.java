/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesdvc.acceso.interfaze;

import com.iesvdc.acceso.pojo.Profesor;
import java.util.List;

/**
 *
 * @author matinal
 */
public interface IProfesorDAO {
    
    List<Profesor> listaProfesores();
    boolean insertarProfesor(Profesor profesor);
    boolean actualizarProfesor(Profesor profesor);
    boolean borrarProfesor(Profesor profesor);
}
