package com.mycompany.proyectofinal;

import java.util.Scanner;

public class pagoMenu {
    public static void menuPago(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println(" *   *   *   *   *   *   *   *");
        System.out.println("   *   *  Pagos   *   *  ");
        System.out.println(" *   *   *   *   *   *   *   *");
        System.out.println("\n");
        System.out.println("Realizar Pago--------1");
        System.out.println("Buscar Pago----------2");
        System.out.println("Salir----------------3");
        
        do{
            System.out.println("\nIngrese la opcion que desea realizar");
            opcion = sc.nextInt();
        }while(opcion < 0 || opcion > 3);
        
        switch(opcion){
            case 1:
               realizarPago();
               break;
            
            case 2:
               break;
               
            case 3:
               break;
        }
    }
    
    private static void realizarPago(){
        Scanner sc = new Scanner(System.in);
        Boolean isApto = false;             
        do{
            System.out.println("Ingrese el parqueo que el cual desea realizar pago");
            String numParqueo = sc.next();
            isApto = Validaciones.validarNumero(numParqueo);
        }while(isApto == false);
        
        
    }
}
