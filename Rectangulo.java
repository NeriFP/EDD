/**
* Clase que define una triangulo equilatero
* @author Valencia Rodríguez	David Román, Quintero Villeda Erik
* @version 0.1, 2023/08/30
*/
public class Rectangulo implements Figura {

  /**
  * double que representa la base del rectangulo
  */
  public double bases;

  /**
  * double que representa la altura del rectangulo
  */
  public double alturas;

  /**
  * Frase corta descriptiva
  * Descripción del método.
  * @param bases del rectangulo.
  * @param alturas del rectangulo.
  */
  public Rectangulo(double bases, double alturas) {
    this.bases = bases;
    this.alturas = alturas;
  }

  /**
  * Metodo que calcula el area de una figura.
  * @return el area de la figura.
  */
  public double area() {
    return bases * alturas;
  }

  /**
  * Metodo que calcula el perimetro de una figura.
  * @return el perimetro de la figura.
  */
  public double perimetro() {
    return bases * 2.0 + alturas * 2.0;
  }

  /**
  * Metodo que regresa el numero de lados de la figura.
  * @return el numero de lados de la figura.
  */
  public int getLados() {
    return 4;
  }

  /**
  * Metodo que verifica si el rectangulo es un cuadrado o no.
  * @return si es cuadrado o no
  */
  public boolean esCuadrado(){
    if(this.bases == this.alturas){
      return true;
    }else{
      return false;
    }
  }
}
