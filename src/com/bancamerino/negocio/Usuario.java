package com.bancamerino.negocio;

/**
 * Clase con los atributos requeridos para crear un usuario valido en el sistema.
 * @author Daniel Alexis Gonzalez Perez
 */
public class Usuario {

    private int id;
    private String nombre;
    private String correo;
    private String numTelefono;
    private Tarjeta tarjeta;

    /**
     * Obtiene el id del usuario.
     * @return id de usuario en la base de datos.
     */
    public int getId() {
        return id;
    }

    /**
     * Coloca el id ingresado en el atributo correspondiente del usuario.
     * @param id el id a colocar.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre de usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Coloca el nombre ingresado en el atributo correspondiente del usuario.
     * @param nombre el nombre a colocar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el correo del usuario.
     * @return el correo del usuario.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Coloca el correo ingresado en el atributo correspondiente del usuario.
     * @param correo El correo a colocar.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la tarjeta del usuario.
     * @return La tarjeta del usuario.
     */
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    /**
     * Coloca la tarjeta ingresada en el atributo correspondiente del usuario.
     * @param tarjeta La tarjeta a colocar.
     */
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * Obtiene el numero de telefono del usuario.
     * @return El numero de telefono del usuario.
     */
    public String getNumTelefono() {
        return numTelefono;
    }

    /**
     * Coloca el numero de telefono ingresado en el atributo correspondiente del usuario.
     * @param numTelefono El numero de telefono a colocar.
     */
    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
    
    

}
