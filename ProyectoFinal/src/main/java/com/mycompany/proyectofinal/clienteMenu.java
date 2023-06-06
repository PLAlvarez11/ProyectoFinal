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
        
        do{
            System.out.println("\nIngrese la opcion que desea realizar");
            opcion = sc.nextInt();
        }while(opcion < 0 || opcion > 4);
        
        switch(opcion){
            case 1:
                agregarCliente();
               break;
            
            case 2:
               break;
               
            case 3:
               break;
               
            case 4:
               break;
        }
    }
    
    public static void agregarCliente (){
    int fech1;
    int fech2;
    int fech3;
    int numtel = 0;
    String direccion;
    String name1;
    String name2;
    String ape1;
    String ape2;
    String fech;
    int cui = 0;
    int nit = 0;
    int estado = 1;
    String trabajo = "";
    Boolean IsApto = false;
            
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
    
    while(IsApto == false){
        System.out.println("porfavor ingrese el CUI del cliente");
        cui = entrada.nextInt();
        String sCui = String.valueOf(cui);
        IsApto = Validaciones.buscarcui(sCui);
    }
    
    IsApto = false;
    
    System.out.println("Porfavor ingrese el dia en que nació el cliente en 2 digitos");
    fech1 = entrada.nextInt();
    while(fech1<1 || fech1>31){
        System.out.println("el dia debe ingresarse en numeros del 1 al 31");
        System.out.println("Porfavor intentelo nuevamente");
        fech1= entrada.nextInt();
    }
    
    System.out.println("Porfavor ingrese el mes en nació el cliente ");
    fech2 = entrada.nextInt();
    
    while(fech2<1 || fech2>12){
        System.out.println("el mes debe ser desde 1 a 12");
        System.out.println("Porfavor intentelo nuevamente");
        fech2= entrada.nextInt();
    }
    System.out.println("Porfavor ingrese el año en que nació el cliente");
    fech3 = entrada.nextInt();
    
    while(fech3>2008 || fech3<1823){
        System.out.println("el año debe ingresado equivale a que tiene una edad no adecuada");
        System.out.println("Porfavor intentelo nuevamente");
        fech3= entrada.nextInt();
    }
    fech1 = toString(fech1);
    fech2 = toString(fech2);
    fech3 = toString(fech3);
    fech = fech1+"/"+fech2+"/"+fech3;
    
    System.out.println("Porfavor ingrese la dirección del domicilio del cliente");
    direccion = entrada.next();
    System.out.println("porfavor ingrese el trabajo al que se dedica el cliente");
    trabajo = entrada.next();
    
    while(IsApto == false){
        System.out.println("Porfavor ingrese el numero de telefono del cliente");
        String sNumtel = entrada.next();
        if(sNumtel.length() == 8){
            IsApto = true;
            numtel = Integer.parseInt(sNumtel);
        }
    }
    
    while(IsApto == false){
        System.out.println("Porfavor ingrese el NIT del cliente");
        String sNit = entrada.next();
        if(sNit.length() == 9){
            IsApto = true;
            nit = Integer.parseInt(sNit);
        }
    }
    
        clientes cli = new clientes(cui, nit, direccion, trabajo, fech, name, ape, numtel, estado);
        clienteArchivo.escribir(cli);
    }

    private static int toString(int fech1) {
        return 0;
    }
}
