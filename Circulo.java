public class Circulo implements Figura {
    public double radio;

    public Circulo(double radio){
        this.radio=radio;
    }

    @Override
    /**
     * @param double el area del circulo
     */
    public double area() {
        return 3.1415 * radio * radio;
    }

    @Override
    /**
     * @param double el perimetro del ciruclo
     */
    public double perimetro() {
      return 2 * 3.1415 * radio;
    }

    @Override
    public int getLados() {
        return 0;
    }
    
}
