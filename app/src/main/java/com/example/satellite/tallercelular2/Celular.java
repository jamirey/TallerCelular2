package com.example.satellite.tallercelular2;

public class Celular {

    private String marca;
    private String so;
    private String ram;
    private String color;
    private String precio;

    public Celular(String marca, String so, String ram, String color, String precio) {
        this.marca = marca;
        this.so = so;
        this.ram = ram;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
