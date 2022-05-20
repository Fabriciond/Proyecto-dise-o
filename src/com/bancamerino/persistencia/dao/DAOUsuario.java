package com.bancamerino.persistencia.dao;

import com.bancamerino.negocio.Usuario;
import com.bancamerino.persistencia.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Permite hacer cualquiera de las 4 operaciones (INSERT, UPDATE, DELETE y
 * SELECT) en la tabla usuario de la base de datos ingresada.
 *
 * @author Daniel Alexis Gonzalez Perez
 */
public class DAOUsuario {

    /**
     * Inserta el usuario ingresado en la tabla tbl_usuario de la base de datos.
     *
     * @param nuevoUsuario Nuevo usuario a ser insertado en la base de datos.
     * @return El estado de la operacion, si se ha realizado con exito retorna
     * TRUE, mientras que si falla retorna FALSE.
     */
    public boolean insertar(Usuario nuevoUsuario) {
        Conexion bd = new Conexion();

        if (bd.getConn() != null) {
            StringBuilder query = new StringBuilder();

            query.append("INSERT INTO tbl_usuario")
                    .append(" (nombre, correo, num_telefono, id_tarjeta) ")
                    .append(" VALUES (?,?,?,?)");

            try {
                PreparedStatement ps = bd.getConn().prepareStatement(query.toString());
                ps.setString(1, nuevoUsuario.getNombre());
                ps.setString(2, nuevoUsuario.getCorreo());
                ps.setString(3, nuevoUsuario.getNumTelefono());
                ps.setInt(4, nuevoUsuario.getTarjeta().getId());

                if (ps.execute()) {
                    return true;
                }
            } catch (SQLException err) {
                System.out.println(err.getMessage());
                return false;
            } finally {
                bd.cerrarConexion();
            }

        }
        return false;
    }

    /**
     * Edita el usuario en la tabla tbl_usuario de la base de datos con los
     * nuevos atributos obtenidos de la instancia usuarioActualizado.
     *
     * @param usuarioActualizado Usuario con los atributos actualizados.
     * @return El estado de la operacion, si se ha realizado con exito retorna
     * TRUE, mientras que si falla retorna FALSE.
     */
    public boolean editar(Usuario usuarioActualizado) {
        Conexion bd = new Conexion();
        if (bd.getConn() != null) {
            StringBuilder query = new StringBuilder();

            query.append("UPDATE tbl_usuario SET ")
                    .append("nombre = ?, correo = ?, num_telefono = ?, id_tarjeta = ?")
                    .append(" WHERE id = ?");

            try {
                PreparedStatement st = bd.getConn().prepareStatement(query.toString());

                st.setString(1, usuarioActualizado.getNombre());
                st.setString(2, usuarioActualizado.getCorreo());
                st.setString(3, usuarioActualizado.getNumTelefono());
                st.setInt(4, usuarioActualizado.getTarjeta().getId());

                if (st.executeUpdate() == 1) {
                    return true;
                }
            } catch (SQLException err) {
                System.out.println(err.getMessage());
                return false;
            } finally {
                bd.cerrarConexion();
            }
        }
        return false;
    }

    /**
     * Elimina el usuario en la tabla tbl_usuario de la base de datos con el
     * mismo id ingresado.
     *
     * @param id Id de usuario a eliminar.
     * @return El estado de la operacion, si se ha realizado con exito retorna
     * TRUE, mientras que si falla retorna FALSE.
     */
    public boolean eliminar(int id) {
        Conexion bd = new Conexion();
        try {
            if (bd.getConn() != null) {
                StringBuilder query = new StringBuilder();
                query.append("DELETE FROM tbl_usuario ")
                        .append("WHERE id = ?");

                PreparedStatement st = bd.getConn().prepareStatement(query.toString());
                st.setInt(1, id);

                if (st.executeUpdate() == 1) {
                    return true;
                }
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
            return false;
        } finally {
            bd.cerrarConexion();
        }
        return false;
    }

    public List<Usuario> obtener() {
        Conexion bd = new Conexion();
        List<Usuario> arrUsuarios = new ArrayList();
        try {

            if (bd.getConn() != null) {
                StringBuilder query = new StringBuilder();

                query.append(" SELECT * FROM tbl_actor; ");
                PreparedStatement st = bd.getConn().prepareStatement(query.toString());

                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    Usuario usuarioObtenido = new Usuario();

                }
            }

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        } finally {
            bd.cerrarConexion();
        }
        return arrUsuarios;
    }
}
