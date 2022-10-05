/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ESaldoNoValido;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author alumno
 */
public class Cuenta implements Fecha, Serializable{
    
    private int numero;
    private transient String titular;
    private double saldo;
    private double saldoMinimo;
    private Calendar fecha;

    public Cuenta() {
    }
    
    public Cuenta(String titular, double saldo, double saldoMinimo, Calendar fecha) throws ESaldoNoValido {
        controlSaldo();
        this.numero = generarAleatorio(100, 1);
        this.titular = titular;
        this.saldo = saldo;
        this.saldoMinimo = saldoMinimo;
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", fecha=" + fecha + '}';
    }
    
    //Métodos
    
    public int generarAleatorio(int max, int min){
        Random aleatorio = new Random();
        int num;
        
        num = aleatorio.nextInt(max - min + 1) + min;
        
        return num;
    }

    @Override
    public int dia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int mes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int año() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void controlSaldo() throws ESaldoNoValido{
        if(saldo < saldoMinimo){
            throw new ESaldoNoValido("El saldo " + this.saldo + " €, no debe ser menor que "
                    + "el saldo mínimo < " + this.saldoMinimo +  "€.");
        }
    }
    
}
