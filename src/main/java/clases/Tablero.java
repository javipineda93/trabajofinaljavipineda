package clases;
import clases.Casilla;
import java.util.ArrayList;


/**
 * Clase para modelar el tablero en el que jugaremos. Tendrá un arraylist de casillas, obtenidas de la clase Casilla.
 * @author Javi
 *
 */
public class Tablero {
	//casillas que tendrá el tablero.
	private ArrayList<Casilla> casillas;
	
	
	//constructor para modelar un tablero
	public Tablero(ArrayList<Casilla> casillas) {
		this.casillas = casillas;
	}
	//funcion para obtener las casillas del tablero
	public ArrayList<Casilla> getCasillas() {
		return casillas;
	}
	//funcion para cambiar o definir las casillas del tablero
	public void setCasillas(ArrayList<Casilla> casillas) {
		this.casillas = casillas;
	}
	//funcion para pasar a String el tablero.
	@Override
	public String toString() {
		return "Tablero: \ncasillas:" + casillas;
	}
	
	
}
