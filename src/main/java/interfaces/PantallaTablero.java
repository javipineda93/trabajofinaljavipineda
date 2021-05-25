package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;

public class PantallaTablero extends JPanel{
	public PantallaTablero() {
		setLayout(null);
		
		JLabel casilla5 = new JLabel("");
		casilla5.setBounds(665, 10, 162, 104);
		casilla5.setIcon(new ImageIcon("C:\\Users\\34684\\Desktop\\DAW\\Programaci\u00F3n\\trabajofinaljavipineda\\casilla5_nofichas.jpg"));
		add(casilla5);
		
		JLabel casilla4 = new JLabel("");
		casilla4.setBounds(665, 124, 162, 115);
		casilla4.setIcon(new ImageIcon("C:\\Users\\34684\\Desktop\\DAW\\Programaci\u00F3n\\trabajofinaljavipineda\\casilla4_nofichas.jpg"));
		add(casilla4);
		
		JLabel casilla3 = new JLabel("");
		casilla3.setBounds(665, 244, 162, 142);
		casilla3.setIcon(new ImageIcon("C:\\Users\\34684\\Desktop\\DAW\\Programaci\u00F3n\\trabajofinaljavipineda\\casilla3_nofichas.jpg"));
		add(casilla3);
		
		JLabel casilla2 = new JLabel("");
		casilla2.setBounds(665, 396, 162, 140);
		casilla2.setIcon(new ImageIcon("C:\\Users\\34684\\Desktop\\DAW\\Programaci\u00F3n\\trabajofinaljavipineda\\casilla2_nofichas.jpg"));
		add(casilla2);
		
		JLabel casilla1 = new JLabel("");
		casilla1.setIcon(new ImageIcon("C:\\Users\\34684\\Desktop\\DAW\\Programaci\u00F3n\\trabajofinaljavipineda\\casilla1_nofichas.jpg"));
		casilla1.setBounds(657, 522, 180, 127);
		add(casilla1);
		
		JButton moverDelante = new JButton("moverFicha");
		moverDelante.setBounds(363, 244, 85, 21);
		add(moverDelante);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(691, 569, 45, 13);
		add(lblNewLabel);
	}

	public PantallaTablero(Ventana ventana) {
		// TODO Auto-generated constructor stub
	}
}
