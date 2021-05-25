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
		
		this.setSize(1000, 800);
		this.setTitle("Programa Juego de la Oca");
		this.setLocation(300, 0);
		this.setResizable(false);
		
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
	
	public void irAPantallaTablero() {
		if(this.pantallaTablero==null) {
			this.pantallaTablero=new PantallaTablero(this);
		}
		this.pantallaInicio.setVisible(false);
		this.setContentPane(this.pantallaTablero);
		this.pantallaTablero.setVisible(true);
	}
	
}
