/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*medodo recursivo
1. metodo que se llama a si mismo
2. debe existir una manera de detener la recursividad
package eva2_2_for_recursivo;*/

public class EVA2_2_FOR_RECURSIVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fakeForDown(5);
    }

    public static void fakeForDown(int iVal) {
        System.out.print(iVal + "-");
        if(iVal>1){
        fakeForDown(iVal - 1);//esto es lo que debemos controlar
        
    }
    
    }
}
