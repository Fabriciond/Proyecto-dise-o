package com.bancamerino.negocio;

import com.bancamerino.negocio.enumeradores.TipoOperacion;
import java.sql.Date;

/**
 * Clase que contiene la informacion de operaciones hechas por un usuario con su tarjeta.
 * @author Daniel Alexis Gonzalez Perez
 */
public class Operacion {

    private int id;
    private Date fecha;
    private double monto;
    private String concepto;
    private TipoOperacion tipo;

    /**
     * Obtiene el id de la operacion.
     * @return el id de la operacion.
     */
    public int getId() {
        return id;
    }

    /**
     * Coloca el id de la operacion.
     * @param id El id de la operacion a colocar.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha en la que se realizo la operacion.
     * @return La fecha en la que se realizo la operacion.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Coloca la fecha en la que se realizo la operacion.
     * @param fecha La fecha a colocar.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el monto de dinero que se gasto en dicha operacion.
     * @return El monto de dinero gastado de la operacion.
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Coloca el monto de dinero gastado en la operacion.
     * @param monto El monto de dinero a colocar.
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * Obtiene el concepto de la operacion.
     * @return El concepto de la operacion.
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Coloca el concepto de la operacion.
     * @param concepto el concepto de la operacion a colocar.
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * Obtiene el tipo de operacion.
     * @return El tipo de operacion.
     */
    public TipoOperacion getTipo() {
        return tipo;
    }

    /**
     * Coloca el tipo de operacion.
     * @param tipo Tipo de operacion a colocar.
     */
    public void setTipo(TipoOperacion tipo) {
        this.tipo = tipo;
    }

    
}
