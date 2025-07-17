/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22025.clase10;

/**
 *
 * @author viti
 */
public class C22025Clase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa que tengo  dos  vectores de cuentas bancarias Banco Nacional y Banco de Costa Rica
        Estos dos objetos debe ser diferente
        Banco nacional tiene los siguientes atributos cuentaIBAN, Cedula del cliente y Monto
        Banco Costa Rica tiene los siguientes atributos cuentaIBAN, Cedula del cliente, nombreDelCliente, numeroSimpe y Monto
        Con esta información debo crear un nuevo vector de objeto con las dos informaciones BNIBAN, BCRIBAN, cedula ,  BNMonto, BCRMonto, Total
        Esta información se debe de imprimir Si un usuario no tiene cuentas en alguno de los bancos los valores deben ser N/A.
        El programa puede solicitar la data o pueden quemarla desde el código

        */
        
        // TODO code application logic here
        
        BancoNacional bn[] = new BancoNacional[5];
        BancoCostaRica bcr[]= new BancoCostaRica[4];
        BancoCentral central[]= new BancoCentral[9];
        UtilVector util =new UtilVector();
        util.llenaDataAleatoria(bcr);
        util.llenaDataAleatoria(bn);
        util.imprimeDatosBCR(bcr);
        util.imprimeDatosBN(bn);
        util.mergeCuentas(central, bcr, bn);
        util.imprimeDatosCentral(central);
        
    }
    
}
