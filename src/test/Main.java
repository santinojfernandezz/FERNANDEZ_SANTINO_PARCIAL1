
package test;

import java.time.LocalDate;
import java.time.Month;
import model.Sistema;
import model.Gastronomia;
import model.Hospedaje;
import model.Servicio;

public class Main {
    
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        System.out.println("1-1");
        try{
            //Gastronomia(String gastronomia, double precio, int diaSemDesc, String codServicio, double porcentajeDescuento, boolean enPromocion)
            Gastronomia gastronomiaUno = new Gastronomia("Hamburguesa criolla", 180.0, 4, "4892", 15.0, true);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("1-2");
        try{
            Gastronomia gastronomiados = new Gastronomia("Hamburguesa criolla", 180.0, 4, "489235", 15.0, true);
            System.out.println("exito");
            System.out.println("2-1");
            System.out.println(gastronomiados.calcularPrecioFinal(LocalDate.of(2024, Month.OCTOBER, 17)));
            
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("1-3");
        try{
            //Hospedaje( String codServicio, String hospedaje, double precioPorNoche,double porcentajeDescuento, boolean enPromocion)
            Hospedaje hospedajeUno = new Hospedaje("2871", "Cabaña 3 personas", 1500.0, 10.0, true);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("1-4");
        try{
            Hospedaje hospedajeDos = new Hospedaje("287282", "Cabaña 3 personas", 1500.0, 10.0, true);
            System.out.println("exitoooo");
            System.out.println("2-2");
            System.out.println(hospedajeDos.calcularPrecioFinal(LocalDate.of(2024, Month.OCTOBER, 12)));
            System.out.println(hospedajeDos.calcularPrecioFinal(LocalDate.now()));
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{
            System.out.println("3");
            boolean g1 = sistema.agregarGastronomia("858927", 15.0, true, "Milanesa con puré", 350.0, 3);
            boolean h1 = sistema.agregarHospedaje("489259", 10.0, true, "Habitación triple", 2200.0);
            boolean g2 = sistema.agregarGastronomia("182835", 20.0, false, "Gaseosa", 120.0, 3);
            boolean h2 = sistema.agregarHospedaje("758972", 15.0, false, "Habitación simple", 1000.0);
            System.out.println(sistema.traerServicio("858927"));
            System.out.println(sistema.traerServicio("489259"));
            System.out.println(sistema.traerServicio("182835"));
            System.out.println(sistema.traerServicio("758972"));
            System.out.println("4-1");
            System.out.println(sistema.traerServicio(true));
            
            System.out.println("4-2");
            System.out.println(sistema.traerServicio(true, LocalDate.now()));
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}

