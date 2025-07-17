/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025.clase10;

import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class UtilVector {
    
    
     public void llenaDataAleatoria(BancoNacional[] vector ){
        for (int i = 0; i < vector.length; i++) {
            Random numero = new Random();
            vector[i]= new BancoNacional("CR"+i, i, numero.nextInt(10000000));
        }
    }
     
     public void llenaDataAleatoria(BancoCostaRica[] vector ){
        for (int i = 0; i < vector.length; i++) {
            Random numero = new Random();
            if (i ==2 )
                 vector[i]= new BancoCostaRica("CR"+99, 99, "nombre "+numero.nextInt(1000), numero.nextInt(99999999) , numero.nextInt(10000000));
            else
                vector[i]= new BancoCostaRica("CR"+i, i, "nombre "+numero.nextInt(1000), numero.nextInt(99999999) , numero.nextInt(10000000));
        }
    }
    
   
     public void imprimeDatosBCR(BancoCostaRica[] vector ){
        StringBuilder resultado=new StringBuilder();
        resultado.append("BCR\n");
        for (int i = 0; i < vector.length; i++) {
            resultado.append(vector[i].toString());
            resultado.append("\n");
        }
        
        JOptionPane.showMessageDialog(null, resultado );
    }
     
    public void imprimeDatosBN(BancoNacional[] vector ){
        StringBuilder resultado=new StringBuilder();
        resultado.append("BN\n");
        for (int i = 0; i < vector.length; i++) {
            resultado.append(vector[i].toString());
            resultado.append("\n");
        }
        
        JOptionPane.showMessageDialog(null, resultado );
    }
     
    public void imprimeDatosCentral(BancoCentral[] vector ){
        StringBuilder resultado=new StringBuilder();
        resultado.append("Central\n");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null){
                resultado.append(vector[i].toString());
                resultado.append("\n");
            }
        }
        
        JOptionPane.showMessageDialog(null, resultado );
    }
      
    public void mergeCuentas(BancoCentral[] central, BancoCostaRica[] bcr, BancoNacional[] bn){
        int contador=0;
        //lleno central con bn
        //lleno centra con bcr
        
        
        //busca y actualiza toda la data de BCR
        
        for (int i = 0; i <  bcr.length; i++) { //ciclo para en BCR
            central[contador]= new BancoCentral("", bcr[i].getCuentaIBAN(), bcr[i].getCedula(), 0, bcr[i].getMonto(), bcr[i].getMonto());
            contador++;
        }
        
        //busca las cuentas que no estan en el bcr
        for (int i = 0; i < bn.length; i++) { //ciclo del BN
            boolean loActualizo=false;
            for (int j = 0; j < central.length; j++) { //ciclo del central
                if (central[j]!=null){
                    if (bn[i].getCedula()==central[j].getCedula()){
                        // Actualizo el registro 
                        central[j].setIbanBN(bn[i].getCuentaIBAN());
                        central[j].setMontoBN(bn[i].getMonto());
                        central[j].setTotal(central[j].getMontoBCR()+central[j].getMontoBN());
                        loActualizo=true;
                    }
                }
            }
            if (loActualizo==false){ //lo agrego
                 central[contador]= new BancoCentral(bn[i].getCuentaIBAN(), "", bn[i].getCedula(), bn[i].getMonto(), 0, bn[i].getMonto());
                contador++;
            }
             
            
        }
        
    
    
    }
    
}
