/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025.clase10;

/**
 *
 * @author viti
 */
public class BancoNacional {
    
    //atributos cuentaIBAN, Cedula del cliente y Monto
    private String cuentaIBAN;
    private int cedula;
    private double monto;

    public BancoNacional(String cuentaIBAN, int cedula, double monto) {
        this.cuentaIBAN = cuentaIBAN;
        this.cedula = cedula;
        this.monto = monto;
    }

    public BancoNacional() {
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "BancoNacional{" + "cuentaIBAN=" + cuentaIBAN + ", cedula=" + cedula + ", monto=" + monto + '}';
    }
    
    
    
    
}
