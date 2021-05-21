

package clases;
import java.awt.image.BufferedImage;
import java.util.HashSet;

import clases.Jugador;

/**
 * Clase para modelar las casillas que tendr� el tablero. Habr� 60 y cada una tendr� asignada una imagen y un numero. Y tendr� un hashSet de jugador.
 * @author Javi
 *
 */
public class Casilla {
	//sera el numero que tendr� asignado cada casilla
	private byte numeroCasilla;
	//ser� la imagen asignada a cada casilla
	private BufferedImage imagen;
	//jugadores que habra en cada casilla
	private HashSet<Jugador>jugadores;
	
	/**
	 * constructor de la clase Casilla
	 * @param numeroCasilla byte
	 * @param imagen BufferedImage
	 * @param jugadores Jugador
	 */
	public Casilla(byte numeroCasilla, BufferedImage imagen, HashSet<Jugador> jugadores) {
		this.numeroCasilla = numeroCasilla;
		this.imagen = imagen;
		this.jugadores = jugadores;
	}
	/*
	 * funcion para obtener el numero que tendr� asignada cada casilla
	 */
	public byte getNumeroCasilla() {
		return numeroCasilla;
	}
	/**
	 * funcion para definir el numero que tendr� cada casilla.
	 * @param numeroCasilla byte
	 */
	public void setNumeroCasilla(byte numeroCasilla) {
		this.numeroCasilla = numeroCasilla;
	}
	/**
	 * funcion para obtener la imagen que tendr� una casilla
	 * @return Image
	 */
	public BufferedImage getImagen() {
		return imagen;
	}
	/**
	 * funcion para definir la imagen que tendr� una casilla.
	 * @param imagen Image
	 */
	public void setImagen(BufferedImage imagen) {
		this.imagen = imagen;
	}
	/**
	 * funcion para obtener jugador que habr� en una casilla.
	 * @return Jugador
	 */
	public HashSet<Jugador> getJugadores() {
		return jugadores;
	}
	/**
	 * funcion para definir los jugadores que habr� en una casilla.
	 * @param jugadores Jugador
	 */
	public void setJugadores(HashSet<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	/**
	 * funcion para pasar a String una Casilla
	 */
	@Override
	public String toString() {
		return "Casilla: \nnumeroCasilla: " + numeroCasilla + ", imagen: " + imagen + ", jugadores: " + jugadores;
	}
	
	
	
}
