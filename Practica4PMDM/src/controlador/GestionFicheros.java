/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class GestionFicheros{
    
    public static void leerFichero(Nodo [] arrayNodos) {
        FileInputStream archivoLectura;
        ObjectInputStream recupera_fichero;
        try {
            //Este método leera el fichero de objeto y lo mostrará por pantalla.
            System.out.println("Leyendo fichero");
            //Cremos un flujo de entrada de Fichero
            archivoLectura = new FileInputStream(System.getProperty("user.dir")+ "\\cuentas.dat");
            recupera_fichero = new ObjectInputStream(archivoLectura);
            // Creamos un array auxiliar donde guardaremos el array leido del fichero
            arrayNodos = (Nodo[])recupera_fichero.readObject();
            
            // cerramos el flujo ObjectInputStream
            recupera_fichero.close();
            // Ahora vamos a imprimir la información de dicho objeto. Lo hacemos mediante un "for-each" que recorra el array recuperado.
            for(Nodo n: arrayNodos) {
                System.out.println(n);
            }
            
            archivoLectura.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir los datos");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: Clase no encontrada");
        }
    }
    
    
    public static void escribirFichero(Nodo [] arrayNodos) {
        //Declaramos un flujo salida de tipo fichero y el flujo de objeto
        FileOutputStream flujoSalidaFichero;
        ObjectOutputStream flujoEscritura;
        
        try {
            // Instancio los flujos
            System.out.println("hola1");
            flujoSalidaFichero = new FileOutputStream(System.getProperty("user.dir")+ "\\cuentas.dat");
            System.out.println("hola2");
            flujoEscritura = new ObjectOutputStream(flujoSalidaFichero);
            System.out.println("hola3");
            flujoEscritura.writeObject(arrayNodos);
            System.out.println("hola4");
            //Cerramos flujo
            flujoEscritura.close();
            flujoSalidaFichero.close();
        } catch (IOException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// Fin crear fichero
    
    
}
