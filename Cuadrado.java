/**
 * Clase que define un cuadrado
 * @author Neri Figueroa Pérez, Isaías Flores Rendón
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
    /**
     * Metodo que implementa el area de un cuadrado
     * @return el area del cuadrado
     */
    @Override
    public double area() {
        return lado*lado;
    }
    /*
     * Metodo que implementa el perimetro de un cuadrado
     * @return el perimetro del cudrado
     */
    @Override
    public double perimetro() {
        return lado*4;
    }
    
    /**
     * Metodo que devuelve los lados de un cuadrado
     * @return el número de lados
     */
    @Override
    public int getLados() {
        return 4;
    }
    
}
