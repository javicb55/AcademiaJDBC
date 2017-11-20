/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesdcv.acceso.DAO;

import com.iesdvc.acceso.interfaze.DAOException;
import com.iesdvc.acceso.interfaze.IAlumnoDAO;
import com.iesvdc.acceso.pojo.Alumno;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matinal
 */
public class AlumnoDAO implements IAlumnoDAO{

    Conexion conex;
    private Connection obtenerConexion() throws DAOException{
        if(conex==null){
            conex = new Conexion();
        }
        return conex.getConexion();
    }
    
    @Override
    public void create(Alumno alumno) throws DAOException {
        Conexion conex = new Conexion();
        Connection con = conex.getConexion();
        try {
            con.close();
        } catch (SQLException ex) {
           throw new DAOException("Base de datos error al crear");
        }
        
    }


    @Override
    public void update(Alumno old_al, Alumno new_al) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Integer old_al, Alumno new_al) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Alumno alumno) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Alumno> findAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno findById(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Alumno> findByNombre(String nombre) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Alumno> findByApellido(String apellido) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
