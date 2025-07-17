/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025.clase10;

/**
 *
 * @author viti
 */
public class BancoCostaRica {
    //atributos cuentaIBAN, Cedula del cliente, nombreDelCliente, numeroSimpe y Monto
    private String cuentaIBAN;
    private int cedula;
    private String nombre;
    private int numeroSimpe;
    private double monto;

    public BancoCostaRica(String cuentaIBAN, int cedula, String nombre, int numeroSimpe, double monto) {
        this.cuentaIBAN = cuentaIBAN;
        this.cedula = cedula;
        this.nombre = nombre;
        this.numeroSimpe = numeroSimpe;
        this.monto = monto;
    }

    public BancoCostaRica() {
    }

    public String getCuentaIBAN() {
        return cuentaIBAN;
    }

    public void setCuentaIBAN(String cuentaIBAN) {
        this.cuentaIBAN = cuentaIBAN;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSimpe() {
        return numeroSimpe;
    }

    public void setNumeroSimpe(int numeroSimpe) {
        this.numeroSimpe = numeroSimpe;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "BancoCostaRica{" + "cuentaIBAN=" + cuentaIBAN + ", cedula=" + cedula + ", nombre=" + nombre + ", numeroSimpe=" + numeroSimpe + ", monto=" + monto + '}';
    }
    
    
    
    
}
