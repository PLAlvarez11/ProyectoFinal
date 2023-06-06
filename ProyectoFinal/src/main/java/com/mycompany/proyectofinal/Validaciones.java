package com.mycompany.proyectofinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Validaciones {
    
    public boolean ValidarFecha(String Fecha ){
      
    return true;
    }
    
    public static boolean buscarcui(String Buscarcui){
        boolean blnEncontrado = false;    
        try{
            if(Buscarcui.length() != 13){
                File f = new File ("departamento.txt");
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
            } 
        }catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
            
        return blnEncontrado;
    }
}
