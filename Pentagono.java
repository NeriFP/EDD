public class Pentagono implements Figura {
    /**
     * Lado del pentagono
     */
    public double lado;

    @Override
    public double area() {
        return (this.perimetro()*this.apotema())/2+;
    }

    @Override
    public double perimetro() {
        return lado*5;
    }

    @Override
    public int getLados() {
        return 5;
    }
    
    public double apotema(){
        return lado/1.453;
    }
}
