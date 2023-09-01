/**
 * Clase que define un cuadrado
 * @author Neri Figueroa Pérez, Isaias Rosas Rendón
 * @version 1.0
 */
public class Cuadrado implements Figura {
    /**
     * double que representa el lado de un cuadrado
     */
    public double lado;
    
    /**
     * Método constructor para un cuadrado
     * @param lado el lado del cuadrado
     */
    public Cuadrado(double lado){
        this.lado=lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return lado + lado + lado + lado;
    }

    @Override
    public int getLados() {
        return 4;
    }
    
}
