/**
* Clase que define una triangulo equilatero
* @author Valencia Rodríguez	David Román, Quintero Villeda Erik
* @version 0.1, 2023/08/30
*/
public class TrianguloEquilatero implements Figura {

  /**
  * double que representa la base del triangulo
  */
  public double base;

  /**
  * double que representa la altura del triangulo
  */
  public double altura;

  /**
  * Frase corta descriptiva
  * Descripción del método.
  * @param base del triangulo.
  * @param altura del triangulo.
  */
  public TrianguloEquilatero(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  /**
  * Metodo que calcula el area de una figura.
  * @return el area de la figura.
  */
  public double area() {
    return base * altura / 2.0;
  }

  /**
  * Metodo que calcula el perimetro de una figura.
  * @return el perimetro de la figura.
  */
  public double perimetro() {
    return base * 3.0;
  }

  /**
  * Metodo que regresa el numero de lados de la figura.
  * @return el numero de lados de la figura.
  */
  public int getLados() {
    return 3;
  }
}
