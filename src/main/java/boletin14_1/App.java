/**
* App: Clase main, dedicada a creacion de objetos y su uso.
*
* @author Rubén Núñez González
* @version 25.11.22
*/
package boletin14_1;

import org.danielcastelao.ruben.CPU;
import org.danielcastelao.ruben.Monitor;
import org.danielcastelao.ruben.Teclado;

public class App {

    public static void main(String[] args) {
        //*Instanciar objeto obxmo de la clase Monitor
        Monitor obxmo = new Monitor(22.5f);
        //*Instanciar objeto obxte de la clase Teclado
        Teclado obxte = new Teclado("Razer");
        //*Instanciar objeto obxpro de la clase CPU
        CPU obxpro = new CPU(3);
        //*Instanciar objeto obxord de la clase Ordenador
        Ordenador obxord = new Ordenador(obxmo,obxte,obxpro,399.99f);
        //*Mostrar todos los datos.
        System.out.println(obxord.toString());
    }
}
