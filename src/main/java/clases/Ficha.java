
package clases;
/**
 * Clase con la que modelaremos las fichas del juego. Habrá 4 colores disponibles, rojo, verde, amarillo y azul.
 * @author Javi
 *
 */
public class Ficha {
	//color que tendrán las fichas
	private String color;
	//posicion en la que estarán las fichas
	private byte posicion;
	
	/**
	 * constructor para crear una Ficha que tendrá una posicion y un color.
	 * @param color de la ficha en el juego
	 * @param posicion de la ficha en el tablero
	 */
	public Ficha(String color, byte posicion) {
		this.color = color;
		this.posicion = posicion;
	}

	/**
	 * funcion para obtener el color de la ficha
	 * @return String color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * funcion para definir el color de la ficha
	 * @param color Ficha
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * funcion para obtener la posicion de la ficha
	 * @return byte posicion
	 */
	public byte getPosicion() {
		return posicion;
	}

	/**
	 * funcion para definir la posicion de la ficha
	 * @param posicion de la ficha
	 */
	public void setPosicion(byte posicion) {
		this.posicion = posicion;
	}

	/**
	 * funcion para pasar a String una Ficha.
	 */
	@Override
	public String toString() {
		return "Ficha: " + color + ", posicion: " + posicion;
	}
	
	public void sumaTirada(byte tirada) {
		this.posicion+=tirada;
	}
	
}
