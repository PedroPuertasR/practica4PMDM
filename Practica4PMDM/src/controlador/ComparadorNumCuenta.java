/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Comparator;
import modelo.Cuenta;

/**
 *
 * @author alumno
 */
public class ComparadorNumCuenta implements Comparator <Nodo>{
    
    @Override
    public int compare(Nodo n1, Nodo n2) {
        
        Cuenta comp1 = (Cuenta) n1.getTypo();
        Cuenta comp2 = (Cuenta) n2.getTypo();

	if(n1.getIndice() < n2.getIndice()) {
            return -1;
	}else if(n1.getIndice() == n2.getIndice()) {
            return comp1.getTitular().toLowerCase().compareTo(comp2.getTitular().toLowerCase());
	}else {
            return 1;
	}
}
}
