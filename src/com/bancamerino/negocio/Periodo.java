package com.bancamerino.negocio;

import java.sql.Date;
import java.util.List;

/**
 * Clase que contiene todo el historial de operaciones hecho en un periodo de 30 dias.
 * @author Daniel Alexis Gonzalez Perez
 */
public class Periodo {
    private List<Operacion> operaciones;
    private Date fechaInicio;
    private Date fechaFinal;

    /**
     * Obtiene las operaciones hechas en el plazo del periodo.
     * @return Las operaciones del periodo.
     */
    public List<Operacion> getOperaciones() {
        return operaciones;
    }

    /**
     * Coloca las operaciones ingresadas al periodo.
     * @param operaciones Las operaciones a colocar.
     */
    public void setOperaciones(List<Operacion> operaciones) {
        this.operaciones = operaciones;
    }

    /**
     * Obtiene la fecha en la que inicia el periodo.
     * @return La fecha inicial del periodo.
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Coloca la fecha inicial del periodo.
     * @param fechaInicio la fecha inicial a colocar.
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Obtiene la fecha en la que termina el periodo.
     * @return La fecha final del periodo.
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Coloca la fecha final del periodo.
     * @param fechaFinal La fecha final a colocar.
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

}
