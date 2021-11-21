


//ENVIAR PRACTICAS A PARTIR DE AQUI PARA UNIDAD 2




package eva1_24_for_each;

/**
 *
 * @author vane_
 */
public class EVA1_24_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int[10];

        for (int i = 0; i < iArreglo.length; i++) {
            iArreglo[i] = 100;

        }
        //for-each
        //variable que almacena el valor de cada posicion: arreglo que vamos a leer
        for (int temp : iArreglo) {// valor del primer elemento al ultimo
            System.out.print("[" + temp + "]");

        }
        int[] iDatos = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String [] sCadenas = new String[]{"lunes", "martes", "miercoles", "jueves"};
        for (String sCadena : sCadenas) {
            System.out.println(sCadena);
            
        }
    }

}
