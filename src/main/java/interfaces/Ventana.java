package interfaces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import clases.Jugador;

public class Ventana extends JFrame{
	private PantallaInicio pantallaInicio;
	private PantallaTablero pantallaTablero;
	
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
	
	public void irAPantallaTablero(ArrayList <Jugador> jugadores ) {
		if(this.pantallaTablero==null) {
			this.pantallaTablero=new PantallaTablero(this,jugadores);
		}
		this.pantallaInicio.setVisible(false);
		this.setContentPane(this.pantallaTablero);
		this.pantallaTablero.setVisible(true);
	}
	
}
