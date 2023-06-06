package com.mycompany.proyectofinal;

import java.util.Scanner;

public class vehiculoMenu {
    public static void menuVehiculo(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println(" *   *   *   *   *   *   *   *");
        System.out.println("   *   *  Vehiculos   *   *  ");
        System.out.println(" *   *   *   *   *   *   *   *");
        System.out.println("\n");
        System.out.println("Nuevo Vehiculo---------------1");
        System.out.println("Consultar Vehiculo-----------2");
        System.out.println("Editar Vehiculo--------------3");
        
        do{
            System.out.println("\nIngrese la opcion que desea realizar");
            opcion = sc.nextInt();
        }while(opcion < 0 || opcion > 3);
        
        switch(opcion){
            case 1:
                AgregarVehiculo();
               break;
            
            case 2:
               break;
               
            case 3:
               break;
        }
    }
    
    public static void AgregarVehiculo() {
        Scanner entrada = new Scanner(System.in);
         
        System.out.println("ingrese Número de Placa");
        //entrada.nextLine();
        String  Numplaca = entrada.next();

        System.out.println("ingrese Marca del vehículo ");
        //entrada.nextLine();
        String Marcavh = entrada.next();

         System.out.println("ingrese Linea  del vehículo");
        //entrada.nextLine();
        String Lineavh = entrada.next();

        System.out.println("ingrese Modelo del vehículo");
        //entrada.nextLine();
        String Modelovh = entrada.next();

        System.out.println("Ingrese Color del vehículo ");
        //entrada.nextLine();
        String  Colorvh= entrada.next();

        System.out.println("ingrese NIT propietario");
        int Nitp= entrada.nextInt();

        vehiculos vh = new vehiculos ( Numplaca, Marcavh, Lineavh , Modelovh, Colorvh, Nitp);
        vehiculoArchivo.escribirVehiculoarch(vh); 
    }
}
