package com.mycompany.proyectofinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Validaciones {
    
    public boolean ValidarFecha(String Fecha ){
      
    return true;
    }
    
    public static boolean buscarcui(String Buscarcui){
        boolean blnEncontrado = false;    
        try{    
            File f = new File ("clientes.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea=br.readLine())!=null){
                    String [] arreglo = linea.split("%");
                    if (arreglo[0].equalsIgnoreCase(Buscarcui)){
                        blnEncontrado=true;
                    }
                }
                br.close();
                fr.close();
            } 
        }catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
            
        return blnEncontrado;
    }
    
    public static boolean buscarNit(String Nit){
        boolean blnEncontrado = false;    
        try{    
            File f = new File ("clientes.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea=br.readLine())!=null){
                    String [] arreglo = linea.split("%");
                    if (arreglo[1].equalsIgnoreCase(Nit)){
                        blnEncontrado=true;
                    }
                }
                br.close();
                fr.close();
            } 
        }catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
            
        return blnEncontrado;
    }
    
    public static boolean validarNumero(String numero){
        boolean resp = false; 
        int cant = numero.length();
        char caracter;
        
        for(int i = 0; i < cant; i++){
            caracter = numero.charAt(i);
            
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
        return resp;
    }
    
    public static String obtenerFecha(){
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
        return dateFormat.format(date);
    } 
}
