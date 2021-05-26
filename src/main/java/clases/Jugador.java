
package clases;
import clases.Ficha;
/**
 * Clase con la que modelaremos a los jugadores que estarán en la partida. Habrá maximo 4 y minimo 2. Cada uno tendra asignado un nombre que se seleccionará
 * en la pantalla de inicio.
 * @author Javi
 *
 */
public class Jugador {
	//nombre del jugador
	private String nombre;
	//turnos que estará retenido en caso de caer en alguna casilla de retención
    private byte turnosRetenido;
	//ficha que tendrá asginada cada jugador. Obtenida de clase Ficha.
	private Ficha ficha;
	
	/**
	 * constructor para modelar a un jugador
	 * @param nombre que tendrá el jugador
	 * @param turnosRetenido turnos que no podrá tirar.
	 * @param ficha que tendrá asginada.
	 */
	public Jugador(String nombre, byte turnosRetenido, Ficha ficha) {
		this.nombre = nombre;
		this.turnosRetenido = turnosRetenido;
		this.ficha = ficha;
	}

	/**
	 * constructor para modelar a un jugador
	 * @param nombre que tendrá el jugador
	 * @param ficha que tendrá asginada.
	 */
	public Jugador(String nombre, Ficha ficha) {
		super();
		this.nombre = nombre;
		this.ficha = ficha;
		this.turnosRetenido = 0;
	}

	/**
	 * funcion para obtener el nombre del jugador
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * funcion para definir el nombre del jugador
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * funcion para obtener el turno que tiene cada jugador
	 * @return byte
	 */
	public byte getTurnosRetenido() {
		return turnosRetenido;
	}

	/**
	 * funcion para obtener el numero de turnos retenidos que estará cada jugador
	 * @param turnosRetenido
	 */
	public void setTurnosRetenido(byte turnosRetenido) {
		this.turnosRetenido = turnosRetenido;
	}

	/**
	 * funcion para obtener la ficha que tendrá el jugador
	 * @return Ficha
	 */
	public Ficha getFicha() {
		return ficha;
	}

	/**
	 * funcion para obtener la ficha que será asignada a cada jugador
	 * @param ficha
	 */
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	/**
	 * funcion para pasar a String un jugador
	 */
	@Override
	public String toString() {
		return "Jugador: \nnombre= " + nombre + ", turnosRetenido= " + turnosRetenido + ", ficha= " + ficha;
	}
	
	
	
	
}
