package com.mycompany.proyectofinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import parqueosP.datpsP;

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
    public void buscar(String parqueoBuscar){
        try{
            File f = new File ("parqueos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                boolean blnEncontrado = false;
                while ((linea = br.readLine())!= null){
                    String [] arreglo = linea.split("%");
                    if (arreglo[0].equalsIgnoreCase(parqueoBuscar) && !"false".equals(arreglo[2])){
                        datpsP persona = new datpsP(arreglo[0], arreglo[1], arreglo[2], arreglo[3]);
                        System.out.println(persona.toString());
                        blnEncontrado=true;
                    }
                }
                br.close();
                fr.close();
                if (!blnEncontrado){
                    System.out.println("no existe registro con ese dato " + parqueoBuscar);
                }
            } else {
                System.out.println("no existe registro");
            }
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
    public void buscarn(String nitBuscar){
        try{
            File f = new File ("parqueos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                boolean blnEncontrado = false;
                while ((linea = br.readLine())!= null){
                    String [] arreglo = linea.split("%");
                    if (arreglo[2].equalsIgnoreCase(nitBuscar) && !"false".equals(arreglo[3])){
                        datpsP persona = new datpsP(arreglo[0], arreglo[1], arreglo[2], arreglo[3]);
                        System.out.println(persona.toString());
                        blnEncontrado=true;
                    }
                }
                br.close();
                fr.close();
                if (!blnEncontrado){
                    System.out.println("no existe registro con ese dato " + nitBuscar);
                }
            } else {
                System.out.println("no existe registro");
            }
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
    public void buscarp(String placaBuscar){
        try{
            File f = new File ("parqueos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                boolean blnEncontrado = false;
                while ((linea = br.readLine())!= null){
                    String [] arreglo = linea.split("%");
                    if (arreglo[1].equalsIgnoreCase(placaBuscar) && !"false".equals(arreglo[3])){
                        datpsP persona = new datpsP(arreglo[0], arreglo[1], arreglo[2], arreglo[3]);
                        System.out.println(persona.toString());
                        blnEncontrado=true;
                    }
                }
                br.close();
                fr.close();
                if (!blnEncontrado){
                    System.out.println("no existe registro con ese dato " + placaBuscar);
                }
            } else {
                System.out.println("no existe registro");
            }
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
    public void buscarf(String fechaBuscar){
        try{
            File f = new File ("parqueos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                boolean blnEncontrado = false;
                while ((linea = br.readLine())!= null){
                    String [] arreglo = linea.split("%");
                    if (arreglo[3].equalsIgnoreCase(fechaBuscar) && !"false".equals(arreglo[3])){
                        datpsP persona = new datpsP(arreglo[0], arreglo[1], arreglo[2], arreglo[3]);
                        System.out.println(persona.toString());
                        blnEncontrado=true;
                    }
                }
                br.close();
                fr.close();
                if (!blnEncontrado){
                    System.out.println("no existe registro con ese dato " + fechaBuscar);
                }
            } else {
                System.out.println("no existe registro");
            }
        } catch(Exception e){
            System.out.println("Error de E/S" + e);
        }
    }
    public void eliminar (String eliminarDatos){
    	try {
                File f = new File("parqueos.txt");
                if (f.exists()){
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader (fr) ;
                    String linea;
                    int numeroLineas=0;
                    while((linea = br.readLine()) !=null){
                        numeroLineas++;
                    }
                    System.out.println("Cantidad de Registros: "+ numeroLineas);
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
                        if (nuevalinea[0].equalsIgnoreCase (eliminarDatos) ){
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

                    if (numeroLineas == 1 && eliminado == true){
                        f.delete();
                    }
                } else{
                    System.out.println("No hay registros que eliminar.");
                }
            } 
            
            catch (Exception e){
                System.out.println("Error de E/S "+ e);   
            }
        }
}
