/**
* Monitor: Declarar caracteristicas del monitor.
*
* @author Rubén Núñez González
* @version 25.11.22
*/
package org.danielcastelao.ruben;

public class Monitor {
    //*Pulgadas del monitor
    private float pulgadas;
    //*Constructor por defecto
    public Monitor() {
    }
    /*Constructor
    @param pulgadas Pulgadas del monitor
    */
    public Monitor(float pulgadas) {
        this.pulgadas = pulgadas;
    }
    /*Getter
    @return pulgadas
    */
    public float getPulgadas(){
        return pulgadas;
    }
    /*Setter
    @param pulgadas
    Dar valor a pulgadas
    */
    public void setPulgadas(float pulgadas){
        this.pulgadas = pulgadas;
    }
    /*toString
    Mostrar variables de la clase monitor
    */
    @Override
    public String toString() {
        return "Monitor{" + "pulgadas=" + pulgadas + '}';
    }
}
