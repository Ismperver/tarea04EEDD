package cuentas;

/**
 *
 * @author Ismael
 * @version Versión refactorizada de la clase CCuenta del proyecto Depósito.
 */

public class CCuenta {
    
    /**
     * Atributos privados de la clase CCuenta.
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * Contructor vacio de la clase CCuenta.
     */
    public CCuenta(){
    }
    
    /**
     * Constructor de la clase CCuenta sin valores definidos.
     * @param nom variable tipo String
     * @param cue variable tipo String
     * @param sal Variable tipo double
     * @param tipo Variable tipo double
     */
    public CCuenta(String nom, String cue, double sal, double tipo){
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

     /**
     * Getter del atributo nombre.
     * @return the nombre de la clase CCuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del atributo nombre.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo cuenta.
     * @return the cuenta de la clase CCuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter del atributo cuenta.
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter del atributo saldo.
     * @return the saldo de la clase CCuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter del atributo saldo.
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter del atributo tipoInteres.
     * @return the tipoInterés de la clase CCuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Setter del atributo tipoInteres.
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    /**
     * Método que devuelve el saldo, con un getter del atributo privado saldo.
     * @return saldo actual
     */
    public double estado(){
        return getSaldo();
    }
    /**
     * Método que devuelve una excepción si se pretende ingresar una cantidad negativa.
     * @param cantidad del tipo double
     * @throws Exception con un mensaje al usuario
     */
    public void ingresar(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método que devuelve una excepción si la cantidad a retirar es negativa o no existe saldo susificente.
    * @param cantidad del tipo double
    * @throws Exception con un control IF dependiendo de si la cantidad es menor igual a 0,
    * o si la cantidad es mayor al saldo
    */
    public void retirar(double cantidad) throws Exception{
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
