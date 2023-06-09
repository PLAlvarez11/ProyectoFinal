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
    static void eliminarRegistro(String eliminar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el CUI del cliente a eliminar:");
        String cui = sc.nextLine();
        try {
            File f = new File("clientes.txt");
            FileWriter fw = new FileWriter(f);
            boolean encontrado;
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                FileReader fr = new FileReader(eliminar);
                try (BufferedReader br = new BufferedReader(fr)) {
                    String line = "";
                    encontrado = false;
                    while ((line = br.readLine()) != null) {
                        String[] fields = line.split("%");
                        String nuevalinea = "";
                        if (fields[1].equals(cui)) {
                            encontrado = true;
                            nuevalinea = fields[9].replace("1","2");
                        } else {
                            bw.write(nuevalinea);
                            bw.newLine();
                        }
                    }
                }
            }
            if (!encontrado) {
                System.out.println("No se encontro ningun registro con el CUI especificado.");
            } else {
                System.out.println("El registro se elimino correctamente.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    static void cambiar(String cambiardato) {
        Scanner input = new Scanner(System.in);
        String datoacambiar = "";
        String newdato = "";
        System.out.println("Ingrese el dato del cliente que desea editar");
        System.out.println("Presione 1 para cambiar nombre");
        System.out.println("Presione 2 para cambiar apellido");
        System.out.println("Presione 3 para cambiar numero de telefono");
        System.out.println("Presione 4 para cambiar direccion del domicilio");
        System.out.println("Presione 5 para cambiar trabajo");
        System.out.println("Presione 6 para cambiar direccion del trabajo");
        System.out.println("Presione 7 para cambiar cui");
        System.out.println("Presione 8 para cambiar nit");
        String opc1 = sc.next();
        int opc = Integer.parseInt(opc1);
        while(opc<1 || opc>8){
            System.out.println("Opcion no valida, intentelo de nuevo");
            opc1 = sc.next();
        }
        switch(opc){
            case 1:
            System.out.print("Porfavor escriba el nombre a cambiar");
            datoacambiar = sc.next();
            System.out.println("Porfavor escriba el nuevo nombre");
            newdato = sc.next();
            int x = 6;
            break;
            case 2:
            System.out.print("Porfavor escriba el apellido a cambiar");
            datoacambiar = sc.next();
            System.out.println("Porfavor escriba el nuevo apellido");
            newdato = sc.next();
            x = 7;
            break;
            case 3:
            System.out.print("Porfavor escriba el numero telefonico a cambiar");
            datoacambiar = sc.next();
            System.out.println("Porfavor escriba el nuevo numero telefonico");
            newdato = sc.next();
            x = 8;
            break;
            case 4:
            System.out.print("Porfavor escriba el direccion del domicilio a cambiar");
            datoacambiar = sc.next();
            System.out.println("Porfavor escriba el nuevo domicilio");
            newdato = sc.next();
            x = 2;
            break;
            case 5:
            System.out.print("Porfavor escriba el trabajo a cambiar");
            datoacambiar = sc.next();
            System.out.println("Porfavor escriba el nuevo trabajo");
            newdato = sc.next();
            x = 3;
            break;
            case 6:
            System.out.print("Porfavor escriba el direccion del trabajo a cambiar");
            datoacambiar = sc.next();
            System.out.println("Porfavor escriba el nuevo domicilio laboral");
            newdato = sc.next();
            x = 4;
            break;
            case 7:
            System.out.print("Porfavor escriba el cui a cambiar");
            datoacambiar = sc.next();
            System.out.println("Porfavor escriba el nuevo cui");
            newdato = sc.next();
            x = 0;
            break;
            case 8:
            System.out.print("Porfavor escriba el nit a cambiar");
            datoacambiar = sc.next();
            System.out.println("Porfavor escriba el nuevo nit");
            newdato = sc.next();
            x = 1;
            break;
        }
        try {
            File f = new File("clientes.txt");
            FileWriter fw = new FileWriter(f);
            boolean encontrado;
            int numerodelineas = 0;
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                FileReader fr = new FileReader(f);
                try (BufferedReader br = new BufferedReader(fr)) {
                    String line = "";
                    encontrado = false;
                    while((line = br.readLine() != null)){
                        numerodelineas++;
                    }
                    String arreglo[] = new String[numerodelineas];
                    int i = 0;
                    String nuevalinea = "";
                    while((linea = br.readLine())!=null){
                        arreglo[i] = line;
                        i++;
                    }
                    for (int j = 0; j < arreglo.lenght; j++){
                        String nuevodato[] = arreglo[j].split("%");
                        if (nuevodato[x].equalsIgnoreCase(datoacambiar)){
                            nuevalinea = arreglo[j].replace(datoacambiar, newdato);
                            bw.newLine();
                            bw.write(nuevalinea);
                            encontrado = true;
                            System.out.println("Cambio hecho.");
                        } else {
                            bw.write(nuevalinea);
                            bw.newLine();
                        }
                    }
                }
            }
            br.close();
            fr.close();
            bw.close();
            fw.close();
            if (!encontrado) {
                System.out.println("No se encontro ningun registro con el dato especificado.");
            } else {
                System.out.println("El registro se cambio correctamente.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}