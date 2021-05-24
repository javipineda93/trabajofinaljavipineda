package interfaces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	private PantallaInicio pantallaInicio;
	private PantallaTablero pantallaTablero;
	
	
	public Ventana() {
		setVisible(true);
		this.setTitle("Juego de la Oca");
		this.setSize(1020, 780);
		this.setLocation(350,20);
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pantallaInicio=new PantallaInicio(this);
		this.setContentPane(pantallaInicio);
		this.setVisible(true);
		
	
	}	
}
