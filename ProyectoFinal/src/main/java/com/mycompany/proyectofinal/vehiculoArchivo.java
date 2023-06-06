package com.mycompany.proyectofinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class vehiculoArchivo {
    public static void escribirVehiculoarch(vehiculos Vehiculo){
        try{
            
            File f = new File("vehiculos.txt");
            FileWriter fw; 
            BufferedWriter bw;
            if(f.exists() && f.length()!=0){
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(Vehiculo.getNumplaca()+"%"+Vehiculo.getMarcavh()+"%"+Vehiculo.getLineavh()+"%"+Vehiculo.getModelovh()+"%"+Vehiculo.getColorvh()+"%"+Vehiculo.getNitcliente());                
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter( fw);                 
                bw.write(Vehiculo.getNumplaca()+"%"+Vehiculo.getMarcavh()+"%"+Vehiculo.getLineavh()+"%"+Vehiculo.getModelovh()+"%"+Vehiculo.getColorvh()+"%"+Vehiculo.getNitcliente());                           
            }
            bw.close();
            fw.close();
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
}
