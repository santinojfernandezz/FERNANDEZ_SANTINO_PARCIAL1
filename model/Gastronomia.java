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
public class Gastronomia extends Servicio{
    String gastronomia;
    double precio;
    int diaSemDesc;

    public Gastronomia(String gastronomia, double precio, int diaSemDesc, String codServicio, double porcentajeDescuento, boolean enPromocion) throws Exception {
        super(codServicio, porcentajeDescuento, enPromocion);
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.diaSemDesc = diaSemDesc;
    }

    @Override
    public double calcularPrecioFinal(LocalDate dia) {
        DayOfWeek diaSemana = dia.getDayOfWeek();
        double costo = this.precio;
        if (this.enPromocion && diaSemana.getValue() == this.diaSemDesc) {
            costo =  (1 - porcentajeDescuento / 100) * this.precio;
        }
        return costo;
    
    }

    public int getDiaSemDesc() {
        return diaSemDesc;
    }

    @Override
    public String toString() {
        return "Gastronomia{" + "codServicio=" + codServicio + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion= "+ enPromocion + "gastronomia=" + gastronomia + ", precio=" + precio + ", diaSemDesc=" + diaSemDesc + '}';
    }

}
