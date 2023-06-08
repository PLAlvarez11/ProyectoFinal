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
        String numParqueo = "";
        String monto = "";
        int tipoPago = 0;
        String fecha = "";
        int parqueo = 0;
                
        do{
            System.out.println("\nIngrese el parqueo que el cual desea realizar pago");
            numParqueo = sc.next();
            isApto = Validaciones.validarNumero(numParqueo);
            if(isApto){
                parqueo = Integer.parseInt(numParqueo);
            }
        }while((parqueo<0 || parqueo>125) || isApto == false);
        isApto = false;
        
        do{
            System.out.println("\nTipo de Pago");
            System.out.println("Deposito en cuenta monetaria.....1");
            System.out.println("Pago con tarjeta.................2");
            System.out.println("Transferencia Bancaria...........3");
            tipoPago = sc.nextInt();
        }while(tipoPago > 3 || tipoPago < 0);
        
        do{
            System.out.println("\nIngrese el monto de pago a realizar");
            monto = sc.next();
            isApto = Validaciones.validarNumero(monto);
        }while(isApto == false);
        isApto = false;
        
        fecha =  Validaciones.obtenerFecha();
        
        pagos pago = new pagos(numParqueo, tipoPago, Integer.parseInt(monto), 1, fecha);
        pagoArchivo.escribirArchivos(pago);
    }
   
}
