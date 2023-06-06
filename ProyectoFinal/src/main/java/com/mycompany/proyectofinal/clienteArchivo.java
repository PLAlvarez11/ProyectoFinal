package com.mycompany.proyectofinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class clienteArchivo {
    public static void escribir(clientes cliente){
        try{
            File f = new File("clientes.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists() && f.length()!=0){
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(cliente.GetName()+"%"+cliente.GetApe()+"%"+cliente.GetCui()+"%"+cliente.GetNum());                
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(cliente.GetName()+"%"+cliente.GetApe()+"%"+cliente.GetCui()+"%"+cliente.GetNum());                               
            }
            bw.close();
            fw.close();
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
    public void mostrar(){
        try{
            File f = new File("clientes.txt");
            if (f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null){
                    String[] arreglo = linea.split("%");
                    clientes cliente = new clientes(Integer.parseInt(arreglo[0]), Integer.parseInt(arreglo[1]), arreglo[2], arreglo[3], arreglo[4], arreglo[5], arreglo[6], Integer.parseInt(arreglo[7]), Integer.parseInt(arreglo[8]));
                    System.out.println(cliente.toString());
                }
            }
        }catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
        
    }
    public void buscar(String nombreBuscar){
        try{
            File f = new File ("clientes.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                boolean blnEncontrado = false;
                while ((linea=br.readLine())!=null){
                    String [] arreglo = linea.split("%");
                    if (arreglo[0].equalsIgnoreCase(nombreBuscar)){
                        clientes cliente = new clientes(Integer.parseInt(arreglo[0]), Integer.parseInt(arreglo[1]), arreglo[2], arreglo[3], arreglo[4], arreglo[5], arreglo[6], Integer.parseInt(arreglo[7]), Integer.parseInt(arreglo[8]));
                        System.out.println(cliente.toString());
                        blnEncontrado=true;
                    }
                }
                br.close();
                fr.close();
                if (!blnEncontrado){
                    System.out.println("no existe registro con ese dato" + nombreBuscar);
                }
            } else {
                System.out.println("no existe registro");
                }
            }catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
}