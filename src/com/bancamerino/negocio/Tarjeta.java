package com.bancamerino.negocio;

import java.util.List;

/**
 * Clase con los atributos requeridos para la creacion de una tarjeta valida en el sistema.
 * @author Daniel Alexis Gonzalez Perez
 */
public class Tarjeta {

    private int id;
    private int numTarjeta;
    private int limiteCredito;
    private List<Periodo> periodos;

    /**
     * Obtiene el id de la tarjeta.
     * @return El id de la tarjeta.
     */
    public int getId() {
        return id;
    }

    /**
     * Coloca el id ingresado en el atributo correspondiente de la tarjeta.
     * @param id El id a colocar.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el numero de tarjeta.
     * @return El numero de tarjeta.
     */
    public int getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Coloca el numero de tarjeta ingresado en el atributo correspondiente de la tarjeta.
     * @param numTarjeta El numero de tarjeta a colocar.
     */
    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    /**
     * Obtiene el limite de credito que tiene la tarjeta.
     * @return el limite de credito
     */
    public int getLimiteCredito() {
        return limiteCredito;
    }

    /**
     * Coloca el limite de credito ingresado en el atributo correspondiente de la tarjeta.
     * @param limiteCredito El limite de credito en la tarjeta.
     */
    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    /**
     * Obtiene los periodos de la tarjeta.
     * @return Los periodos de la tarjeta.
     */
    public List<Periodo> getPeriodos() {
        return periodos;
    }

    /**
     * Coloca los periodos ingresados en el atributo correspondiente de la tarjeta.
     * @param periodos Los periodos a colocar.
     */
    public void setPeriodos(List<Periodo> periodos) {
        this.periodos = periodos;
    }

    
}
