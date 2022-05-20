/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancamerino.presentacion;


import com.bancamerino.negocio.Operacion;
import com.bancamerino.negocio.Periodo;
import com.bancamerino.negocio.Tarjeta;
import com.bancamerino.negocio.Usuario;
import com.bancamerino.negocio.enumeradores.TipoOperacion;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cmnd_
 */
public class Main {

    public static void main(String[] args) {
        Usuario uuario1 = new Usuario();

        uuario1.setId(1);
        uuario1.setNombre("Airam Daniela Pimentel");
        uuario1.setCorreo("airamdaniela@gmail.com");
        uuario1.setNumTelefono("622109132");

        Tarjeta tarjeta1 = new Tarjeta();

        tarjeta1.setId(12345);
        tarjeta1.setLimiteCredito(12000);
        tarjeta1.setNumTarjeta(4579658);

        List<Periodo> periodos = new ArrayList();
  
        Periodo mayoJunio = new Periodo();

        mayoJunio.setFechaInicio(Date.valueOf("2022-05-01"));
        mayoJunio.setFechaFinal(Date.valueOf("2022-06-01"));

        List<Operacion> operaciones = new ArrayList();

        Operacion operacion1 = new Operacion();
        //-------------------------------------------------------------
        operacion1.setConcepto("Coppel");
        operacion1.setFecha(Date.valueOf("2022-05-18"));
        operacion1.setId(136);
        operacion1.setMonto(980);
        operacion1.setTipo(TipoOperacion.CARGO);
        operaciones.add(operacion1);
        //-------------------------------------------------------------
        Operacion operacion2 = new Operacion();
        operacion2.setConcepto("Compras Walmart");
        operacion2.setFecha(Date.valueOf("2022-05-19"));
        operacion2.setId(137);
        operacion2.setMonto(250);
        operacion2.setTipo(TipoOperacion.CARGO);
        operaciones.add(operacion2);
        //-------------------------------------------------------------
        Operacion operacion3 = new Operacion();
        operacion3.setConcepto("Netflix");
        operacion3.setFecha(Date.valueOf("2022-05-28"));
        operacion3.setId(138);
        operacion3.setMonto(100);
        operacion3.setTipo(TipoOperacion.CARGO);
        operaciones.add(operacion3);

        mayoJunio.setOperaciones(operaciones);
        periodos.add(mayoJunio);
        tarjeta1.setPeriodos(periodos);
        uuario1.setTarjeta(tarjeta1);
        System.out.println("----------Datos del cliente----------" + "\n"
                + "Nombre: " + uuario1.getNombre() + "\n"
                + "Correro Electronico: " + uuario1.getCorreo() + "\n"
                + "Numero de telefono: " + uuario1.getNumTelefono() + "\n"
                + "ID: " + uuario1.getId() + "\n"
                + "----------Datos de la tarjeta----------" + "\n"
                + "ID de la tarjeta: " + uuario1.getTarjeta().getId() + "\n"
                + "Numero de tarjeta: " + uuario1.getTarjeta().getNumTarjeta() + "\n"
                + "Limite de credito: " + uuario1.getTarjeta().getLimiteCredito() + "\n"
        );

        for (Periodo periodo : uuario1.getTarjeta().getPeriodos()) {

            System.out.println("----------Datos Periodo----------" + "\n"
                    + "Fecha inicio: " + periodo.getFechaInicio() + "\n"
                    + "Fecha corte: " + periodo.getFechaFinal()
            );

            List<Operacion> operaciones1 = periodo.getOperaciones();
            for (Operacion operacione : operaciones1) {
                System.out.println("Concepto: " + operacione.getConcepto() + "\n" + "Monto: " + operacione.getMonto() + "\n" + "Tipo:"
                        + operacione.getTipo() + "\n"
                        + "Fecha: " + operacione.getFecha()
                );
            }

        }

    }
}
