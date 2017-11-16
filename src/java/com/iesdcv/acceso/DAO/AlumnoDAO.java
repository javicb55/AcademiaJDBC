/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesdcv.acceso.DAO;

import com.iesdvc.acceso.interfaze.DAOException;
import com.iesdvc.acceso.interfaze.IAlumnoDAO;
import com.iesvdc.acceso.pojo.Alumno;

/**
 *
 * @author matinal
 */
public class AlumnoDAO implements IAlumnoDAO{

    @Override
    public void create(Alumno alumno) throws DAOException {
        throw new DAOException("Error al crear un alumno");
    }

    @Override
    public void read(Alumno alumno) throws DAOException {
        throw new DAOException("Error al leer un alumno");
    }

    @Override
    public void update(Alumno alumno) throws DAOException {
        throw new DAOException("Error al actualizar un alumno");
    }

    @Override
    public void remove(Alumno alumno) throws DAOException {
        throw new DAOException("Error al eliminar un alumno");
    }
    
}
