/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * version 1.0
 * @author cass465
 * 2/3/2018
 */
public class Producto {
    public String nombre = "";
    public int precioUnidad = 0;
    public int cantidadInicial = 0;
    
    public int cantidadFinal = 0;
    public int cantidadVendidaTotal = 0;
    public int totalGanancias = 0;
    public double porcentajeVentas = 0;
    public double porcentajeGanancias = 0;
    
    Producto(){
        
    }
    
    Producto(String nombre, int precioUnidad, int cantidadInicial){
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.cantidadInicial = cantidadInicial;
        this.cantidadFinal = cantidadInicial;
    }
    public int ingresarUnidades(int unidades){
        this.cantidadFinal+=unidades;
        return this.cantidadFinal;
    }
    public int calcularGanancias(){
        this.cantidadVendidaTotal++;
        this.totalGanancias = this.cantidadVendidaTotal*this.precioUnidad;
        this.cantidadFinal--;
        return this.totalGanancias;
    }
    public double calcularPorcentajeVentas(){
        this.porcentajeVentas = (this.cantidadVendidaTotal*100)/(this.cantidadFinal+this.cantidadVendidaTotal);
        return this.porcentajeVentas;
    }
    public double calcularPorcentajeGanancias(){
        this.porcentajeGanancias = (this.totalGanancias*100)/((this.cantidadFinal+this.cantidadVendidaTotal)*this.precioUnidad);
        return this.porcentajeGanancias;
    }
    public int cantidadInicialProductosNuevos(int cantidadInicial){
        this.cantidadFinal = cantidadInicial;
        return this.cantidadFinal;
    }
    public String consultarInforme(){
        String respuesta;
        respuesta="\n----------------------------------\n";
        respuesta+="\nNOMBRE DEL PRODUCTO: "+this.nombre;
        respuesta+="\nPRECIO POR UNIDAD: "+this.precioUnidad;
        respuesta+="\nCANTIDAD INICIAL: "+this.cantidadInicial;
        respuesta+="\nCANTIDAD FINAL: "+this.cantidadFinal;
        respuesta+="\nCANTIDAD DE VENTAS: "+this.cantidadVendidaTotal;
        respuesta+="\nGANANCIAS: "+this.totalGanancias;
        respuesta+="\nPORCENTAJE DE VENTAS: "+this.porcentajeVentas+"%";
        respuesta+="\nPORCENTAJE DE GANANCIAS: "+this.porcentajeGanancias+"%";
        respuesta+="\n----------------------------------\n";
        return respuesta;
    }
}
