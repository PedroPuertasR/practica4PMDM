/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Window;
import javax.accessibility.AccessibleRole;

/**
 *
 * @author alumno
 */
public class ESaldoNoValido extends Exception{

    public ESaldoNoValido() {
    }

    public ESaldoNoValido(String message) {
        super(message);
    }
    
}
