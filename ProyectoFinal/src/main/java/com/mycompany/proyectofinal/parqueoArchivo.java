package com.mycompany.proyectofinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class parqueoArchivo {
    public static void escribirArchivos(parqueos parqueo){
        try{
            File f = new File("parqueos.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists() && f.length()!=0){
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(parqueo.getNumeroParqueo()+"%"+parqueo.getNumeroPlaca()+"%"+parqueo.getNIT()+"%"+parqueo.getFechaRegistro());                
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(parqueo.getNumeroParqueo()+"%"+parqueo.getNumeroPlaca()+"%"+parqueo.getNIT()+"%"+parqueo.getFechaRegistro());                               
            }
            bw.close();
            fw.close();
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
	}
    }
    
    public static void mostrarDatosArchivosP(){
        try{
            File f = new File("parqueos.txt");
            if (f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine()) != null){
                    String [] arreglo = linea.split("%");
                    parqueos datos = new parqueos(arreglo[0], arreglo[1], arreglo[2], arreglo[3]);
                    System.out.println(datos.toString());
                }
            }
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
	}
    }
}
