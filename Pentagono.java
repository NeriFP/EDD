/**
 * Clase que modela un pentagono
 * @author Neri Figueroa Pérez, Isaías Flores Rendón
 * @version 1.0
 */
public class Pentagono implements Figura {
    /**
     * Lado del pentagono
     */
    public double lado;

    /**
     * Método para obener el área de un Pentagono
     * @return el area del pentagono
     */
    @Override
    public double area() {
        return (this.perimetro()*this.apotema())/2;
    }

    /**
     * Método para obtener el perímetro de un Pentagono
     * @return el perimetro del pentagono
     */
    @Override
    public double perimetro() {
        return lado*5;
    }

    /**
     * Método para obtener los lados de un pentagono
     * @return los lados del pentagono
     */
    @Override
    public int getLados() {
        return 5;
    }
    /**
     * Método auxiliar para calcular el apotema de un pentagono
     * @return el apotema del pentagono
     */
    public double apotema(){
        return lado/1.453;
    }
}
