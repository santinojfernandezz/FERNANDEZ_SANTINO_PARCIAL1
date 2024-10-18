/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author MIPC
 */
public abstract class Servicio {
    String codServicio;
    double porcentajeDescuento;
    boolean enPromocion;

    public Servicio(String codServicio, double porcentajeDescuento, boolean enPromocion) throws Exception{
        if (codServicio.length() != 6){
            throw new Exception("El codigo no contiene 6 caracteres por lo que es invalido.");
        }
        this.codServicio = codServicio;
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
    }
    public abstract double calcularPrecioFinal(LocalDate dia);

    
    
    public String getCodServicio() {
        return codServicio;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }
    
}
