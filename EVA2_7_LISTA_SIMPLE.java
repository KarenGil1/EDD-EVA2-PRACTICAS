/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vane_
 */
public class EVA2_7_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear una lista
        Lista miLista = new Lista(); //lista vacía
        /*int[] miArreglo = new int[1000000];
        for (int i = 0; i < miArreglo.length; i++){
            miArreglo[i] = (int)(Math.random() * 1000);
        }
        for (int i=0; i<1000000; i++){
            miLista.add(new Nodo(1));
            
        } */
        miLista.add(new Nodo(100));
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        miLista.add(new Nodo(500));
        miLista.printList();
        miLista.insertAt(0, new Nodo(9999));
        System.out.println("\nDespues de insertar al inicio");
        miLista.printList();
       
    }

}
