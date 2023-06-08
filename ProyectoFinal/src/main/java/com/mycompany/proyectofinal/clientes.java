package com.mycompany.proyectofinal;

public class clientes{
    private String cui;
    private int nit;
    private String direccion;
    private String trabajo;
    private String fech;
    private String name;
    private String ape;
    private int numtel;
    private int estado;

    public clientes(String cui, int nit, String direccion, String trabajo, String fech, String name, String ape, int numtel, int estado){
        this.cui=cui;
        this.nit=nit;
        this.direccion=direccion;
        this.trabajo=trabajo;
        this.fech=fech;
        this.name=name;
        this.ape=ape;
        this.numtel=numtel;
        this.estado=estado;
    }
    public void SetCui(String cui){
        this.cui=cui;
    }
    public String GetCui(){
        return this.cui;
    }
    public void SetNit(int nit){
        this.nit=nit;
    }
    public int GetNit(){
        return this.nit;
    }
    public void SetDireccion(String direccion){
        this.direccion=direccion;
    }
    public String GetDireccion(){
        return this.direccion;
    }
    public void SetTrabajo(String trabajo){
        this.trabajo=trabajo;
    }
    public String GetTrabajo(){
        return this.trabajo;
    }
    public void SetFech(String fech){
        this.fech=fech;
    }
    public String GetFech(){
        return this.fech;
    }
    public void SetName(String name){
        this.name=name;
    }
    public String GetName(){
        return this.name;
    }
    public void SetApe(String ape){
        this.ape=ape;
    }
    public String GetApe(){
        return this.ape;
    }
    public void SetNum(int numtel){
        this.numtel=numtel;
    }
    public int GetNum(){
        return this.numtel;
    }
    public void SetEstado(int estado){
        this.estado=estado;
    }
     public int GetEstado(){
        return this.estado;
    }
    
    @Override
    public String toString () {
        return "Cliente: "+name+" "+ape+"nacido en "+fech+" con cui "+cui+" y nit "+nit+" con direccion "+direccion+" que tiene el oficio de "+trabajo+" aceptó que podamos contactarlo al "+numtel+" es de estado " +estado+".";
    }
}