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
    
    public int cantidadTotal = 0;
    public int cantidadVendida = 0;
    public int cantidadVendidaTotal = 0;
    public int ganancias = 0;
    public int totalGanancias = 0;
    public int porcentajeVentas = 0;
    public int porcentajeGanancias = 0;
    
    Producto(){
        
    }
    Producto(String nombre, int precioUnidad, int cantidadInicial){
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.cantidadInicial = cantidadInicial;
        this.cantidadTotal = cantidadInicial;
    }
    public int ingresarUnidades(int unidades){
        this.cantidadTotal+=unidades;
        return this.cantidadTotal;
    }
    public int calcularGanancias(){
        this.cantidadVendidaTotal++;
        this.ganancias = this.cantidadVendidaTotal*this.precioUnidad;
        this.totalGanancias+=this.ganancias;
        this.cantidadTotal--;
        return this.totalGanancias;
    }
    public int porcentajeVentas(){
        this.porcentajeVentas = (this.cantidadVendidaTotal*100)/this.cantidadTotal;
        return this.porcentajeVentas;
    }
    public int porcentajeGanancias(){
        this.porcentajeGanancias = (this.totalGanancias*100)/(this.cantidadTotal*this.precioUnidad);
        return this.porcentajeGanancias;
    }
    public String consultarInforme(){
        String respuesta;
        respuesta="\n----------------------------------\n";
        respuesta+="\nNOMBRE DEL PRODUCTO: "+this.nombre;
        respuesta+="\nPRECIO POR UNIDAD: "+this.precioUnidad;
        respuesta+="\nCANTIDAD INICIAL: "+this.cantidadInicial;
        respuesta+="\nCANTIDAD TOTAL: "+this.cantidadTotal;
        respuesta+="\nCANTIDAD DE VENTAS: "+this.cantidadVendidaTotal;
        respuesta+="\nGANANCIAS: "+this.totalGanancias;
        respuesta+="\nPORCENTAJE DE VENTAS: "+this.porcentajeVentas+"%";
        respuesta+="\nPORCENTAJE DE GANANCIAS: "+this.porcentajeGanancias+"%";
        respuesta+="\n----------------------------------\n";
        return respuesta;
    }
}
