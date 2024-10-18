/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author MIPC
 */
public class Hospedaje extends Servicio{
    String hospedaje;
    double precioPorNoche;

    public Hospedaje( String codServicio, String hospedaje, double precioPorNoche,double porcentajeDescuento, boolean enPromocion) throws Exception {
        super(codServicio, porcentajeDescuento, enPromocion);
        this.hospedaje = hospedaje;
        this.precioPorNoche = precioPorNoche;
    }
    

    @Override
    public double calcularPrecioFinal(LocalDate dia){
        double costoFinal = this.precioPorNoche;
        DayOfWeek diaSemana = dia.getDayOfWeek();
        if (this.enPromocion && diaSemana != DayOfWeek.SATURDAY && diaSemana != DayOfWeek.SUNDAY) {
            double descuento = (this.porcentajeDescuento / 100 ) * this.precioPorNoche;
            costoFinal -=  descuento;
        } 
        return costoFinal;
    }

    @Override
    public String toString() {
        
        return "Hospedaje{" +  " odServicio=" + codServicio + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion= "+ enPromocion + ", hospedaje= " + hospedaje + ", precioPorNoche=" + precioPorNoche + '}';
    }
    
}
