package com.mycompany.proyectofinal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class pagoArchivo {
    public static void escribirArchivos(pagos pago){
        try{
            File f = new File("pagos.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists() && f.length()!=0){
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(pago.getNumeroParqueo()+"%"+pago.getTipoPago()+"%"+pago.getMonto()+"%"+pago.getNumAutorizacion()+"%"+pago.getFechaPago()+"%"+pago.getNIT());                
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(pago.getNumeroParqueo()+"%"+pago.getTipoPago()+"%"+pago.getMonto()+"%"+pago.getNumAutorizacion()+"%"+pago.getFechaPago()+"%"+pago.getNIT());                                
            }
            bw.close();
            fw.close();
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
	}
    }
    
}
