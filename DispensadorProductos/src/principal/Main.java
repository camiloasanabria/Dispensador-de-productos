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
        int opcionMenuPrincipal,productos;
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
                    
                    break;
                case 2:
                    System.out.println(p6.consultarInforme());
                    break;
                case 3:
                    break;
                case 4:
                    break;    
                case 5:
                    break;
                case 0:
                    System.out.println("EL PROGRAMA HA FINALIZADO");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }while(opcionMenuPrincipal!=0);   
    }
}
