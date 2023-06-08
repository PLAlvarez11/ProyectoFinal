package com.mycompany.proyectofinal;

public class pagos {
    //Atributo
    private String numeroParqueo;
    private int tipoPago;
    private int monto;
    private int numAutorizacion;
    private String fechaPago;
    private String NIT;
    
    //Constructor
    public pagos(String numeroParqueo, int tipoPago, int monto, int numAutorizacion, String fechaPago, String NIT){
        this.numeroParqueo = numeroParqueo;
        this.tipoPago = tipoPago;
        this.monto = monto;
        this.numAutorizacion = numAutorizacion;
        this.fechaPago = fechaPago;
        this.NIT = NIT;
    }
    
    //Getters
    public String getNumeroParqueo(){
        return numeroParqueo;
    }
    
    public int getTipoPago(){
        return tipoPago;
    }
    
    public int getMonto(){
        return monto;
    }
    
    public int getNumAutorizacion(){
        return numAutorizacion;
    }
    
    public String getFechaPago(){
        return fechaPago;
    }
    
    public String getNIT(){
        return NIT;
    }
    
    //Setters
    public void setNumeroParqueo(String numeroParqueo){
        this.numeroParqueo = numeroParqueo;
    }
    
    public void setMonto(int monto){
        this.monto = monto;
    }
   
    public void setTipoPago(int tipoPago){
        this.tipoPago = tipoPago;
    }
    
    public void setNumeroAutorizacion(int numeroAutorizacion){
        this.numAutorizacion = numeroAutorizacion;
    }
    
    public void setFecha(String fecha){
        this.fechaPago = fecha;
    }
    
    public void setNIT(String NIT){
        this.fechaPago = NIT;
    }
    
    @Override
    public String toString () {
        return "Numero de autorizacion: " + Integer.toString(numAutorizacion) + " pago realizado con " + tipoPago + " con un monto de " + monto + " con el numero de parqueo " + numeroParqueo + " en la fecha " + fechaPago ;                               
    }
}
