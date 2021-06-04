//interfaz de la pantalla  ventana. Aqui crearemos las funciones para poder movernos entre interfaces.
//


package interfaces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import clases.Jugador;

public class Ventana extends JFrame{
	//variable de la clase PantallaInicio
	private PantallaInicio pantallaInicio;
	//variable de la clase PantallaTablero
	private PantallaTablero pantallaTablero;
	//variable de la clase PantallaPuntuaciones
	private PantallaPuntuaciones pantallaPuntuaciones;
	
	public Ventana() {
		
		this.setSize(1000, 800);
		this.setTitle("Programa Juego de la Oca");
		this.setLocation(300, 0);
		this.setResizable(true);
		
		try {
			BufferedImage icono = ImageIO.read(new File("iconoOca.jpg"));
			this.setIconImage(icono);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pantallaInicio = new PantallaInicio(this);
		this.setContentPane(pantallaInicio);
		this.setVisible(true);
		
	}
	/**
	 * funcion para volver a la pantalla inicio cuando estemos en la Pantalla Puntuaciones.
	 */
	public void irAPantallaInicio() {
		if(this.pantallaInicio==null) {
			this.pantallaInicio=new PantallaInicio(this);
		}
		this.pantallaPuntuaciones.setVisible(false);
		this.setContentPane(this.pantallaInicio);
		this.pantallaInicio.setVisible(true);
	}
	
	/**
	 * funcion para ir a la pantalla tablero cuando estemos en la Pantalla Inicio. En ella tendremos que seleccionar los jugadores y sus nombres por ver las 
	 * puntuaciones.
	 */
	public void irAPantallaTablero(ArrayList <Jugador> jugadores ) {
		if(this.pantallaTablero==null) {
			this.pantallaTablero=new PantallaTablero(this,jugadores);
		}
		this.pantallaInicio.setVisible(false);
		this.setContentPane(this.pantallaTablero);
		this.pantallaTablero.setVisible(true);
	}
	/**
	 * Funcion para ir a pantalla puntuaciones cuando estemos en pantalla inicio. Aqui podremos ver los puntos de los jugadores.
	 */
	public void irAPantallaPuntuaciones() {
		if(this.pantallaPuntuaciones==null) {
			this.pantallaPuntuaciones=new PantallaPuntuaciones(this);
		}
		this.pantallaInicio.setVisible(false);
		this.setContentPane(this.pantallaPuntuaciones);
		this.pantallaPuntuaciones.setVisible(true);
	}
	
}
