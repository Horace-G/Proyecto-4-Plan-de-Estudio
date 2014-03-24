/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

/**
 *
 * @author Horacio Galdamez
 */
public class RouteEdge {
    private String nombre;
    private Clase clase1;
    private Clase clase2;

    public RouteEdge(String nombre, Clase clase1, Clase clase2) {
        this.nombre = nombre;
        this.clase1 = clase1;
        this.clase2 = clase2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase getClase1() {
        return clase1;
    }

    public void setClase1(Clase clase1) {
        this.clase1 = clase1;
    }

    public Clase getClase2() {
        return clase2;
    }

    public void setClase2(Clase clase2) {
        this.clase2 = clase2;
    }
    
    
    
}
