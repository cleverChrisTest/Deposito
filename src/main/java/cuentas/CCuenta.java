package cuentas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Contiene los atributos y métodos para realizar operaciones sencillas
 * en una cuenta bancaria.
 * @author cristian g. otazo diaz
 * @version 18/05/2022
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * 
     */
    public CCuenta(){}

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo){
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @return
     */
    public double estado(){
        return getSaldo();
    }

    /**
     *
     * @param cantidad
     */
    public void ingresar(double cantidad){
        if (cantidad<0){
            System.out.println("No se puede ingresar una cantidad negativa");
        }
        else{
            setSaldo(getSaldo() + cantidad);
        }
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad){
        if (cantidad <= 0){
            System.out.println("No se puede retirar una cantidad negativa");
        }
        else if (estado()< cantidad){
            System.out.println("No se hay suficiente saldo");
        }
        else {
            setSaldo(getSaldo() - cantidad);
        }
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
}
