/**
 * interfaz de la pantalla inicio. Aqui seleccionaremos el numero de jugadores y sus nombres o visitaremos las puntuaciones de los jugadores.
 */

package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingConstants;

import clases.Ficha;
import clases.Jugador;
import excepciones.NombreMuyLargoException;
import excepciones.NombreVacioException;

public class PantallaInicio extends JPanel{
	//campo para seleccionar 1er jugador y su nombre 
	private JTextField campoJug1;
	//campo para seleccionar 2ndo jugador y su nombre
	private JTextField campoJug2;
	//campo para seleccionar  3er jugador y su nombre
	private JTextField campoJug3;
	//campo para seleccionar 4to jugador y su nombre
	private JTextField campoJug4;
	//numero de jugadores
	private byte numJugadores;
	//clase Ventana
	private Ventana ventana;
	
	/**
	 * constructor de la pantalla inicio 
	 * @param v Variable de la clase Ventana
	 */
	public PantallaInicio(Ventana v) {
		this.ventana = v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelCabecera = new JPanel();
		add(panelCabecera, BorderLayout.NORTH);
		
		JLabel fotoCabecera = new JLabel("");
		fotoCabecera.setIcon(new ImageIcon("cabeceraOca.png"));
		panelCabecera.add(fotoCabecera);
		
		JPanel panelMedio = new JPanel();
		panelMedio.setBackground(Color.LIGHT_GRAY);
		add(panelMedio, BorderLayout.CENTER);
		panelMedio.setLayout(null);
		
		campoJug1 = new JTextField();
		campoJug1.setText("Jugador 1");
		campoJug1.setFont(new Font("Consolas", Font.BOLD, 13));
		campoJug1.setBounds(545, 185, 213, 44);
		panelMedio.add(campoJug1);
		campoJug1.setColumns(10);
		
		campoJug2 = new JTextField();
		campoJug2.setText("Jugador 2");
		campoJug2.setFont(new Font("Consolas", Font.BOLD, 13));
		campoJug2.setBounds(545, 260, 213, 44);
		panelMedio.add(campoJug2);
		campoJug2.setColumns(10);
		
		campoJug3 = new JTextField();
		campoJug3.setEnabled(false);
		campoJug3.setText("Jugador 3");
		campoJug3.setFont(new Font("Consolas", Font.BOLD, 13));
		campoJug3.setBounds(545, 334, 213, 44);
		panelMedio.add(campoJug3);
		campoJug3.setColumns(10);
		
		campoJug4 = new JTextField();
		campoJug4.setEnabled(false);
		campoJug4.setText("Jugador 4");
		campoJug4.setFont(new Font("Consolas", Font.BOLD, 13));
		campoJug4.setBounds(545, 405, 213, 44);
		panelMedio.add(campoJug4);
		campoJug4.setColumns(10);
		
		
		//con este boton iremos a las puntuaciones de los jugadores. +3 por ganar la partida
		JButton botonCargar = new JButton("Puntuaciones");
		botonCargar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantallaPuntuaciones();
			}
		});
		botonCargar.setFont(new Font("Consolas", Font.BOLD, 13));
		botonCargar.setBounds(118, 405, 269, 45);
		panelMedio.add(botonCargar);
		
		//con este boton añadiremos jugadores, se pueden jugar minimo 2 y maximo 4.
		JButton botonAnadirJug = new JButton("A\u00F1adir Jugador");
		botonAnadirJug.setFont(new Font("Consolas", Font.BOLD, 13));
		botonAnadirJug.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				
				if(numJugadores<4) {
					numJugadores++;
					if(numJugadores==3) {
						campoJug3.setEnabled(true);
					}if(numJugadores==4) {
						campoJug4.setEnabled(true);
					}
				}else {
					//TODO
					
				}
			}
		});
		botonAnadirJug.setBounds(129, 185, 247, 31);
		panelMedio.add(botonAnadirJug);
		
		//con este boton quitaremos jugadores. Minimo tiene que haber 2.
		JButton botonQuitarJug = new JButton("Quitar Jugador");
		botonQuitarJug.setFont(new Font("Consolas", Font.BOLD, 13));
		botonQuitarJug.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(numJugadores>2) {
					if(numJugadores==4) {
						campoJug4.setEnabled(false);
					}if(numJugadores==3) {
						campoJug4.setEnabled(false);
						campoJug3.setEnabled(false);
					}
				
					numJugadores--;
				}
			}
		});
		botonQuitarJug.setBounds(129, 226, 247, 31);
		panelMedio.add(botonQuitarJug);
		
		this.numJugadores = 2;
		
		/**
		 * con este boton se comenzará la partida una vez hayamos seleccionado el numero de jugadores y sus nombres.
		 * En caso de no elegir nombre, se pondra por defecto Jugador 1 y Jugador 2.
		 * Si el nombre seleccionado está vacio o es mas largo de 15 caracteres, lanzará una excepcion.
		 */
		JButton botonComenzar = new JButton("Comenzar Partida");
		botonComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(campoJug1.getText().isBlank() || campoJug2.getText().isBlank() || (campoJug3.isEnabled() && campoJug3.getText().isBlank())|| (campoJug4.isEnabled() && campoJug4.getText().isBlank())) {
						throw new NombreVacioException ("Los campos del nombre no pueden estar vacíos.");
					}
					if(campoJug1.getText().length()>15 || campoJug2.getText().length()>15 || (campoJug3.isEnabled() && campoJug3.getText().length()>15)|| (campoJug4.isEnabled() && campoJug4.getText().length()>15)) {
						throw new NombreMuyLargoException ("El nombre es demasiado largo.");
					}
					ArrayList <Jugador> jugadores =  new ArrayList<Jugador>();
					jugadores.add(new Jugador(campoJug1.getText().toString(),new Ficha("Rojo",(byte) 0)));
					jugadores.add(new Jugador(campoJug2.getText().toString(),new Ficha("Azul",(byte) 0)));
					if(numJugadores==3) {
						jugadores.add(new Jugador(campoJug3.getText().toString(),new Ficha("Verde",(byte) 0)));
					}
					if(numJugadores==4) {
						jugadores.add(new Jugador(campoJug4.getText().toString(),new Ficha("Amarillo",(byte) 0)));
					}
							
					ventana.irAPantallaTablero(jugadores);
				}catch(NombreVacioException ex) {
					JOptionPane.showMessageDialog(ventana, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
				} catch (NombreMuyLargoException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		botonComenzar.setFont(new Font("Consolas", Font.BOLD, 13));
		botonComenzar.setBounds(118, 334, 269, 45);
		panelMedio.add(botonComenzar);
		
	}
}
