/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * La clase CCuenta contempla los métodos ingresar y retirar de un cajero automático.
 * @author Marta Gómez Martos
 * @version 1.0
 * @since 14/02/2023
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    public CCuenta() {
    }

    /**
     * 
     * @param nom parámetro de tipo string que hace referencia al atributo
     * nombre, no se utiliza en esta CCuenta.
     * @param cue parámetro de tipo String que hace referencia al atributo
     * cuenta, no se utiliza en la clase CCuenta.
     * @param sal hace referencia al atributo saldo, que es la cantidad de
     * dinero que el usuario tiene disponible, aumenta con el método ingresar
     * y disminuye con el método retirar.
     * @param tipo el método constructor incluye tipo en sus parámetros pero
     * no lo implementa posteriormente. Este elemento tendría que tratarse en 
     * próximas versiones.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * 
     * @return el método estado devuelve el valor contenido en la variable 
     * estado
     */
    public double estado() {
        return saldo;
    }

    /**
     * 
     * @param cantidad es el dinero que se va a ingresar.
     * @throws Exception No es posible ingresar una cantidad negativa
     * es decir una cantidad menor de 0.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * 
     * @param cantidad es el dinero que se va a retirar del cajero.
     * @throws Exception No se puede retirar una cantidad negativa (menor 
     * que cero) ni se puede retirar una cantidad superior al saldo disponible.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * @return the cuenta, el método getter devuelve el valor que contiene
     * la variable cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @return the nombre, el método getter que devuelve el valor contenido en 
     * la variable nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the saldo, el método getter devuelve el valor contenido en la 
     * variable saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return the tipoInterés, el método getter devuelve el valor contenido en 
     * la variable tipoInterés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param cuenta el método setter pasa como parámetro el String cuenta
     * que es el mismo que el atributo cuenta de la clase CCuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @param nombre el método setter pasa como parámetro el String nombre
     * que es el mismo que el atributo nombre de la clase CCuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param saldo el método setter pasa como parámetro el double saldo
     * que es el mismo que el atributo ¡saldo de la clase CCuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @param tipoInterés el método setter pasa como parámetro el double 
     * tipoInteres que es el mismo que el atributo tipoInteres de la clase CCuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

}
