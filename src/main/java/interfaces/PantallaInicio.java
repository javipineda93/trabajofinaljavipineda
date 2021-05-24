package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaInicio extends JPanel{
	private Ventana ventana;
	
	public PantallaInicio(Ventana v) {
		this.ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(null);
		
		JLabel imagenCabecera = new JLabel("");
		imagenCabecera.setIcon(new ImageIcon("C:\\Users\\34684\\Desktop\\DAW\\Programaci\u00F3n\\trabajofinaljavipineda\\cabeceraOca.png"));
		imagenCabecera.setBounds(0, 0, 1116, 157);
		panel.add(imagenCabecera);
	}	
}
