/**
* Interfaz que define una figura
* @author Valencia Rodríguez	David Román, Quintero Villeda Erik
* @version 0.1, 2023/08/30
*/
public interface Figura {

  /**
  * Metodo que calcula el area de una figura.
  * @return el area de la figura.
  */
  public double area();

  /**
  * Metodo que calcula el perimetro de una figura.
  * @return el perimetro de la figura.
  */
  public double perimetro();

  /**
  * Metodo que regresa el numero de lados de la figura.
  * @return el numero de lados de la figura.
  */
  public int getLados();
}
