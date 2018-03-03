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
 * clase principal Main
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcionMenuPrincipal,productos,escojerProducto,unidades,cantidadInicialNuevoProducto;
        productos = 4;
        Scanner leer = new Scanner(System.in);
        Producto p1 = new Producto("MARGARITA",2000,30);
        Producto p2 = new Producto("GALLETAS",1000,10);
        Producto p3 = new Producto("CHEETOS",2000,10);
        Producto p4 = new Producto("CHOCORAMO",1500,20);
        Producto p5 = new Producto();
        Producto p6 = new Producto();
        do{
            
            System.out.println("DISPENSADOR DE PRODUCTOS");
            System.out.println("1. COMPRAR");
            System.out.println("2. CONSULTAR INFORME");
            System.out.println("3. INGRESAR UNIDADES A UN PRODUCTO");
            if(productos == 4 || productos == 5){
                System.out.println("4. INGRESAR UN PRODUCTO");
            }
            if(productos == 4){
                System.out.println("5. INGRESAR DOS PRODUCTOS");
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
                        System.out.println("5. "+p5.nombre);
                    }
                    if(!"".equals(p6.nombre)){
                        System.out.println("6. "+p6.nombre);
                    }
                    //leer
                    escojerProducto = leer.nextInt();
                    //validar
                    if("".equals(p5.nombre) && productos>4){
                        escojerProducto+=2;
                    }
                    if("".equals(p6.nombre) && productos>5){
                        escojerProducto+=2;
                    }
                    //switch
                    switch(escojerProducto){
                        case 1:
                            if(p1.cantidadFinal>0){
                                p1.calcularGanancias();
                                System.out.println("PAPAS MARGARITA COMPRADAS POR: $"+p1.precioUnidad);
                            }
                            else{
                                System.out.println("PRODUCTO AGOTADO");
                            }
                            break;
                        case 2:
                            if(p2.cantidadFinal>0){
                                p2.calcularGanancias();
                                System.out.println("GALLETAS COMPRADAS POR: $"+p2.precioUnidad);
                            }
                            else{
                                System.out.println("PRODUCTO AGOTADO");
                            }
                            break;
                        case 3:
                            if(p3.cantidadFinal>0){
                                p3.calcularGanancias();
                                System.out.println("CHEETOS COMPRADOS POR: $"+p3.precioUnidad);
                            }
                            else{
                                System.out.println("PRODUCTO AGOTADO");
                            }
                            break;
                        case 4:
                            if(p4.cantidadFinal>0){
                                p4.calcularGanancias();
                                System.out.println("CHOCORAMO COMPRADO POR: $"+p4.precioUnidad);
                            }
                            else{
                                System.out.println("PRODUCTO AGOTADO");
                            }
                            break;
                        case 5:
                            if(p5.cantidadFinal>0){
                                p5.calcularGanancias();
                                System.out.println(p5.nombre+" COMPRADO POR: $"+p5.precioUnidad);
                            }
                            else{
                                System.out.println("PRODUCTO AGOTADO");
                            }
                            break;
                        case 6:
                            if(p6.cantidadFinal>0){
                                p6.calcularGanancias();
                                System.out.println(p6.nombre+" COMPRADO POR: $"+p6.precioUnidad);
                            }
                            else{
                                System.out.println("PRODUCTO AGOTADO");
                            }
                            break;
                        default:
                           System.out.println("OPCION INVALIDA"); 
                    }
                    break;
                case 2:
                    p1.calcularPorcentajeVentas();
                    p2.calcularPorcentajeVentas();
                    p3.calcularPorcentajeVentas();
                    p4.calcularPorcentajeVentas();
                    if(productos==5){
                        p5.calcularPorcentajeVentas();
                    }
                    if(productos==6){
                        p6.calcularPorcentajeVentas();
                    }
                    p1.calcularPorcentajeGanancias();
                    p2.calcularPorcentajeGanancias();
                    p3.calcularPorcentajeGanancias();
                    p4.calcularPorcentajeGanancias();
                    if(productos==5){
                        p5.calcularPorcentajeGanancias();
                    }
                    if(productos==6){
                        p6.calcularPorcentajeGanancias();
                    }
                    System.out.println(p1.consultarInforme());
                    System.out.println(p1.toString());
                    System.out.println(p2.consultarInforme());
                    System.out.println(p2.toString());
                    System.out.println(p3.consultarInforme());
                    System.out.println(p3.toString());
                    System.out.println(p4.consultarInforme());
                    System.out.println(p4.toString());
                    System.out.println(p5.consultarInforme());
                    System.out.println(p5.toString());
                    System.out.println(p6.consultarInforme());
                    System.out.println(p6.toString());
                    System.out.println("\n\n");
                    break;
                case 3:
                    System.out.println("ESCOJA EL PRODUCTO AL QUE DESEA INGRESAR UNIDADES");
                    System.out.println("1. MARGARITA");
                    System.out.println("2. GALLETAS");
                    System.out.println("3. CHEETOS");
                    System.out.println("4. CHOCORAMO");
                    if(!"".equals(p5.nombre)){
                        System.out.println("5. "+p5.nombre);
                    }
                    if(!"".equals(p6.nombre)){
                        System.out.println("6. "+p6.nombre);
                    }
                    //leer
                    escojerProducto = leer.nextInt();
                    //validar
                    if("".equals(p5.nombre) && productos>4){
                        escojerProducto+=2;
                    }
                    if("".equals(p6.nombre) && productos>5){
                        escojerProducto+=2;
                    }
                    //switch
                    switch(escojerProducto){
                        case 1:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p1.nombre);
                            unidades = leer.nextInt();
                            while(unidades<1 || unidades>10){
                                System.out.println("CANTIDAD INVALIDA");
                                unidades = leer.nextInt();
                            }
                            p1.ingresarUnidades(unidades);
                            break;
                        case 2:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p2.nombre);
                            unidades = leer.nextInt();
                            while(unidades<1 || unidades>10){
                                System.out.println("CANTIDAD INVALIDA");
                                unidades = leer.nextInt();
                            }
                            p2.ingresarUnidades(unidades);
                            break;
                        case 3:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p3.nombre);
                            unidades = leer.nextInt();
                            while(unidades<1 || unidades>10){
                                System.out.println("CANTIDAD INVALIDA");
                                unidades = leer.nextInt();
                            }
                            p3.ingresarUnidades(unidades);
                            break;
                        case 4:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p4.nombre);
                            unidades = leer.nextInt();
                            while(unidades<1 || unidades>10){
                                System.out.println("CANTIDAD INVALIDA");
                                unidades = leer.nextInt();
                            }
                            p4.ingresarUnidades(unidades);
                            break;
                        case 5:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p5.nombre);
                            unidades = leer.nextInt();
                            while(unidades<1 || unidades>10){
                                System.out.println("CANTIDAD INVALIDA");
                                unidades = leer.nextInt();
                            }
                            p5.ingresarUnidades(unidades);
                            break;
                        case 6:
                            System.out.println("INGRESE EL NUMERO DE UNIDADES (NO MAS DE 10) QUE DESEA AUMENTAR A "+p6.nombre);
                            unidades = leer.nextInt();
                            while(unidades<1 || unidades>10){
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
                    Scanner lectura1 = new Scanner(System.in);
                    if(productos<5){
                        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
                        p5.nombre = lectura1.nextLine();
                        System.out.println("INGRESE EL PRECIO POR UNIDAD DEL PRODUCTO (MINIMO $500 MAXIMO $3000)");
                        p5.precioUnidad = leer.nextInt();
                        while(p5.precioUnidad<500 || p5.precioUnidad>3000){
                            System.out.println("PRECIO INCORRECTO");
                            p5.precioUnidad = leer.nextInt();
                        }
                        System.out.println("INGRESE LA CANTIDAD INICIAL AL DISPENSADOR (MINIMO 10, MAXIMO 30)");
                        p5.cantidadInicial = leer.nextInt();
                        while(p5.cantidadInicial<10 || p5.cantidadInicial>30){
                            System.out.println("CANTIDAD INCORRECTA");
                            p5.cantidadInicial = leer.nextInt();
                        }
                        p5.cantidadInicialProductosNuevos(p5.cantidadInicial);
                    }
                    
                    if(productos==5){
                        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
                        p6.nombre = lectura1.nextLine();
                        System.out.println("INGRESE EL PRECIO POR UNIDAD DEL PRODUCTO (MINIMO $500 MAXIMO $3000)");
                        p6.precioUnidad = leer.nextInt();
                        while(p6.precioUnidad<500 || p6.precioUnidad>3000){
                            System.out.println("PRECIO INCORRECTO");
                            p6.precioUnidad = leer.nextInt();
                        }
                        System.out.println("INGRESE LA CANTIDAD INICIAL AL DISPENSADOR (MINIMO 10, MAXIMO 30)");
                        p6.cantidadInicial = leer.nextInt();
                        while(p6.cantidadInicial<10 || p6.cantidadInicial>30){
                            System.out.println("CANTIDAD INCORRECTA");
                            p6.cantidadInicial = leer.nextInt();
                        }
                        p6.cantidadInicialProductosNuevos(p6.cantidadInicial);
                    }
                    productos++;
                    break;    
                case 5:
                    Scanner lectura2 = new Scanner(System.in);
                    System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
                    p5.nombre = lectura2.nextLine();
                    System.out.println("INGRESE EL PRECIO POR UNIDAD DEL PRODUCTO (MINIMO $500 MAXIMO $3000)");
                    p5.precioUnidad = leer.nextInt();
                    while(p5.precioUnidad<500 || p5.precioUnidad>3000){
                        System.out.println("PRECIO INCORRECTO");
                        p5.precioUnidad = leer.nextInt();
                    }
                    System.out.println("INGRESE LA CANTIDAD INICIAL AL DISPENSADOR (MINIMO 10, MAXIMO 30)");
                    p5.cantidadInicial = leer.nextInt();
                    while(p5.cantidadInicial<10 || p5.cantidadInicial>30){
                        System.out.println("CANTIDAD INCORRECTA");
                        p5.cantidadInicial = leer.nextInt();
                    }
                    p5.cantidadInicialProductosNuevos(p5.cantidadInicial);
                    productos++;
                    
                    
                    System.out.println("\n\nINGRESE EL NOMBRE DEL PRODUCTO");
                    p6.nombre = lectura2.nextLine();
                    System.out.println("INGRESE EL PRECIO POR UNIDAD DEL PRODUCTO (MINIMO $500 MAXIMO $3000)");
                    p6.precioUnidad = leer.nextInt();
                    while(p6.precioUnidad<500 || p6.precioUnidad>3000){
                        System.out.println("PRECIO INCORRECTO");
                        p6.precioUnidad = leer.nextInt();
                    }
                    System.out.println("INGRESE LA CANTIDAD INICIAL AL DISPENSADOR (MINIMO 10, MAXIMO 30)");
                    p6.cantidadInicial = leer.nextInt();
                    while(p6.cantidadInicial<10 || p6.cantidadInicial>30){
                        System.out.println("CANTIDAD INCORRECTO");
                        p6.cantidadInicial = leer.nextInt();
                    }
                    p6.cantidadInicialProductosNuevos(p6.cantidadInicial);
                    productos++;
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
