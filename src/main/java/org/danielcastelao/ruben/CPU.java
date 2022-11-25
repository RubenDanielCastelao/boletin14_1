/**
* CPU: Declarar caracteristicas del procesador.
*
* @author Rubén Núñez González
* @version 25.11.22
*/
package org.danielcastelao.ruben;

public class CPU {
    //*Velocidad del CPU
    private int velocidade;
    //*Constructor por defecto
    public CPU() {
    }
    /*Constructor
    @param velocidade Velocidad del procesador
    */
    public CPU(int velocidade) {
        this.velocidade = velocidade;
    }
    /*Getter
    @return velocidade
    */
    public int getVelocidade(){
        return velocidade;
    }
    /*Setter
    @param velocidade
    Dar valor a velocidade
    */
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    /*toString
    Muestra las variables de la clase CPU
    */
    @Override
    public String toString() {
        return "CPU{" + "velocidade=" + velocidade + '}';
    }
    
}
