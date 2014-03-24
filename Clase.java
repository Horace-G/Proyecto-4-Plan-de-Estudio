/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

/**
 *
 * @author Horacio Galdamez
 */
public class Clase extends Object{
    
    private String nombre;
    private boolean aprobado;
    private boolean semestral;
    private Clase requisito1;
    private Clase requisito2;
    private Clase requisito3;
    private int degree;

    public Clase(String nombre) {
        this.nombre=nombre;
    }
    

    public Clase(String nombre, boolean aprobado, boolean semestral, Clase requisito1, Clase requisito2,int degree) {
        this.nombre = nombre;
        this.aprobado = aprobado;
        this.semestral = semestral;
        this.requisito1 = requisito1;
        this.requisito2 = requisito2;
        this.degree=degree;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public boolean isSemestral() {
        return semestral;
    }

    public void setSemestral(boolean semestral) {
        this.semestral = semestral;
    }

    public Clase getRequisito1() {
        return requisito1;
    }

    public void setRequisito1(Clase requisito1) {
        this.requisito1 = requisito1;
    }

    public Clase getRequisito2() {
        return requisito2;
    }

    public void setRequisito2(Clase requisito2) {
        this.requisito2 = requisito2;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
    
    
   
}//fin de la clase Clase
