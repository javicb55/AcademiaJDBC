/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesdvc.acceso.interfaze;


import com.iesvdc.acceso.pojo.Asignaturas;
import java.util.List;

/**
 *
 * @author matinal
 */
public interface IAsignaturasDAO {
    
    List<Asignaturas> listaAsignaturas();
    boolean insertarAsignaturas(Asignaturas asignaturas);
    
    boolean actualizarAsignaturas(Asignaturas asignaturas);
    
    boolean borrarAsignaturas(Asignaturas asignaturas);
}
    

