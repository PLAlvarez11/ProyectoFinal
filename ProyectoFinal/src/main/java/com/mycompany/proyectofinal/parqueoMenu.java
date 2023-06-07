package com.mycompany.proyectofinal;

import java.util.Scanner;

public class parqueoMenu {
    
    public static void gestionParqueo(){
        parqueoArchivo archivo = new parqueoArchivo();
        Scanner sc = new Scanner(System.in);
        int salida =0;
        int opcion =0;
        int opc =0;
        while(salida!=1){
            menuParqueo();
            opcion=sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("ingrese numero de Parqueo");
                    String numPar = sc.next();
                    System.out.println("ingrese numero de Placa");
                    String numPlaca = sc.next();
                    System.out.println("ingrese numero de NIT");
                    String numN = sc.next();
                    System.out.println("ingrese la fecha de registro");
                    String Fecha = sc.next();
                    parqueos dat = new parqueos(numPar, numPlaca, numN, Fecha);
                    parqueoArchivo.escribirArchivos(dat);
                break;
                case 2:
                	System.out.println("__________DATOS__________");
                	archivo.mostrarDatosArchivosP();
                break;
                case 3:
                	System.out.println("_____MODIFIAR PARQUEO_____");
                break;
                case 4:
                	System.out.println("_____LIMPIAR PARQUEO_____");
                	String eliminarDatos = sc.next();
                    archivo.eliminar(eliminarDatos);
                case 5:
                	System.out.println("____*°BUSCAR PARQUEO°*___");
                	System.out.println("-------------------------"); 
                    System.out.println("Buscar por parqueo-------1");   
                    System.out.println("Buscar por Placa---------2");
                    System.out.println("Buscar por NIT-----------3");
                    System.out.println("Buscar por fecha---------4");
                    System.out.println("-------------------------");
                    opc=sc.nextInt();
                    switch(opc){
	                    case 1:
	                        System.out.println("____*°BUSCAR PARQUEO°*____");
	                        String parqueoBuscar = sc.next();
	                        archivo.buscar(parqueoBuscar);
	                     break;
	                    case 2:
	                    	System.out.println("_____*°BUSCAR PLACA°*____");  
	                    	String placaBuscar = sc.next();
	                    	archivo.buscarp(placaBuscar);
		                 break;
	                    case 3:
	                    	System.out.println("_____*°BUSCAR NIT°*_____");	
	                    	String nitBuscar = sc.next();
	                    	archivo.buscarn(nitBuscar);
		                 break;
	                    case 4:
	                    	System.out.println("_____*°BUSCAR FECHA°*_____");
	                    	String fechaBuscar = sc.next();
	                    	archivo.buscarf(fechaBuscar);
		                 break;
                    }
                break;
                case 6:
                	System.out.println("Salio del Programa"); 
                salida = 0;
                break;
            }
        }
    }
    
    public static void menuParqueo() {
        System.out.println("*   *   *   *   *   *   *"); 
        System.out.println("  *   *   Parqueo    *   ");
        System.out.println("*   *   *   *   *   *   *");  
        System.out.println("-------------------------"); 
        System.out.println("Ingresar Parqueo---------1 ");   
        System.out.println("Mostrar Parqueo----------2 ");
        System.out.println("Modificar Parqueo--------3 ");
        System.out.println("Limpiar Parqueo----------4 ");
        System.out.println("Buscar Parqueo-----------5 ");
        System.out.println("Salir del programa-------6 "); 
        System.out.println("-------------------------");
    }
}
