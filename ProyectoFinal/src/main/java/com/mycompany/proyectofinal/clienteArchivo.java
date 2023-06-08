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
                bw.write(cliente.GetCui()+"%"+cliente.GetNit()+"%"+cliente.GetDireccion()+"%"+cliente.GetTrabajo()+"%"+cliente.GetFech()+"%"+cliente.GetName()+"%"+cliente.GetApe()+"%"+cliente.GetNum()+"%"+cliente.GetEstado());                
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(cliente.GetCui()+"%"+cliente.GetNit()+"%"+cliente.GetDireccion()+"%"+cliente.GetTrabajo()+"%"+cliente.GetFech()+"%"+cliente.GetName()+"%"+cliente.GetApe()+"%"+cliente.GetNum()+"%"+cliente.GetEstado());                                
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
                    clientes cliente = new clientes(arreglo[0], Integer.parseInt(arreglo[1]), arreglo[2], arreglo[3], arreglo[4], arreglo[5], arreglo[6], Integer.parseInt(arreglo[7]), Integer.parseInt(arreglo[8]));
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
                        clientes cliente = new clientes(arreglo[0], Integer.parseInt(arreglo[1]), arreglo[2], arreglo[3], arreglo[4], arreglo[5], arreglo[6], Integer.parseInt(arreglo[7]), Integer.parseInt(arreglo[8]));
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
    public void eliminarLogico (String nombreEliminar){
        try {
                File f = new File("clientes.txt");
                if (f.exists()){
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader (fr) ;
                    String linea;
                    int numeroLineas=0;
                    
                    while((linea = br.readLine()) !=null){
                        numeroLineas++;
                    }
                    String contacto[] = new String[numeroLineas];
                    
                    br.close();
                    fr.close();
                    br = new BufferedReader(new FileReader(f));
                    int i=0;
                    
                    while ((linea=br.readLine())!=null){
                        contacto[i] = linea;
                        i++;
                    }
                    
                    br.close(); 
                    fr.close();
                    FileWriter fw = new FileWriter(f);
                    BufferedWriter bw = new BufferedWriter (fw);
                    boolean eliminado = false;
                    boolean primerlinea = true;
                    
                    for (int j = 0; j < contacto.length; j++){
                        String nuevalinea[] = contacto[j].split ("%");
                        if (nuevalinea[0].equalsIgnoreCase (nombreEliminar) ){
                            String nuevaLinea =  contacto[j].replace("1", "2");
                            bw.newLine();
                            bw.write(nuevaLinea);
                            eliminado = true;
                            System.out.println("Registro eliminado!");
                        } else {
                            if (primerlinea == true){
                                bw.write (contacto[j]);
                                primerlinea = false;
                            } else{
                                bw.newLine();
                                bw.write (contacto [j]);
                            }
                        }
                    }
    
                    if (eliminado==false){
                        System.out.println("No se encontro registro.");
                    }
                    bw.close();
                    fw.close();
    
                } else{
                    System.out.println("No hay registros que eliminar.");
                }
            } 
            
            catch (Exception e){
                System.out.println("Error de E/S "+ e);   
            }
        }
}