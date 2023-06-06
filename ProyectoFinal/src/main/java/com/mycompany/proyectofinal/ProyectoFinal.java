package com.mycompany.proyectofinal;

import java.util.Scanner;

public class ProyectoFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println(" *   *   *   *   *   *   *   *");
        System.out.println("   *   *  BIENVENIDO   *   *  ");
        System.out.println(" *   *   *   *   *   *   *   *");
        System.out.println("\n");
        System.out.println("      MENU DEL PROYECTO G2    ");
        System.out.println("Gestión Clientes-------------1");
        System.out.println("Gestión Vehiculos------------2");
        System.out.println("Gestión Parqueos-------------3");
        System.out.println("Gestión Pagos----------------4");
        
        do{
            System.out.println("\nIngrese la opcion que desea realizar");
            opcion = sc.nextInt();
        }while(opcion < 0 || opcion > 4);
        
        switch(opcion){
            case 1:
                clienteMenu.menuCliente();
               break;
            
            case 2:
                vehiculoMenu.menuVehiculo();
               break;
               
            case 3:
                parqueoMenu.gestionParqueo();
               break;
               
            case 4:
                pagoMenu.menuPago();
               break;
        }
    }
}
