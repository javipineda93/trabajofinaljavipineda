/**
 * Interfaz para mostrar las puntuaciones de los jugadores.
 */

package interfaces;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;

public class PantallaPuntuaciones extends JPanel{
//clase Ventana para poder navegar entre interfaces	
private Ventana ventana;
//etiqueta que nos muestra el texto "puntuaciones"
private JTextField etiquetaPuntuaciones;
//tabla donde se mostrarán todas las puntuaciones
private JTable tablaPunt;
/**
 * constructor de la clase PantallaPuntuaciones
 * @param ventana
 */
public PantallaPuntuaciones(final Ventana ventana) {
	super();
	setBackground(new Color(169, 169, 169));
	setForeground(new Color(245, 245, 245));
	this.ventana = ventana;
	setLayout(null);
	
	etiquetaPuntuaciones = new JTextField();
	etiquetaPuntuaciones.setBackground(new Color(224, 255, 255));
	etiquetaPuntuaciones.setEditable(false);
	etiquetaPuntuaciones.setForeground(new Color(0, 128, 0));
	etiquetaPuntuaciones.setHorizontalAlignment(SwingConstants.CENTER);
	etiquetaPuntuaciones.setFont(new Font("Consolas", Font.BOLD, 25));
	etiquetaPuntuaciones.setText("Top Players");
	etiquetaPuntuaciones.setBounds(238, 60, 548, 42);
	add(etiquetaPuntuaciones);
	etiquetaPuntuaciones.setColumns(10);
	
	JButton btnVolverInicio = new JButton("VOLVER");
	btnVolverInicio.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {//funcion para poder volver a la pantalla inicio
			ventana.irAPantallaInicio();
		}
	});
	btnVolverInicio.setBackground(new Color(224, 255, 255));
	btnVolverInicio.setForeground(new Color(46, 139, 87));
	btnVolverInicio.setFont(new Font("Consolas", Font.BOLD, 19));
	btnVolverInicio.setBounds(238, 556, 548, 51);
	add(btnVolverInicio);
	
	tablaPunt = new JTable();
	tablaPunt.setFont(new Font("Consolas", Font.BOLD, 14));
	tablaPunt.setBounds(238, 158, 548, 332);
	add(tablaPunt);
	
	
	// Aqui construiremos la conexion con la base de datos para poder consultar las puntuaciones de los jugadores. Todo jugador que gane la partida recibe 3 puntos.
	String sql = "SELECT * FROM puntuaciones";
	DefaultTableModel model = new DefaultTableModel();
	model.addColumn("Nombre");
	model.addColumn("Puntuacion");
	tablaPunt.setModel(model);
	
	String [] dato = new String[2];
	
	Connection conexion;
	try {
		conexion = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/oca",
				"root","ebUdix66");
        Statement smt=conexion.createStatement();
        ResultSet rs = smt.executeQuery(sql);
        
        while(rs.next()) {
        	dato[0] = rs.getString(1);
        	dato[1] = rs.getString(2);
        	model.addRow(dato);
        }

		  
		rs.close(); 
        smt.close();
        conexion.close();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	
  }
}
