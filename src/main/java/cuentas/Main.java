/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cuentas;

/**
 * 
 * @author Ismael 
 */
public class Main {

    /**
     * Clase main
     * @param args
     */
    public static void main(String[] args) {
        
        operativa_cuentas(null);
    }
    
    /**
     * Clase refactorizada operativa_cuentas
     * @param cantidad 
     */
    public static void operativa_cuentas(Float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        
        /**
         * Instanciacioón del objeto cuenta1
         */
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        /**
         * control de excepción con retirar de la cuenta con el objeto cuenta1 el valor de 2300
         */
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        /**
         * Control de excepción con un ingreso de 695 con el objeto cuenta1.
         */
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

