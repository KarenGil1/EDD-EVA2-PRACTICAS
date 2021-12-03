/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_lista_simple;

/**
 *
 * @author vane_
 */
public class Lista {//lista simplemente enlazada

    private Nodo inicio;//punto de partida
    private Nodo fin;

    public Lista() {
        inicio = null;//lista vacia   
        fin = null;
    }

    //AGREGAR NODOS
    public void add(Nodo nuevo) {
        if (inicio == null) {//lista vacia
            inicio = nuevo;//conectamos el primer nodo a la lista
            fin = nuevo;
        } else {//lista tiene nodos
            /*Nodo temp = inicio;//aqui empezamos
        
        while(temp.getSiguiente() != null){
            temp = temp.getSiguiente();
        }
        temp.setSiguiente(nuevo);//conectamos al final de la lista al nuevo nodo*/
            fin.setSiguiente(nuevo);
            fin = nuevo;

        }
    }

    //IMPRIMIR LA LISTA
    public void printList() {
        Nodo temp = inicio;//aqui empezamos
        while (temp != null) {
            System.out.print(temp.getDato() + " - ");
            temp = temp.getSiguiente();
        }
    }//BORRAR LA LISTA

    public void clear() {//borramos la lista
        inicio = null;
        fin = null;
    }

    //CONTAR LOS NODOS:
    public int length() {
        int iCont = 0;
        Nodo temp = inicio;//aqui empezamos
        while (temp != null) {
            iCont++;
            temp = temp.getSiguiente();
        }
        return iCont;

    }

    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public int get(int pos) throws Exception {
        //VERIFICACION
        if (isEmpty()) {
            throw new Exception("No hay valores almacenados en la lista!!");
        } else {
            if ((pos < 0) || (pos >= length())) {
                throw new Exception("El valor " + pos + "no es una posición válida en la lista!!");
            }
        }
        Nodo temp = inicio;
        for (int i = 0; i < pos; i++) {
            //movernos
            temp = temp.getSiguiente();
        }
        return temp.getDato();
    }
    public void insertAtBegining(Nodo nuevo){
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    }
        
    
    public void insertAt(int pos, Nodo nuevo){
        if(pos == 0){
            insertAtBegining(nuevo);
        }else{
        
    }
}
}