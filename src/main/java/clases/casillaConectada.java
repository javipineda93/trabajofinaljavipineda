package clases;
import java.awt.image.BufferedImage;
import java.util.HashSet;
import clases.Casilla;

/**
 * clase para modelar las casillas que estar�n conectadas. Al caer en una, te transportar�s a su conectada. La clase tendr� un enum de tipos de casillas conectadas.
 * @author Javi
 *
 */
public class casillaConectada extends Casilla{
	//variable que definir� que clase de casilla conectada es:
	private tipoCasillaConectada casillaConectada;
	
	/**
	 * constructor para la clase casillaConectada
	 * @param numeroCasilla 
	 * @param imagen
	 * @param jugadores
	 * @param casillaConectada ser� el tipo de casillaConectada.
	 */
	public casillaConectada(byte numeroCasilla, BufferedImage imagen, HashSet<Jugador> jugadores,
			tipoCasillaConectada casillaConectada) {
		super(numeroCasilla, imagen, jugadores);
		this.casillaConectada = casillaConectada;
	}
	/**
	 * funcion para obtener el tipo de casilla conectada
	 * @return tipoCasillaConectada
	 */
	public tipoCasillaConectada getCasillaConectada() {
		return casillaConectada;
	}
	/**
	 * funcion para definir el tipo de casillaConectada.
	 * @param casillaConectada
	 */
	public void setCasillaConectada(tipoCasillaConectada casillaConectada) {
		this.casillaConectada = casillaConectada;
	}
	
	/**
	 * funcion para pasar a String la clase casillaConectada.
	 */
	@Override
	public String toString() {
		return "casillaConectada: " + casillaConectada;
	}

	/**
	 * enum para definir los tipos de casillas conectadas que habr�
	 * @author Javi
	 *
	 */
	public enum tipoCasillaConectada{
		PUENTE,
		DADO,
		LABERINTO,
		MUERTE
	}
}
