package com.mycompany.proyectofinal;

import java.util.Scanner;

public class clienteMenu {
    public static void menuCliente(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println(" *   *   *   *   *   *   *   *");
        System.out.println("   *   *  Clientes   *   *  ");
        System.out.println(" *   *   *   *   *   *   *   *");
        System.out.println("\n");
        System.out.println("Nuevo Cliente---------------1");
        System.out.println("Consultar Cliente-----------2");
        System.out.println("Editar Cliente--------------3");
        System.out.println("Eliminar Cliente------------4");
        System.out.println("Volver al menu principal----5");
        
        do{
            System.out.println("\nIngrese la opcion que desea realizar");
            opcion = sc.nextInt();
        }while(opcion < 0 || opcion > 5);
        
        switch(opcion){
            case 1:
                agregarCliente();
               break;
            case 2:
            System.out.println("Ingrese el CUI del cliente que desea buscar");
            String buscar1 = sc.next();
            clienteArchivo.buscar(buscar1);
               break;
            case 3:
            String cambiar1 = "";
            clienteArchivo.cambiar(cambiar1);
               break;
            case 4:
            String eliminar = sc.next();
            clienteArchivo.eliminarRegistro(eliminar);
               break;
            case 5:
            ProyectoFinal.main(null);
        }
    }
    
    public static void agregarCliente (){
    String fech1 = "";
    String fech2= "";
    String fech3= "";
    int numtel = 0;
    String direccion1= "";
    String direccion2= "";
    String name1= "";
    String name2= "";
    String ape1= "";
    String ape2= "";
    String fech= "";
    String cui = "";
    int nit = 0;
    int estado = 1;
    String trabajo = "";
    Boolean IsApto = false;
    String sNit = "";
    String sNumtel= "";
            
    Scanner entrada = new Scanner(System.in);
    System.out.println("Porfavor ingrese el primer nombre del cliente");
    name1 = entrada.next();
    System.out.println("Porfavor ingrese el segundo nombre del cliente");
    name2 = entrada.next();
    String name = name1+" "+name2;
    System.out.println("Porfavor ingrese el primer apellido del cliente");
    ape1 = entrada.next();
    System.out.println("Porfavor ingrese el segundo apellido del cliente");
    ape2 = entrada.next();
    String ape = ape1+" "+ape2;
    
    IsApto = false;
    while(cui.length() != 13 && IsApto == false){
        System.out.println("porfavor ingrese el CUI del cliente");
        cui = entrada.next();
        IsApto = Validaciones.validarNumero(cui);        
    }
    
    int fech11 = 0;
    IsApto = false;
    while((fech11<1 || fech11>31) || (IsApto == false)){
        System.out.println("Porfavor ingrese el dia en que nació el cliente");
        fech1= entrada.next();
        IsApto = Validaciones.validarNumero(fech1);
        if (IsApto){
            fech11 = Integer.parseInt(fech1);
        }
    }
    
    int fech22 = 0;
    IsApto = false;
    while((fech22<1 || fech22>12) || IsApto == false){ 
        System.out.println("Porfavor ingrese el mes en nació el cliente");
        fech2 = entrada.next();
        IsApto = Validaciones.validarNumero(fech2);
        if (IsApto){
            fech22 = Integer.parseInt(fech2);
        }
    }    
    
    int fech33 = 0;
    IsApto = false;
    while((fech33>2008 || fech33<1823) || IsApto == false){ 
        System.out.println("Porfavor ingrese el año en que nació el cliente");
        fech3 = entrada.next();
        IsApto = Validaciones.validarNumero(fech3);
        if (IsApto){
            fech33 = Integer.parseInt(fech3);
        }
    }
    
    fech = fech1+"/"+fech2+"/"+fech3;
    
    System.out.println("Porfavor ingrese la dirección del domicilio del cliente");
    entrada.nextLine();
    direccion1 = entrada.nextLine();
    System.out.println("porfavor ingrese el trabajo al que se dedica el cliente");
    trabajo = entrada.nextLine();
    System.out.println("Porfavor ingrese la direccion del trabajo del cliente");
    direccion2 = entrada.nextLine();
    
    IsApto = false;
    while(IsApto == false || sNumtel.length() !=8){ 
        System.out.println("Porfavor ingrese el numero de telefono del cliente");
        sNumtel = entrada.next();
        IsApto = Validaciones.validarNumero(sNumtel);
    }
    numtel = Integer.parseInt(sNumtel);
    
    IsApto = false;
    while(IsApto == false || sNit.length() != 9){ 
        System.out.println("Porfavor ingrese el NIT del cliente");
        sNit = entrada.next();
        IsApto = Validaciones.validarNumero(sNit);
    }
    nit = Integer.parseInt(sNit);
    
        Boolean existsCui = false;
        Boolean existsNit = false;
        existsCui = Validaciones.buscarcui(cui);
        existsNit = Validaciones.buscarNit(sNit);
        
        if(existsNit == true ){
            
        }
        else if(existsCui == true){
        
        }else{
            clientes cli = new clientes(cui, nit, direccion1, trabajo, direccion2, fech, name, ape, numtel, estado);
            clienteArchivo.escribir(cli);
        }
        System.out.println("Cliente creado con exito");
        menuCliente();
    }
}
