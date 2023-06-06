package com.mycompany.proyectofinal;

public class vehiculos {
    //atributos del vh 
    private String Numplaca;
    private String Marcavh;
    private String Lineavh;
    private String Modelovh;
    private String Colorvh;
    private int Nitcliente;
    private int  Estadoreg;
    
    public vehiculos( String Numplaca, String Marcavh, String Lineavh, String Modelovh, String Colorvh, int Nitcliente){
        this.Numplaca=Numplaca;
        this.Marcavh= Marcavh;
        this.Lineavh= Lineavh;
        this.Modelovh=Modelovh;
        this.Colorvh=Colorvh;
        this.Nitcliente=Nitcliente;
        this.Estadoreg=1;
    }
    
    //getters
    public String getNumplaca(){
        return Numplaca;
    }
    
    public String getMarcavh(){
        return Marcavh;
    }
    
    public String getLineavh(){
        return Lineavh;
    }
    
    public String getModelovh(){
        return Modelovh;
    }   
    
    public String getColorvh(){
        return Colorvh;
    }
    
    public int getNitcliente(){
        return Nitcliente;
    }
    
    public int getEstadoreg(){
        return Estadoreg;
    }
    
    // setters 
    public void setNumplaca(String Numplaca){
        this.Numplaca= Numplaca;
    }
    
    public void setMarcavh(String Marcavh){
        this.Marcavh= Marcavh;
    }
    
    public void setLineavh(String Lineavh){
        this.Lineavh= Lineavh;
    }
    
    public void setModelovh(String Modelovh){
        this.Modelovh= Modelovh;
    }
    
    public void setColorvh(String Colorvh){
        this.Colorvh= Colorvh;
    }
    
    public void setNitcliente(int Nitcliente){
        this.Nitcliente=Nitcliente;
    }
    
    public void setEstadoreg(int Estadoreg){
        this.Estadoreg=Estadoreg;
    }
    
    @Override
    public String toString () {
        return "Vehiculo { con numero de placa"+ Numplaca +" , Marca del vehiculo "+ Marcavh + ",  Linea "+ Lineavh+ ", con Modelo " + Modelovh + ", del color "+ Colorvh + "y es del cliente con Nit " + Integer.toString(Nitcliente )+ "Estadoreg = " + Integer.toString(Estadoreg) + "]";                               
    }
}
