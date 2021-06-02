package clases;
import java.awt.image.BufferedImage;
import java.util.HashSet;
import clases.Casilla;
import enums.TipoCasillaConectada;

/**
 * clase para modelar las casillas que estarán conectadas. Al caer en una, te transportarás a su conectada. La clase tendrá un enum de tipos de casillas conectadas.
 * @author Javi
 *
 */
public class CasillaConectada extends Casilla{
	//variable que definirá que clase de casilla conectada es:
	private TipoCasillaConectada casillaConectada;
	private byte enlace;
	
	/**
	 * constructor para la clase casillaConectada
	 * @param numeroCasilla 
	 * @param imagen
	 * @param jugadores
	 * @param casillaConectada será el tipo de casillaConectada.
	 */
	public CasillaConectada(byte numeroCasilla,byte enlace, TipoCasillaConectada casillaConectada) {
		super(numeroCasilla);
		this.casillaConectada = casillaConectada;
		this.enlace = enlace;
	}
	/**
	 * funcion para obtener el tipo de casilla conectada
	 * @return tipoCasillaConectada
	 */
	public TipoCasillaConectada getCasillaConectada() {
		return casillaConectada;
	}
	/**
	 * funcion para definir el tipo de casillaConectada.
	 * @param casillaConectada
	 */
	public void setCasillaConectada(TipoCasillaConectada casillaConectada) {
		this.casillaConectada = casillaConectada;
	}
	/**
	 * funcion para obtener el elemento enlace de la casilla conectada
	 * @return byte enlace
	 */
	
	public byte getEnlace() {
		return enlace;
	}
	
	/**
	 * funcion para definir la casilla enlace
	 * @param enlace
	 */
	public void setEnlace(byte enlace) {
		this.enlace = enlace;
	}
	/**
	 * funcion para pasar a String la clase casillaConectada.
	 */
	@Override
	public String toString() {
		return "casillaConectada: " + casillaConectada;
	}

}
