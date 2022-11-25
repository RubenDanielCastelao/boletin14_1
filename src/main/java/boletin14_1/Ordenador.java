/**
* Ordenador: Declaracion de las caracteristicas de ordenador, y relacion con las otras clases.
*
* @author Rubén Núñez González
* @version 25.11.22
*/
package boletin14_1;

import org.danielcastelao.ruben.CPU;
import org.danielcastelao.ruben.Monitor;
import org.danielcastelao.ruben.Teclado;

public class Ordenador {
    //*Caracteristicas del monitor
    private Monitor mo;
    //*Caracteristicas del teclado
    private Teclado te;
    //*Caracteristicas de la CPU
    private CPU pro;
    //*Precio del ordenador
    private float precio;
    /*Constructor:
    Constructor por defecto de la clase Ordenador
    */
    public Ordenador() {
    }
    /*Constructor:
    @param mo Caracteristicas monitor
    @param te Caracteristicas teclado
    @param pro Caracteristicas cpu
    @param precio Precio del ordenador
    */
    public Ordenador(Monitor mo, Teclado te, CPU pro, float precio) {
        this.mo = mo;
        this.te = te;
        this.pro = pro;
        this.precio = precio;
    }
    /*Getter
    @return precio
    */
    public float getPrecio(){
        return precio;
    }
    /*Getter
    @return mo
    */
    public Monitor getMo() {
        return mo;
    }
    /*Getter
    @return te
    */
    public Teclado getTe() {
        return te;
    }
    /*Getter
    @return pro
    */
    public CPU getPro() {
        return pro;
    }
    /*Setter
    @param mo
    Dar valor a mo
    */
    public void setMo(Monitor mo) {
        this.mo = mo;
    }
    /*Setter
    @param te
    Dar valor a te
    */
    public void setTe(Teclado te) {
        this.te = te;
    }
    /*Setter
    @param pro
    Dar valor a pro
    */
    public void setPro(CPU pro) {
        this.pro = pro;
    }
    /*Setter
    @param precio
    Dar valor a precio
    */
    public void setPrecio(float precio){
        this.precio = precio;
    }
    /*toString
    Mostrar las variables de la clase
    */
    @Override
    public String toString() {
        return  mo + ", " + te + ", " + pro + ", precio=" + precio;
    }
    
}
