/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MIPC
 */
public class Sistema {
    private List<Servicio> lstServicios = new ArrayList<>();
    
    public Servicio traerServicio(String codServicio){
        Servicio retorno = null;
        for (Servicio servicioEnLista : lstServicios) {
            if (servicioEnLista.getCodServicio().equals(codServicio)) {
                retorno = servicioEnLista;
            }
        }
        return retorno;
    }
    
    public List<Servicio> traerServicio(boolean promocion){
        List<Servicio> servicios = new ArrayList<>();
        for (Servicio servicioEnLista : lstServicios) {
            if (servicioEnLista.isEnPromocion() == promocion) {
                servicios.add(servicioEnLista);
            }
        }
        return servicios;
    }
    
    public List<Servicio> traerServicio(boolean enPromocion, LocalDate dia) {
        List<Servicio> servicios = new ArrayList<>();
        DayOfWeek diaSemana = dia.getDayOfWeek();
        for (Servicio servicioEnLista : lstServicios) {
            if(servicioEnLista instanceof Hospedaje){
                if (servicioEnLista.isEnPromocion() == enPromocion && diaSemana != DayOfWeek.SATURDAY && diaSemana != DayOfWeek.SUNDAY) {
                servicios.add(servicioEnLista);
            }} else{
                Gastronomia servicioG = (Gastronomia) servicioEnLista;
                if (servicioEnLista.isEnPromocion() == enPromocion && servicioG.getDiaSemDesc() == diaSemana.getValue()) {
                servicios.add(servicioEnLista);
            }}
        }
        return servicios;
    }
    
    public boolean agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, String gastronomia, double precio, int diaSemDesc) throws Exception{
        
        for (Servicio servicioEnLista : lstServicios) {
            if (servicioEnLista.getCodServicio().equals(codServicio)) {
                throw new Exception("Ya existe eso objeto en el sistema.");
            }
        }
        this.lstServicios.add(new Gastronomia(gastronomia, precio,diaSemDesc, codServicio,  porcentajeDescuento, enPromocion));
        return true;
    }
    public boolean agregarHospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje,double precioPorNoche) throws Exception{
        
        for (Servicio servicioEnLista : lstServicios) {
            if (servicioEnLista.getCodServicio().equals(codServicio)) {
                throw new Exception("Ya existe eso objeto en el sistema.");
            }
        }
        this.lstServicios.add(new Hospedaje(codServicio,hospedaje,precioPorNoche,porcentajeDescuento,enPromocion));
        return true;
    }
    
}
