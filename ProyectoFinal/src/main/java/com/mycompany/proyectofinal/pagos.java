package com.mycompany.proyectofinal;

public class pagos {
    //Atributo
    private String numeroTarjeta;
    private int tipoPago;
    private int monto;
    private int numAutorizacion;
    private String fechaPago;
    
    //Constructor
    public pagos(String numeroTarjeta, int tipoPago, int monto, int numAutorizacion, String fechaPago){
        this.numeroTarjeta = numeroTarjeta;
        this.tipoPago = tipoPago;
        this.monto = monto;
        this.numAutorizacion = numAutorizacion;
        this.fechaPago = fechaPago;
    }
    
    //Getters
    public String getNumeroTarjeta(){
        return numeroTarjeta;
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
    
    //Setters
    public void setNumeroTarjeta(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
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
    
    @Override
    public String toString () {
        return "Numero de autorizacion: " + Integer.toString(numAutorizacion) + " pago realizado con " + tipoPago + " con un monto de " + monto + " con el numero de tarjeta " + numeroTarjeta + " en la fecha " + fechaPago ;                               
    }
}
