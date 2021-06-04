
package clases;
/**
 * Clase con la que modelaremos las fichas del juego. Habrá 4 colores disponibles, rojo, verde, amarillo y azul.
 * @author Javi
 *
 */
public class Ficha {
	//posicion en la que estarán las fichas
	private byte posicion;
	
	/**
	 * constructor para crear una Ficha que tendrá una posicion y un color.
	 * @param color de la ficha en el juego
	 * @param posicion de la ficha en el tablero
	 */
	public Ficha(byte posicion) {
		this.posicion = posicion;
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
		return "posicion: " + posicion;
	}
	/**
	 * funcion que nos suma la tirada con la posicion de la ficha.
	 * @param tirada
	 */
	public void sumaTirada(byte tirada) {
		this.posicion+=tirada;
	}
	
}
