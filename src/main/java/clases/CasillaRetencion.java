package clases;
import java.awt.image.BufferedImage;
import java.util.HashSet;

import clases.Casilla;

/**
 * clase para modelar las casillas de retencion, que te dejarán un determinado numero de turnos sin jugar.
 * @author Javi
 *
 */
public class CasillaRetencion extends Casilla{
	//numero de turnos retenido
	private byte turnosRetenido;
	//tipo de casilla de retencion
	private tipoCasillaRetencion casillaRetencion;
	
	
	/**
	 * constructor para modelar una casillaRetencion
	 * @param numeroCasilla
	 * @param imagen
	 * @param jugadores
	 * @param turnosRetenido byte 
	 * @param casillaRetencion tipoCasillaRetencion
	 */
	public CasillaRetencion(byte numeroCasilla, BufferedImage imagen, HashSet<Jugador> jugadores, byte turnosRetenido,
			tipoCasillaRetencion casillaRetencion) {
		super(numeroCasilla, imagen, jugadores);
		this.turnosRetenido = turnosRetenido;
		this.casillaRetencion = casillaRetencion;
	}
	


	/**
	 * funcion para obtener el numero de turnos retenido
	 * @return byte
	 */
	public byte getTurnosRetenido() {
		return turnosRetenido;
	}


	/**
	 * funcion para definir el numero de turnos retenido
	 * @param turnosRetenido
	 */
	public void setTurnosRetenido(byte turnosRetenido) {
		this.turnosRetenido = turnosRetenido;
	}


	/**
	 * funcion para obtener el tipo de casilla retencion 
	 * @return tipoCasillaRetencion
	 */
	public tipoCasillaRetencion getCasillaRetencion() {
		return casillaRetencion;
	}


	/**
	 * funcion para definir el tipo de casilla retencion
	 * @param casillaRetencion
	 */
	public void setCasillaRetencion(tipoCasillaRetencion casillaRetencion) {
		this.casillaRetencion = casillaRetencion;
	}

	
	/**
	 * funcion para pasar a string la clase CasillaRetencion
	 */
	@Override
	public String toString() {
		return "CasillaRetencion: \nTurnosRetenido: " + turnosRetenido + "\nCasillaRetencion: " + casillaRetencion;
	}



	public enum tipoCasillaRetencion{
		POSADA,
		CARCEL
	}
}
