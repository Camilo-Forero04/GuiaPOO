/*
  Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package TelefonosMovilesService;

import java.util.Arrays;
import java.util.Scanner;
import poo14.TelefonosMoviles;

/**
 *
 * @author PAVILION
 */
public class TelefonosMovilesService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TelefonosMoviles t1 = new TelefonosMoviles();
    public TelefonosMoviles cargarCelular(){
        
        System.out.println("Digite la marca de su celular: ");
        t1.setMarca(leer.next());
        System.out.println("Inserte el precio de su celular: ");
        t1.setPrecio(leer.nextInt());
        System.out.println("Ingrese el modelo de su celular: ");
        t1.setModelo(leer.next());
        System.out.println("Digite la cantidad de memoria RAM de su dispositivo: ");
        t1.setMemoriaRam(leer.nextInt());
        System.out.println("¿Cual es el almacenamiento de su dispositivo? ");
        t1.setAlmacenamiento(leer.nextInt());
        return t1;
    }
     public void ingresarCodigo(){
      
         System.out.println("Ingrese los 7 numeros de su codigo: ");
         for (int i = 0; i < 7; i++) {
             t1.getCodigo()[i]=leer.nextInt();
         }
    }
    public void mostrarDatos(){
        System.out.println("La marca de su celular es: "+t1.getMarca());
        System.out.println("El precio de su celular es de: "+t1.getPrecio()+"$");
        System.out.println("El modelo de su celular es: "+t1.getModelo());
        System.out.println("La cantidad de memoria RAM que dispone su dispositivo: "+t1.getMemoriaRam());
        System.out.println("El almacenamiento de su dispositivo es de: "+t1.getAlmacenamiento());
        System.out.println("Su codigo es el siguiente: ");
        System.out.println(Arrays.toString(t1.getCodigo()));
        
    }
    public void menuOpciones() {

        int opcion;
        String conf = "n";

        do {

            System.out.println("MENU:");
            System.out.println("1. Cargar celular");
            System.out.println("2. Ingresar codigo");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Salir");

            opcion = leer.nextInt();

            if (opcion == 4) {

                do {
                    System.out.println("Esta seguro que quiere salir? s/n");
                    conf = leer.next();
                } while (!conf.equalsIgnoreCase("n") && !conf.equalsIgnoreCase("s"));
                if (conf.equalsIgnoreCase("s")) {
                    break;
                }
            }

            if (opcion > 0 && opcion < 4) {
                switch (opcion) {
                    case 1:
                        cargarCelular();
                        break;
                    case 2:
                        ingresarCodigo();
                        break;
                    case 3:
                        mostrarDatos();
                        break;
                }
            }
        } while (conf.equalsIgnoreCase("n"));

        System.out.println("El programa ha terminado");
}
     }
