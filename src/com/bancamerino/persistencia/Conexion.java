package com.bancamerino.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Conecta y permite hacer los 4 tipo de operaciones a la base de datos: INSERT, UPDATE, SELECT y DELETE
 * @author Daniel Alexis Gonzalez Perez
 */
public class Conexion {

    private String url = "jdbc:mysql://localhost/bd_isw_academy" ;
    private String user = "root";
    private String contrasena = "";
    private Connection conn = null;
    private String error = new String();
    
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, user, contrasena);
        } catch (Exception e) {
            this.error = e.getMessage();
        }
    }
    
    /**
     * Cierra la conexion con la base de datos.
     */
    public void cerrarConexion() {
        try {
            conn.close();
        } catch (SQLException e) {
            this.error = e.getMessage();
        }
    }
    
    public Conexion(String url, String user, String contrasena) {
        this.url = url;
        this.user = user;
        this.contrasena = contrasena;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, user, contrasena);
        } catch (Exception e) {
            this.error = e.getMessage();
        }
    }

    /**
     * Obtiene la conexion a la base de datos creada.
     * @return Conexion a la base de datos.
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * Coloca la nueva conexion ingresada.
     * @param conn Conexion a la base de datos a colocar.
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * Obtiene un mensaje de error si sucede alguno en el proceso de conexion.
     * @return Mensaje de error.
     */
    public String getError() {
        return error;
    }

    /**
     * Coloca el error ingresado.
     * @param error El error a colocar.
     */
    public void setError(String error) {
        this.error = error;
    }

}
