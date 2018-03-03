/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;
/**
 * version 1.0
 * 2/3/2018
 * @author cass465
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcionMenuPrincipal,productos,escojerProducto,unidades;
        productos = 4;
        Scanner leer = new Scanner(System.in);
        Producto p1 = new Producto("MARGARITA",2000,30);
        Producto p2 = new Producto("GALLETAS",1000,10);
        Producto p3 = new Producto("CHEETOS",2000,10);
        Producto p4 = new Producto("CHOCORAMO",1500,20);
        Producto p5 = new Producto();
        Producto p6 = new Producto();
        //System.out.println(p5.nombre);
        
        do{
            System.out.println("DISPENSADOR DE PRODUCTOS");
            System.out.println("1. COMPRAR");
            System.out.println("2. CONSULTAR INFORME");
            System.out.println("3. INGRESAR UNIDADES A UN PRODUCTO");
            if(productos == 4 || productos == 5){
                System.out.println("4. INGRESAR UN PRODUCTO");
            }
            if(productos == 4){
                System.out.println("5. INGRESAR 2 PRODUCTOS");
            }
            System.out.println("0. SALIR");
            opcionMenuPrincipal = leer.nextInt();
            if(productos == 5 && opcionMenuPrincipal == 5){
                opcionMenuPrincipal+=3;
            }
            if(productos == 6 &&(opcionMenuPrincipal == 4 || opcionMenuPrincipal == 5)){
                opcionMenuPrincipal+=3; 
            }
            switch(opcionMenuPrincipal){
                case 1:
                    System.out.println("ESCOJA EL PRODUCTO QUE QUIERE COMPRAR");
                    System.out.println("1. MARGARITA");
                    System.out.println("2. GALLETAS");
                    System.out.println("3. CHEETOS");
                    System.out.println("4. CHOCORAMO");
                    if(!"".equals(p5.nombre)){
                        System.out.println(p5.nombre);
                    }
                    if(!"".equals(p6.nombre)){
                        System.out.println(p6.nombre);
                    }
                    //leer
                    escojerProducto = leer.nextInt();
                    //validar
                    if("".equals(p5.nombre)){
                        escojerProducto+=2;
                    }
                    if("".equals(p6.nombre)){
                        escojerProducto+=2;
                    }
                    //switch
                    switch(escojerProducto){
                        case 1:
                            p1.calcularGanancias();
                            System.out.println("PAPAS MARGARITA COMPRADAS POR: $"+p1.precioUnidad);
                            break;
                        case 2:
                            p2.calcularGanancias();
                            System.out.println("GALLETAS COMPRADAS POR: $"+p2.precioUnidad);
                            break;
                        case 3:
                            p3.calcularGanancias();
                            System.out.println("CHEETOS COMPRADOS POR: $"+p3.precioUnidad);
                            break;
                        case 4:
                            p4.calcularGanancias();
                            System.out.println("CHOCORAMO COMPRADO POR: $"+p4.precioUnidad);
                            break;
                        case 5:
                            p5.calcularGanancias();
                            System.out.println(p5.nombre+" COMPRADO POR: $"+p5.precioUnidad);
                            break;
                        case 6:
                            p6.calcularGanancias();
                            System.out.println(p6.nombre+" COMPRADO POR: $"+p6.precioUnidad);
                            break;
                        default:
                           System.out.println("OPCION INVALIDA"); 
                    }
                    break;
                case 2:
                    System.out.println(p1.consultarInforme());
                    System.out.println(p2.consultarInforme());
                    System.out.println(p3.consultarInforme());
                    System.out.println(p4.consultarInforme());
                    System.out.println(p5.consultarInforme());
                    System.out.println(p6.consultarInforme());
                    break;
                case 3:
                    System.out.println("ESCOJA EL PRODUCTO AL QUE DESEA INGRESAR UNIDADES");
                    System.out.println("1. MARGARITA");
                    System.out.println("2. GALLETAS");
                    System.out.println("3. CHEETOS");
                    System.out.println("4. CHOCORAMO");
                    if(!"".equals(p5.nombre)){
                        System.out.println(p5.nombre);
                    }
                    if(!"".equals(p6.nombre)){
                        System.out.println(p6.nombre);
                    }
                    //leer
                    escojerProducto = leer.nextInt();
                    //validar
                    if("".equals(p5.nombre)){
                        escojerProducto+=2;
                    }
                    if("".equals(p6.nombre)){
                        escojerProducto+=2;
                    }
                    //switch
                    switch(escojerProducto){
                        case 1:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p1.nombre);
                            unidades = leer.nextInt();
                            while(unidades<0 || unidades>10){
                                System.out.println("CANTIDAD INVALIDA");
                                unidades = leer.nextInt();
                            }
                            p1.ingresarUnidades(unidades);
                            break;
                        case 2:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p2.nombre);
                            unidades = leer.nextInt();
                            while(unidades<0 || unidades>10){
                                System.out.println("CANTIDAD INVALIDA");
                                unidades = leer.nextInt();
                            }
                            p2.ingresarUnidades(unidades);
                            break;
                        case 3:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p3.nombre);
                            unidades = leer.nextInt();
                            while(unidades<0 || unidades>10){
                                System.out.println("CANTIDAD INVALIDA");
                                unidades = leer.nextInt();
                            }
                            p3.ingresarUnidades(unidades);
                            break;
                        case 4:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p4.nombre);
                            unidades = leer.nextInt();
                            while(unidades<0 || unidades>10){
                                System.out.println("CANTIDAD INVALIDA");
                                unidades = leer.nextInt();
                            }
                            p4.ingresarUnidades(unidades);
                            break;
                        case 5:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p5.nombre);
                            unidades = leer.nextInt();
                            while(unidades<0 || unidades>10){
                                System.out.println("CANTIDAD INVALIDA");
                                unidades = leer.nextInt();
                            }
                            p5.ingresarUnidades(unidades);
                            break;
                        case 6:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p6.nombre);
                            unidades = leer.nextInt();
                            while(unidades<0 || unidades>10){
                                System.out.println("CANTIDAD INVALIDA");
                                unidades = leer.nextInt();
                            }
                            p6.ingresarUnidades(unidades);
                            break;
                        default:
                            System.out.println("OPCION INVALIDA");
                    }
                    break;
                case 4:
                    
                    break;    
                case 5:
                    
                    break;
                case 0:
                    System.out.println("-------------------------");
                    System.out.println("EL PROGRAMA HA FINALIZADO");
                    System.out.println("-------------------------");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }while(opcionMenuPrincipal!=0);   
    }
}
