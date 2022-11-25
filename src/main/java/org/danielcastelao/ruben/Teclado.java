/**
* Teclado: Declarar caracteristicas del teclado.
*
* @author Rubén Núñez González
* @version 25.11.22
*/
package org.danielcastelao.ruben;

public class Teclado {
    //*Marca del teclado
    private String marca;
    //*Constructor por defecto
    public Teclado() {
    }
    /*Constructor
    @param marca Marca del monitor
    */
    public Teclado(String marca) {
        this.marca = marca;
    }   
    /*Getter
    @return marca
    */
    public String getMarca(){
        return marca;
    }
    /*Setter
    @param marca
    Dar valor a marca
    */
    public void setMarca(String marca){
        this.marca = marca;
    }
    /*toString
    Mostrar las variables de la clase teclado
    */
    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + '}';
    }
    
}
