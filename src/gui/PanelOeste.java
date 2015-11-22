package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controlador.Controller;
import jugadores.Jugador;
import main.PilaPosiciones;
import observers.RangoObserver;

public class PanelOeste extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private JButton evaluate;
	private JButton[] players;
	private Jugador[] jugadores;
	private JTextField[] rangopls;
	private String rango;
	private JTextArea salida;
	private Controller controller;
	private JComboBox<String> comboBox;
	private String[] ops = {"Sklansky-Chubukov", "Janda"};
	
	public PanelOeste(Controller contr) {
		

		this.controller = contr;
		
		JButton player;
		JTextField rango;
		StringBuilder namePlayer = new StringBuilder();
		int tam=0;
		
		this.jugadores = new Jugador[9];
		this.players = new JButton[9];
		this.rangopls = new JTextField[9];
		this.rango = new String();
		this.comboBox = new JComboBox<String>(ops);
		this.comboBox.setSelectedIndex(0);
		
		this.setLayout(new GridLayout(2, 0));
		
		JPanel norte = new JPanel();
		norte.setLayout(null);
		
		for(int i=0; i < 9; i++) {
			
			namePlayer.append("Player ");
			namePlayer.append(i+1);
			
			this.jugadores[i] = new Jugador(i);
			
			if(i==0){
				tam = 10;
				player = new JButton(namePlayer.toString());
				player.setBounds(7, tam, 90, 30);
				player.setMargin(new Insets(1,1,1,1));
				
				rango = new JTextField();
				rango.getPreferredSize();
				rango.setBounds(104, tam, 170, 32);
			}
			else {
				tam+= 35;
				player = new JButton(namePlayer.toString());
				player.setBounds(7, tam, 90, 30);
				player.setMargin(new Insets(1,1,1,1));
				
				rango = new JTextField();
				rango.getPreferredSize();
				rango.setBounds(104, tam, 170, 32);
				
			}
			
			this.players[i] = player;
			this.rangopls[i] = rango;
			
			this.players[i].addActionListener(this);
			
			norte.add(player);
			norte.add(rango);
			
			namePlayer.delete(0, namePlayer.length());
			
		}
		
		
		
		this.evaluate = new JButton("Evaluate");
		this.evaluate.setBounds(350, 200, 90, 30);
		this.evaluate.setMargin(new Insets(1,1,1,1));
		
		this.comboBox.setBounds(320, 10, 150, 30);
		
		
		this.evaluate.addActionListener(this);	
		this.comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	
		    	JComboBox<String> aux;
				
				if((aux = (JComboBox<String>)e.getSource()) == comboBox) {
					
					String selectedRanking = (String)aux.getSelectedItem();
					
					System.out.println(selectedRanking);
				
					if("Sklansky-Chubukov".equalsIgnoreCase(selectedRanking)){
						controller.setRanking(1);
					}
					else if ("Janda".equalsIgnoreCase(selectedRanking)){
						controller.setRanking(2);
					}
				}
		        
		    }
		});
		
		
		norte.add(this.evaluate);
		norte.add(this.comboBox);
		
		
		
		this.add(norte);
		
		JPanel sur = new JPanel();
		JPanel vacio = new JPanel();
		JPanel vacio2 = new JPanel();
		sur.setLayout(new BorderLayout());
		this.salida = new JTextArea(15,50);
		vacio2.setLayout(new BorderLayout());
		vacio2.add(salida);
		vacio2.setBorder(new TitledBorder("Salida"));
		sur.add(vacio2, BorderLayout.SOUTH);
		sur.add(vacio, BorderLayout.CENTER);
		this.add(sur);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.evaluate) {
			
			for (int i = 0; i < players.length; i++) {
				if(this.players[i] == e.getSource()){
					// marco acccion al player[i] como OR
					this.jugadores[i].setRanking(this.controller.getRanking());
					this.jugadores[i].setJuega(true);
				}
				else {// Si no, marco accion al player[i] como FOLD
					this.jugadores[i].setJuega(false);
				}
				// Recojo las manos de cada player independientemente de si has hecho OR o FOLD
				try {
					this.rango = this.rangopls[i].getText();
					this.controller.nuevoRango(this.rango);
				} catch (Exception e2) {
					// TODO: handle exception
				}
				this.players[i].setEnabled(true);
				this.rangopls[i].setText("");
			}
			
		}
		
		for (int i = 0; i < players.length; i++) {
			if(this.players[i] == e.getSource()) {
				try {
					this.players[i].setEnabled(false);
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		}
		
		
		
		
		
	}

}
