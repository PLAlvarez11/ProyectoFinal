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
    String fech1;
    String fech2;
    String fech3;
    int numtel = 0;
    String direccion1;
    String direccion2;
    String name1;
    String name2;
    String ape1;
    String ape2;
    String fech;
    String cui = "";
    int nit = 0;
    int estado = 1;
    String trabajo = "";
    Boolean IsApto = false;
    String sNit = "";
            
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
    
    while(cui.length() != 13){
        System.out.println("porfavor ingrese el CUI del cliente");
        cui = entrada.next();
    }
    boolean resp = false;
    int cant = cui.length();
    for(int i = 0; i < cant; i++){
        String caracter = cui.charAt(i);
        
        if(caracter == '0'){
            resp = true;
        }
        else if(caracter == '1'){
            resp = true;
        }
        else if(caracter == '2'){
            resp = true;
        }
        else if(caracter == '3'){
            resp = true;
        }
        else if(caracter == '4'){
            resp = true;
        }
        else if(caracter  == '5'){
            resp = true;
        }
        else if(caracter == '6'){
            resp = true;
        }
        else if(caracter == '7'){
            resp = true;
        }
        else if(caracter == '8'){
            resp = true;
        }
        else if(caracter == '9'){
            resp = true;
        }
        else{
            resp = false;
            break;
        }
    }
    IsApto = false;
    
    System.out.println("Porfavor ingrese el dia en que nació el cliente");
    fech1 = entrada.next();
            boolean resp1 = false;
        int cant1 = fech1.length();
        for(int i = 0; i < cant1; i++){
            String caracter = fech1.charAt(i);
            
            if(caracter == '0'){
                resp = true;
            }
            else if(caracter == '1'){
                resp = true;
            }
            else if(caracter == '2'){
                resp = true;
            }
            else if(caracter == '3'){
                resp = true;
            }
            else if(caracter == '4'){
                resp = true;
            }
            else if(caracter  == '5'){
                resp = true;
            }
            else if(caracter == '6'){
                resp = true;
            }
            else if(caracter == '7'){
                resp = true;
            }
            else if(caracter == '8'){
                resp = true;
            }
            else if(caracter == '9'){
                resp = true;
            }
            else{
                resp = false;
                break;
            }
        }
        int fech11 = String.valueOf(fech1);
        while(fech11<1 || fech11>31){
            System.out.println("el dia debe ingresarse en numeros del 1 al 31");
            System.out.println("Porfavor intentelo nuevamente");
            fech1= entrada.next();
        }
    System.out.println("Porfavor ingrese el mes en nació el cliente");
    fech2 = entrada.nextInt();
    boolean resp2 = false;
    int cant2 = fech2.length();
    for(int i = 0; i < cant2; i++){
        String caracter = fech2.charAt(i);
        
        if(caracter == '0'){
            resp = true;
        }
        else if(caracter == '1'){
            resp = true;
        }
        else if(caracter == '2'){
            resp = true;
        }
        else if(caracter == '3'){
            resp = true;
        }
        else if(caracter == '4'){
            resp = true;
        }
        else if(caracter  == '5'){
            resp = true;
        }
        else if(caracter == '6'){
            resp = true;
        }
        else if(caracter == '7'){
            resp = true;
        }
        else if(caracter == '8'){
            resp = true;
        }
        else if(caracter == '9'){
            resp = true;
        }
        else{
            resp = false;
            break;
        }
    }
    int fech22 = String.valueOf(fech2);
    while(fech22<1 || fech22>12){
        System.out.println("el mes debe ser desde 1 a 12");
        System.out.println("Porfavor intentelo nuevamente");
        fech2= entrada.nextInt();
    }
    System.out.println("Porfavor ingrese el año en que nació el cliente");
    fech3 = entrada.nextInt();
    boolean resp3 = false;
    int cant3 = fech3.length();
    for(int i = 0; i < cant3; i++){
        String caracter = fech3.charAt(i);
        
        if(caracter == '0'){
            resp = true;
        }
        else if(caracter == '1'){
            resp = true;
        }
        else if(caracter == '2'){
            resp = true;
        }
        else if(caracter == '3'){
            resp = true;
        }
        else if(caracter == '4'){
            resp = true;
        }
        else if(caracter  == '5'){
            resp = true;
        }
        else if(caracter == '6'){
            resp = true;
        }
        else if(caracter == '7'){
            resp = true;
        }
        else if(caracter == '8'){
            resp = true;
        }
        else if(caracter == '9'){
            resp = true;
        }
        else{
            resp = false;
            break;
        }
    }
    int fech33 = String.valueOf(fech3);
    while(fech33>2008 || fech33<1823){
        System.out.println("el año debe ingresado equivale a que tiene una edad no adecuada");
        System.out.println("Porfavor intentelo nuevamente");
        fech3= entrada.nextInt();
    }
    String sfech1 = Integer.toString(fech11);
    String sfech2 = Integer.toString(fech22);
    String sfech3 = Integer.toString(fech33);
    fech = sfech1+"/"+sfech2+"/"+sfech3;
    
    System.out.println("Porfavor ingrese la dirección del domicilio del cliente");
    entrada.nextLine();
    direccion1 = entrada.nextLine();
    System.out.println("porfavor ingrese el trabajo al que se dedica el cliente");
    trabajo = entrada.nextLine();
    System.out.println("Porfavor ingrese la direccion del trabajo del cliente");
    direccion2 = entrada.nextLine();
    
    while(IsApto == false){
        System.out.println("Porfavor ingrese el numero de telefono del cliente");
        String sNumtel = entrada.next();
        if(sNumtel.length() == 8){
            IsApto = true;
            numtel = Integer.parseInt(sNumtel);
        }
        boolean resp4 = false;
        int cant4 = sNumtel.length();
        for(int i = 0; i < cant4; i++){
            String caracter = sNumtel.charAt(i);
            
            if(caracter == '0'){
                resp = true;
            }
            else if(caracter == '1'){
                resp = true;
            }
            else if(caracter == '2'){
                resp = true;
            }
            else if(caracter == '3'){
                resp = true;
            }
            else if(caracter == '4'){
                resp = true;
            }
            else if(caracter  == '5'){
                resp = true;
            }
            else if(caracter == '6'){
                resp = true;
            }
            else if(caracter == '7'){
                resp = true;
            }
            else if(caracter == '8'){
                resp = true;
            }
            else if(caracter == '9'){
                resp = true;
            }
            else{
                resp = false;
                break;
            }
        }
    }
    IsApto = false;
            
    while(IsApto == false){
        System.out.println("Porfavor ingrese el NIT del cliente");
        sNit = entrada.next();
        if(sNit.length() == 9){
            IsApto = true;
            nit = Integer.parseInt(sNit);
        }
        boolean resp5 = false;
        int cant5 = sNit.length();
        for(int i = 0; i < cant5; i++){
            String caracter = fech5.charAt(i);
            
            if(caracter == '0'){
                resp = true;
            }
            else if(caracter == '1'){
                resp = true;
            }
            else if(caracter == '2'){
                resp = true;
            }
            else if(caracter == '3'){
                resp = true;
            }
            else if(caracter == '4'){
                resp = true;
            }
            else if(caracter  == '5'){
                resp = true;
            }
            else if(caracter == '6'){
                resp = true;
            }
            else if(caracter == '7'){
                resp = true;
            }
            else if(caracter == '8'){
                resp = true;
            }
            else if(caracter == '9'){
                resp = true;
            }
            else{
                resp = false;
                break;
            }
        }
    }
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
        menuCliente();
    }

    private static int toString(int fech1) {
        return 0;
    }
}
