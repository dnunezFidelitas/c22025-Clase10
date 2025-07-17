/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025.clase10;

/**
 *
 * @author viti
 */
public class BancoCentral {
    //BNIBAN, BCRIBAN, cedula ,  BNMonto, BCRMonto, Total
    private String ibanBN;
    private String ibanBCR;
    private int cedula;
    private double montoBN;
    private double montoBCR;
    private double total;

    public BancoCentral(String ibanBN, String ibanBCR, int cedula, double montoBN, double montoBCR, double total) {
        this.ibanBN = ibanBN;
        this.ibanBCR = ibanBCR;
        this.cedula = cedula;
        this.montoBN = montoBN;
        this.montoBCR = montoBCR;
        this.total = total;
    }

    public BancoCentral() {
    }

    public String getIbanBN() {
        return ibanBN;
    }

    public void setIbanBN(String ibanBN) {
        this.ibanBN = ibanBN;
    }

    public String getIbanBCR() {
        return ibanBCR;
    }

    public void setIbanBCR(String ibanBCR) {
        this.ibanBCR = ibanBCR;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getMontoBN() {
        return montoBN;
    }

    public void setMontoBN(double montoBN) {
        this.montoBN = montoBN;
    }

    public double getMontoBCR() {
        return montoBCR;
    }

    public void setMontoBCR(double montoBCR) {
        this.montoBCR = montoBCR;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "BancoCentral{" + "ibanBN=" + ibanBN + ", ibanBCR=" + ibanBCR + ", cedula=" + cedula + ", montoBN=" + montoBN + ", montoBCR=" + montoBCR + ", total=" + total + '}';
    }
    
    
    
    
    
}
