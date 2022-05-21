package cuentas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * En esta clase se  ejecutan los programas
 * @author cristian g. otazo diaz
 * @version 18/05/2022
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }
    
    //Comentario añadido para el ejercicio de GIT
    public static void operativa_cuenta(float cantidad) {
        // TODO code application logic here
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
