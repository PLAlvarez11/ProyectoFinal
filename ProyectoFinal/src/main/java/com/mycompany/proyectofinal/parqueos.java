package com.mycompany.proyectofinal;

public class parqueos {
    private String numeroParqueo;
    private String numeroPlaca;
    private String NIT;
    private String fechaRegistro;
	    
    public parqueos(String numeroParqueo, String numeroPlaca, String NIT, String fechaRegistro) {
        this.numeroParqueo = numeroParqueo;
        this.numeroPlaca = numeroPlaca;
        this.NIT = NIT;
        this.fechaRegistro = fechaRegistro;
        }
        public void setNumeroParqueo(String numeroParqueo) {
            this.numeroParqueo = numeroParqueo;
        }
        public void setNumeroPlaca(String numeroPlaca) {
            this.numeroPlaca = numeroPlaca;
        }
        public void setNIT(String NIT) {
            this.NIT = NIT;
        }
        public void setFechaRegistro(String fechaRegistro) {
            this.fechaRegistro = fechaRegistro;
        }
        public String getNumeroParqueo() {
            return numeroParqueo;
        }
        public String getNumeroPlaca(){
            return numeroPlaca;
        }
        public String getNIT(){
            return NIT;
        }
        public String getFechaRegistro(){
            return fechaRegistro;
        }
        
        @Override
        public String toString () {
            return "\n__________Datos__________\nNumero de Parqueo: " + numeroParqueo + " \nNumero de Placa: " + numeroPlaca + " \n Numero de NIT: " + NIT + " \nFecha de Registro: " + fechaRegistro;
        }
}
