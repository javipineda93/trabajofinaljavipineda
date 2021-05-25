package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;

public class PantallaTablero extends JPanel{
	private Ventana ventana;
	
	
	public PantallaTablero(Ventana v) {
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel casilla20 = new JLabel("20");
		casilla20.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla20 = new GridBagConstraints();
		gbc_casilla20.insets = new Insets(0, 0, 5, 5);
		gbc_casilla20.gridx = 21;
		gbc_casilla20.gridy = 6;
		add(casilla20, gbc_casilla20);
		
		JLabel casillaPosada = new JLabel("");
		casillaPosada.setIcon(new ImageIcon("grow-shop.png"));
		casillaPosada.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casillaPosada = new GridBagConstraints();
		gbc_casillaPosada.insets = new Insets(0, 0, 5, 5);
		gbc_casillaPosada.gridx = 22;
		gbc_casillaPosada.gridy = 6;
		add(casillaPosada, gbc_casillaPosada);
		
		JLabel casillaOca4 = new JLabel("");
		casillaOca4.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca4 = new GridBagConstraints();
		gbc_casillaOca4.insets = new Insets(0, 0, 5, 5);
		gbc_casillaOca4.gridx = 23;
		gbc_casillaOca4.gridy = 6;
		add(casillaOca4, gbc_casillaOca4);
		
		JLabel casilla17 = new JLabel("17");
		casilla17.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla17 = new GridBagConstraints();
		gbc_casilla17.insets = new Insets(0, 0, 5, 5);
		gbc_casilla17.gridx = 24;
		gbc_casilla17.gridy = 6;
		add(casilla17, gbc_casilla17);
		
		JLabel casilla16 = new JLabel("16");
		casilla16.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla16 = new GridBagConstraints();
		gbc_casilla16.insets = new Insets(0, 0, 5, 5);
		gbc_casilla16.gridx = 25;
		gbc_casilla16.gridy = 6;
		add(casilla16, gbc_casilla16);
		
		JLabel casillaOca3 = new JLabel("");
		casillaOca3.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca3 = new GridBagConstraints();
		gbc_casillaOca3.insets = new Insets(0, 0, 5, 5);
		gbc_casillaOca3.gridx = 26;
		gbc_casillaOca3.gridy = 6;
		add(casillaOca3, gbc_casillaOca3);
		
		JLabel casilla14 = new JLabel("14");
		casilla14.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla14 = new GridBagConstraints();
		gbc_casilla14.insets = new Insets(0, 0, 5, 5);
		gbc_casilla14.gridx = 27;
		gbc_casilla14.gridy = 6;
		add(casilla14, gbc_casilla14);
		
		JLabel casilla13 = new JLabel("13");
		casilla13.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla13 = new GridBagConstraints();
		gbc_casilla13.insets = new Insets(0, 0, 5, 5);
		gbc_casilla13.gridx = 28;
		gbc_casilla13.gridy = 6;
		add(casilla13, gbc_casilla13);
		
		JLabel casillaPuente2 = new JLabel("");
		casillaPuente2.setIcon(new ImageIcon("puente.png"));
		GridBagConstraints gbc_casillaPuente2 = new GridBagConstraints();
		gbc_casillaPuente2.insets = new Insets(0, 0, 5, 5);
		gbc_casillaPuente2.gridx = 29;
		gbc_casillaPuente2.gridy = 6;
		add(casillaPuente2, gbc_casillaPuente2);
		
		JLabel casilla11 = new JLabel("11");
		casilla11.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla11 = new GridBagConstraints();
		gbc_casilla11.insets = new Insets(0, 0, 5, 5);
		gbc_casilla11.gridx = 30;
		gbc_casilla11.gridy = 6;
		add(casilla11, gbc_casilla11);
		
		JLabel casilla10 = new JLabel("10");
		casilla10.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla10 = new GridBagConstraints();
		gbc_casilla10.insets = new Insets(0, 0, 5, 5);
		gbc_casilla10.gridx = 31;
		gbc_casilla10.gridy = 6;
		add(casilla10, gbc_casilla10);
		
		JLabel casilla21 = new JLabel("21");
		casilla21.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla21 = new GridBagConstraints();
		gbc_casilla21.insets = new Insets(0, 0, 5, 5);
		gbc_casilla21.gridx = 20;
		gbc_casilla21.gridy = 7;
		add(casilla21, gbc_casilla21);
		
		JLabel casillaOca2 = new JLabel("");
		casillaOca2.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca2 = new GridBagConstraints();
		gbc_casillaOca2.insets = new Insets(0, 0, 5, 0);
		gbc_casillaOca2.gridx = 32;
		gbc_casillaOca2.gridy = 7;
		add(casillaOca2, gbc_casillaOca2);
		
		JLabel casilla22 = new JLabel("22");
		casilla22.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla22 = new GridBagConstraints();
		gbc_casilla22.insets = new Insets(0, 0, 5, 5);
		gbc_casilla22.gridx = 20;
		gbc_casilla22.gridy = 8;
		add(casilla22, gbc_casilla22);
		
		JLabel casillaOca11 = new JLabel("");
		casillaOca11.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca11 = new GridBagConstraints();
		gbc_casillaOca11.insets = new Insets(0, 0, 5, 5);
		gbc_casillaOca11.gridx = 23;
		gbc_casillaOca11.gridy = 8;
		add(casillaOca11, gbc_casillaOca11);
		
		JLabel casilla49 = new JLabel("49");
		casilla49.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla49 = new GridBagConstraints();
		gbc_casilla49.insets = new Insets(0, 0, 5, 5);
		gbc_casilla49.gridx = 24;
		gbc_casilla49.gridy = 8;
		add(casilla49, gbc_casilla49);
		
		JLabel casilla48 = new JLabel("48");
		casilla48.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla48 = new GridBagConstraints();
		gbc_casilla48.insets = new Insets(0, 0, 5, 5);
		gbc_casilla48.gridx = 25;
		gbc_casilla48.gridy = 8;
		add(casilla48, gbc_casilla48);
		
		JLabel casilla47 = new JLabel("47");
		casilla47.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla47 = new GridBagConstraints();
		gbc_casilla47.insets = new Insets(0, 0, 5, 5);
		gbc_casilla47.gridx = 26;
		gbc_casilla47.gridy = 8;
		add(casilla47, gbc_casilla47);
		
		JLabel casilla46 = new JLabel("46");
		casilla46.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla46 = new GridBagConstraints();
		gbc_casilla46.insets = new Insets(0, 0, 5, 5);
		gbc_casilla46.gridx = 27;
		gbc_casilla46.gridy = 8;
		add(casilla46, gbc_casilla46);
		
		JLabel casillaOca10 = new JLabel("");
		casillaOca10.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca10 = new GridBagConstraints();
		gbc_casillaOca10.insets = new Insets(0, 0, 5, 5);
		gbc_casillaOca10.gridx = 28;
		gbc_casillaOca10.gridy = 8;
		add(casillaOca10, gbc_casillaOca10);
		
		JLabel casilla44 = new JLabel("44");
		casilla44.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla44 = new GridBagConstraints();
		gbc_casilla44.insets = new Insets(0, 0, 5, 5);
		gbc_casilla44.gridx = 29;
		gbc_casilla44.gridy = 8;
		add(casilla44, gbc_casilla44);
		
		JLabel casilla8 = new JLabel("8");
		casilla8.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla8 = new GridBagConstraints();
		gbc_casilla8.insets = new Insets(0, 0, 5, 0);
		gbc_casilla8.gridx = 32;
		gbc_casilla8.gridy = 8;
		add(casilla8, gbc_casilla8);
		
		JLabel casillaOca5 = new JLabel("");
		casillaOca5.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca5 = new GridBagConstraints();
		gbc_casillaOca5.insets = new Insets(0, 0, 5, 5);
		gbc_casillaOca5.gridx = 20;
		gbc_casillaOca5.gridy = 9;
		add(casillaOca5, gbc_casillaOca5);
		
		JLabel casilla51 = new JLabel("51");
		casilla51.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla51 = new GridBagConstraints();
		gbc_casilla51.insets = new Insets(0, 0, 5, 5);
		gbc_casilla51.gridx = 22;
		gbc_casilla51.gridy = 9;
		add(casilla51, gbc_casilla51);
		
		JLabel casilla43 = new JLabel("43");
		casilla43.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla43 = new GridBagConstraints();
		gbc_casilla43.insets = new Insets(0, 0, 5, 5);
		gbc_casilla43.gridx = 30;
		gbc_casilla43.gridy = 9;
		add(casilla43, gbc_casilla43);
		
		JLabel casilla7 = new JLabel("7");
		casilla7.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla7 = new GridBagConstraints();
		gbc_casilla7.insets = new Insets(0, 0, 5, 0);
		gbc_casilla7.gridx = 32;
		gbc_casilla7.gridy = 9;
		add(casilla7, gbc_casilla7);
		
		JLabel casilla24 = new JLabel("24");
		casilla24.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla24 = new GridBagConstraints();
		gbc_casilla24.insets = new Insets(0, 0, 5, 5);
		gbc_casilla24.gridx = 20;
		gbc_casilla24.gridy = 10;
		add(casilla24, gbc_casilla24);
		
		JLabel casilla52 = new JLabel("52");
		casilla52.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla52 = new GridBagConstraints();
		gbc_casilla52.insets = new Insets(0, 0, 5, 5);
		gbc_casilla52.gridx = 22;
		gbc_casilla52.gridy = 10;
		add(casilla52, gbc_casilla52);
		
		JButton botonTirarDado = new JButton("Tirar Dado");
		botonTirarDado.setFont(new Font("Consolas", Font.BOLD, 10));
		GridBagConstraints gbc_botonTirarDado = new GridBagConstraints();
		gbc_botonTirarDado.insets = new Insets(0, 0, 5, 5);
		gbc_botonTirarDado.gridx = 26;
		gbc_botonTirarDado.gridy = 10;
		add(botonTirarDado, gbc_botonTirarDado);
		
		JLabel casillaLaberinto = new JLabel("");
		casillaLaberinto.setIcon(new ImageIcon("laberinto.png"));
		GridBagConstraints gbc_casillaLaberinto = new GridBagConstraints();
		gbc_casillaLaberinto.insets = new Insets(0, 0, 5, 5);
		gbc_casillaLaberinto.gridx = 30;
		gbc_casillaLaberinto.gridy = 10;
		add(casillaLaberinto, gbc_casillaLaberinto);
		
		JLabel casillaPuente1 = new JLabel("");
		casillaPuente1.setIcon(new ImageIcon("puente.png"));
		casillaPuente1.setFont(new Font("Tahoma", Font.BOLD, 35));
		GridBagConstraints gbc_casillaPuente1 = new GridBagConstraints();
		gbc_casillaPuente1.insets = new Insets(0, 0, 5, 0);
		gbc_casillaPuente1.gridx = 32;
		gbc_casillaPuente1.gridy = 10;
		add(casillaPuente1, gbc_casillaPuente1);
		
		JLabel casilla25 = new JLabel("25");
		casilla25.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla25 = new GridBagConstraints();
		gbc_casilla25.insets = new Insets(0, 0, 5, 5);
		gbc_casilla25.gridx = 20;
		gbc_casilla25.gridy = 11;
		add(casilla25, gbc_casilla25);
		
		JLabel casillaDado2 = new JLabel("");
		casillaDado2.setIcon(new ImageIcon("dado.png"));
		GridBagConstraints gbc_casillaDado2 = new GridBagConstraints();
		gbc_casillaDado2.insets = new Insets(0, 0, 5, 5);
		gbc_casillaDado2.gridx = 22;
		gbc_casillaDado2.gridy = 11;
		add(casillaDado2, gbc_casillaDado2);
		
		JLabel casillaMeta = new JLabel("");
		casillaMeta.setIcon(new ImageIcon("terminar64.png"));
		GridBagConstraints gbc_casillaMeta = new GridBagConstraints();
		gbc_casillaMeta.insets = new Insets(0, 0, 5, 5);
		gbc_casillaMeta.gridx = 28;
		gbc_casillaMeta.gridy = 11;
		add(casillaMeta, gbc_casillaMeta);
		
		JLabel casillaOca9 = new JLabel("");
		casillaOca9.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca9 = new GridBagConstraints();
		gbc_casillaOca9.insets = new Insets(0, 0, 5, 5);
		gbc_casillaOca9.gridx = 30;
		gbc_casillaOca9.gridy = 11;
		add(casillaOca9, gbc_casillaOca9);
		
		JLabel casillaOca1 = new JLabel("");
		casillaOca1.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca1 = new GridBagConstraints();
		gbc_casillaOca1.insets = new Insets(0, 0, 5, 0);
		gbc_casillaOca1.gridx = 32;
		gbc_casillaOca1.gridy = 11;
		add(casillaOca1, gbc_casillaOca1);
		
		JLabel casillaDado1 = new JLabel("");
		casillaDado1.setIcon(new ImageIcon("dado.png"));
		GridBagConstraints gbc_casillaDado1 = new GridBagConstraints();
		gbc_casillaDado1.insets = new Insets(0, 0, 5, 5);
		gbc_casillaDado1.gridx = 20;
		gbc_casillaDado1.gridy = 12;
		add(casillaDado1, gbc_casillaDado1);
		
		JLabel casillaOca12 = new JLabel("");
		casillaOca12.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca12 = new GridBagConstraints();
		gbc_casillaOca12.insets = new Insets(0, 0, 5, 5);
		gbc_casillaOca12.gridx = 23;
		gbc_casillaOca12.gridy = 12;
		add(casillaOca12, gbc_casillaOca12);
		
		JLabel casilla55 = new JLabel("55");
		casilla55.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla55 = new GridBagConstraints();
		gbc_casilla55.insets = new Insets(0, 0, 5, 5);
		gbc_casilla55.gridx = 24;
		gbc_casilla55.gridy = 12;
		add(casilla55, gbc_casilla55);
		
		JLabel casillaPrision = new JLabel("");
		casillaPrision.setIcon(new ImageIcon("prision.png"));
		GridBagConstraints gbc_casillaPrision = new GridBagConstraints();
		gbc_casillaPrision.insets = new Insets(0, 0, 5, 5);
		gbc_casillaPrision.gridx = 25;
		gbc_casillaPrision.gridy = 12;
		add(casillaPrision, gbc_casillaPrision);
		
		JLabel casilla57 = new JLabel("57");
		casilla57.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla57 = new GridBagConstraints();
		gbc_casilla57.insets = new Insets(0, 0, 5, 5);
		gbc_casilla57.gridx = 26;
		gbc_casilla57.gridy = 12;
		add(casilla57, gbc_casilla57);
		
		JLabel casilla59 = new JLabel("59");
		casilla59.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla59 = new GridBagConstraints();
		gbc_casilla59.insets = new Insets(0, 0, 5, 5);
		gbc_casilla59.gridx = 27;
		gbc_casilla59.gridy = 12;
		add(casilla59, gbc_casilla59);
		
		JLabel casillaMuerte = new JLabel("");
		casillaMuerte.setIcon(new ImageIcon("muerte.png"));
		GridBagConstraints gbc_casillaMuerte = new GridBagConstraints();
		gbc_casillaMuerte.insets = new Insets(0, 0, 5, 5);
		gbc_casillaMuerte.gridx = 28;
		gbc_casillaMuerte.gridy = 12;
		add(casillaMuerte, gbc_casillaMuerte);
		
		JLabel casilla40 = new JLabel("40");
		casilla40.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla40 = new GridBagConstraints();
		gbc_casilla40.insets = new Insets(0, 0, 5, 5);
		gbc_casilla40.gridx = 30;
		gbc_casilla40.gridy = 12;
		add(casilla40, gbc_casilla40);
		
		JLabel casilla4 = new JLabel("4");
		casilla4.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla4 = new GridBagConstraints();
		gbc_casilla4.insets = new Insets(0, 0, 5, 0);
		gbc_casilla4.gridx = 32;
		gbc_casilla4.gridy = 12;
		add(casilla4, gbc_casilla4);
		
		JLabel casillaOca6 = new JLabel("");
		casillaOca6.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca6 = new GridBagConstraints();
		gbc_casillaOca6.insets = new Insets(0, 0, 5, 5);
		gbc_casillaOca6.gridx = 20;
		gbc_casillaOca6.gridy = 13;
		add(casillaOca6, gbc_casillaOca6);
		
		JLabel casilla39 = new JLabel("39");
		casilla39.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla39 = new GridBagConstraints();
		gbc_casilla39.insets = new Insets(0, 0, 5, 5);
		gbc_casilla39.gridx = 30;
		gbc_casilla39.gridy = 13;
		add(casilla39, gbc_casilla39);
		
		JLabel casilla3 = new JLabel("3");
		casilla3.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla3 = new GridBagConstraints();
		gbc_casilla3.insets = new Insets(0, 0, 5, 0);
		gbc_casilla3.gridx = 32;
		gbc_casilla3.gridy = 13;
		add(casilla3, gbc_casilla3);
		
		JLabel casilla28 = new JLabel("28");
		casilla28.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla28 = new GridBagConstraints();
		gbc_casilla28.insets = new Insets(0, 0, 5, 5);
		gbc_casilla28.gridx = 20;
		gbc_casilla28.gridy = 14;
		add(casilla28, gbc_casilla28);
		
		JLabel casilla29 = new JLabel("29");
		casilla29.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla29 = new GridBagConstraints();
		gbc_casilla29.insets = new Insets(0, 0, 5, 5);
		gbc_casilla29.gridx = 21;
		gbc_casilla29.gridy = 14;
		add(casilla29, gbc_casilla29);
		
		JLabel casilla30 = new JLabel("30");
		casilla30.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla30 = new GridBagConstraints();
		gbc_casilla30.insets = new Insets(0, 0, 5, 5);
		gbc_casilla30.gridx = 22;
		gbc_casilla30.gridy = 14;
		add(casilla30, gbc_casilla30);
		
		JLabel casilla31 = new JLabel("31");
		casilla31.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla31 = new GridBagConstraints();
		gbc_casilla31.insets = new Insets(0, 0, 5, 5);
		gbc_casilla31.gridx = 23;
		gbc_casilla31.gridy = 14;
		add(casilla31, gbc_casilla31);
		
		JLabel casillaOca7 = new JLabel("");
		casillaOca7.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca7 = new GridBagConstraints();
		gbc_casillaOca7.insets = new Insets(0, 0, 5, 5);
		gbc_casillaOca7.gridx = 24;
		gbc_casillaOca7.gridy = 14;
		add(casillaOca7, gbc_casillaOca7);
		
		JLabel casilla33 = new JLabel("33");
		casilla33.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla33 = new GridBagConstraints();
		gbc_casilla33.insets = new Insets(0, 0, 5, 5);
		gbc_casilla33.gridx = 25;
		gbc_casilla33.gridy = 14;
		add(casilla33, gbc_casilla33);
		
		JLabel casilla34 = new JLabel("34");
		casilla34.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla34 = new GridBagConstraints();
		gbc_casilla34.insets = new Insets(0, 0, 5, 5);
		gbc_casilla34.gridx = 26;
		gbc_casilla34.gridy = 14;
		add(casilla34, gbc_casilla34);
		
		JLabel casilla35 = new JLabel("35");
		casilla35.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla35 = new GridBagConstraints();
		gbc_casilla35.insets = new Insets(0, 0, 5, 5);
		gbc_casilla35.gridx = 27;
		gbc_casilla35.gridy = 14;
		add(casilla35, gbc_casilla35);
		
		JLabel casillaOca8 = new JLabel("");
		casillaOca8.setIcon(new ImageIcon("pato.png"));
		GridBagConstraints gbc_casillaOca8 = new GridBagConstraints();
		gbc_casillaOca8.insets = new Insets(0, 0, 5, 5);
		gbc_casillaOca8.gridx = 28;
		gbc_casillaOca8.gridy = 14;
		add(casillaOca8, gbc_casillaOca8);
		
		JLabel casilla37 = new JLabel("37");
		casilla37.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla37 = new GridBagConstraints();
		gbc_casilla37.insets = new Insets(0, 0, 5, 5);
		gbc_casilla37.gridx = 29;
		gbc_casilla37.gridy = 14;
		add(casilla37, gbc_casilla37);
		
		JLabel casilla38 = new JLabel("38");
		casilla38.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla38 = new GridBagConstraints();
		gbc_casilla38.insets = new Insets(0, 0, 5, 5);
		gbc_casilla38.gridx = 30;
		gbc_casilla38.gridy = 14;
		add(casilla38, gbc_casilla38);
		
		JLabel casilla2 = new JLabel("2");
		casilla2.setBackground(Color.PINK);
		casilla2.setFont(new Font("Tahoma", Font.BOLD, 55));
		GridBagConstraints gbc_casilla2 = new GridBagConstraints();
		gbc_casilla2.insets = new Insets(0, 0, 5, 0);
		gbc_casilla2.gridx = 32;
		gbc_casilla2.gridy = 14;
		add(casilla2, gbc_casilla2);
		
		JLabel casilla1 = new JLabel("");
		casilla1.setIcon(new ImageIcon("comienzo.png"));
		GridBagConstraints gbc_casilla1 = new GridBagConstraints();
		gbc_casilla1.gridx = 32;
		gbc_casilla1.gridy = 15;
		add(casilla1, gbc_casilla1);
	}

}
