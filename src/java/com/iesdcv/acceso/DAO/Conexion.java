/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesdcv.acceso.DAO;

import com.iesdvc.acceso.interfaze.DAOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matinal
 */
public class Conexion {
   
    public Properties props;
    public Integer driver;
    public String host;
    public String puerto;
    public String base_datos;
    public String usuario;
    public String password;

    public static final int ORACLE=1;
    public static final int MYSQL=2;
    public static final int DERBY=3;
    public static final int POSTGRE=4;


    
    public Conexion() throws DAOException {
        
        try (InputStream in = new FileInputStream(new File ("db.prop") ))
        {
            // Looks for properties file in the root of the src directory in Netbeans project
            props.load(in);
            in.close();
        } catch (IOException ex) {
            throw new DAOException("Conxion : No puedo cargar al archivo de configuración");
        } 
        
        loadProperties();
    }
    
    
    Connection getConexion() throws DAOException{
        
        Connection con = null;
        String jdbcUrl = null;
        
        switch(driver){
            case ORACLE:
                jdbcUrl = "jdbc:oracle:thin:@" + this.host + ":" + 
                            this.puerto  + ":" + this.base_datos;
                break;
            case MYSQL:
                jdbcUrl = "jdbc:mysql://" + this.host + ":" + 
                            this.puerto  + ":" + this.base_datos;
                break;
            case DERBY:
                break;
            case POSTGRE:
                break;
        }
        try {
            con = DriverManager.getConnection(jdbcUrl, usuario, password);
        } catch (SQLException ex) {
            throw new DAOException("Conexion: no se puede conectar a la base de datos");
        }
        return con;
    }
    
    
    
    /*
    Conexion(int driver) throws DAOException{
        switch(driver){
            case ORACLE:
                break;
            case MYSQL:
                break;
            case DERBY:
                break;
            case POSTGRE:
                break;
                
            default:
                throw new DAOException("El driver seleccionado no está disponible");
        }   
    }*/
    
    void loadProperties(){
        this.base_datos= props.getProperty("base_datos");
        this.driver    = new Integer(props.getProperty("driver"));
                            // Integer.parseInt(host)
        this.host      = props.getProperty("host");
        this.password  = props.getProperty("password");
        this.usuario   = props.getProperty("usuario");
        this.puerto    = props.getProperty("puerto");
    }
}
