

package clases;
import clases.Jugador;
import clases.Tablero;
import java.util.ArrayList;

/**
 * clase para modelar una partida al juego de la oca. Habrá entre 2 y 4 jugadores, y constará de un tablero. Cada jugador tendra un turno.
 * @author Javi
 *
 */
public class Partida {
	//numero de jugadores que habrá en la partida (entre 2 y 4)
	private ArrayList<Jugador> jugadores;
	//tablero en el que transcurrirá la partida
	private Tablero tablero;
	//turno que tendrá cada jugador.
	private short turnoActual;
	
	/**
	 * constructor para la clase Partida
	 * @param jugadores Jugador
	 * @param tablero Tablero
	 * @param turnoActual short turno de el jugador
	 */
	public Partida(ArrayList<Jugador> jugadores, Tablero tablero, short turnoActual) {
		super();
		this.jugadores = jugadores;
		this.tablero = tablero;
		this.turnoActual = turnoActual;
	}

	/**
	 * funcion para obtener los jugadores de la partida
	 * @return Jugador
	 */
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	/**
	 * funcion para definir los jugadores de la partida
	 * @param jugadores
	 */
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	/**
	 * funcion para obtener el tablero de la partida
	 * @return Tablero
	 */
	public Tablero getTablero() {
		return tablero;
	}

	/**
	 * funcion para definir el tablero de la partida
	 * @param tablero
	 */
	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	/**
	 * funcion para obtener el turno actual de la partida
	 * @return short
	 */
	public short getTurnoActual() {
		return turnoActual;
	}

	/**
	 * funcion para definir el turno de la partida
	 * @param turnoActual
	 */
	public void setTurnoActual(short turnoActual) {
		this.turnoActual = turnoActual;
	}

	/**
	 * funcion para pasar a String la clase Partida.
	 */
	@Override
	public String toString() {
		return "Partida \nJugadores: " + jugadores + "\nTablero: " + tablero + "\nTurnoActual: " + turnoActual;
	}
	
	
}
