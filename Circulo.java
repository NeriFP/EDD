/**
 * Clase que define un Circulo
 * @author Neri Figueroa Pérez, Isaías Flores Rendón
 * @version 1.0
 */
public class Circulo implements Figura {
    /**
     * double el radio del curculo
     */
    public double radio;

    /**
     * Método constructor de un circulo
     * @param radio radio del círculo
     */
    public Circulo(double radio){
        this.radio=radio;
    }

    @Override
    /**
     * Método para obtener el área del círculo
     * @param double el area del circulo
     */
    public double area() {
        return 3.1415 * radio * radio;
    }

    @Override
    /**
     * Metodo para obtener el perimetro del circulo
     * @param double el perimetro del circulo
     */
    public double perimetro() {
      return 2 * 3.1415 * radio;
    }

    /**
     * Metodo para obtener los lados de un círculo
     * @return el numero de lados
     */
    @Override
    public int getLados() {
        return 0;
    }
    
}
