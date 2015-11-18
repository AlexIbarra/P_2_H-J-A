package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class PanelLabels extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	
	private JLabel[][] pares;
	
	
	
	
	
	public PanelLabels(){
		
		
		this.pares = new JLabel[13][13];
		Border border = BorderFactory.createLineBorder(Color.black, 1);
		
		
		
		
        this.setLayout(new java.awt.GridLayout(13, 13));
        
		
		for(int i=0; i<13; i++) {
			for(int j=0; j<13; j++) {
				this.pares[j][i] = new JLabel();				
				this.pares[j][i].setPreferredSize(new Dimension(30, 30));
//				this.pares[j][i].setMargin(new Insets(1,1,1,1));
				this.pares[j][i].setBorder(border);
				this.pares[j][i].setFont(new Font("Arial", Font.PLAIN, 12));
				
				this.pares[j][i].setVerticalAlignment(SwingConstants.CENTER);
				this.pares[j][i].setHorizontalAlignment(SwingConstants.CENTER);

				if(j==i)
					this.pares[j][i].setBackground(new Color(0, 255, 0));
				else if(j>i)
					this.pares[j][i].setBackground(new Color(255, 0, 0));
				else
					this.pares[j][i].setBackground(new Color(0, 0, 255));
				
				this.pares[j][i].setOpaque(true);
//				this.pares[j][i].repaint();
				this.add(this.pares[j][i]);
			}
			
		}
		
		this.pares[0][0].setText("AA");
		this.pares[1][0].setText("AKs");
    	this.pares[2][0].setText("AQs");
    	this.pares[3][0].setText("AJs");
    	this.pares[4][0].setText("ATs");
    	this.pares[5][0].setText("A9s");
    	this.pares[6][0].setText("A8s");
    	this.pares[7][0].setText("A7s");
    	this.pares[8][0].setText("A6s");
    	this.pares[9][0].setText("A5s");
    	this.pares[10][0].setText("A4s");
    	this.pares[11][0].setText("A3s");
    	this.pares[12][0].setText("A2s");    	
    	this.pares[0][1].setText("AKo");
    	this.pares[1][1].setText("KK");
    	this.pares[2][1].setText("KQs");
    	this.pares[3][1].setText("KJs");
    	this.pares[4][1].setText("KTs");
    	this.pares[5][1].setText("K9s");
    	this.pares[6][1].setText("K8s");
    	this.pares[7][1].setText("K7s");
    	this.pares[8][1].setText("K6s");
    	this.pares[9][1].setText("K5s");
    	this.pares[10][1].setText("K4s");
    	this.pares[11][1].setText("K3s");
    	this.pares[12][1].setText("K2s");    	
    	this.pares[0][2].setText("AQo");
    	this.pares[1][2].setText("KQo");
    	this.pares[2][2].setText("QQ");
    	this.pares[3][2].setText("QJs");
    	this.pares[4][2].setText("QTs");
    	this.pares[5][2].setText("Q9s");
    	this.pares[6][2].setText("Q8s");
    	this.pares[7][2].setText("Q7s");
    	this.pares[8][2].setText("Q6s");
    	this.pares[9][2].setText("Q5s");
    	this.pares[10][2].setText("Q4s");
    	this.pares[11][2].setText("Q3s");
    	this.pares[12][2].setText("Q2s");    	
    	this.pares[0][3].setText("AJo");
    	this.pares[1][3].setText("KJo");
    	this.pares[2][3].setText("QJo");
    	this.pares[3][3].setText("JJ");
    	this.pares[4][3].setText("JTs");
    	this.pares[5][3].setText("J9s");
    	this.pares[6][3].setText("J8s");
    	this.pares[7][3].setText("J7s");
    	this.pares[8][3].setText("J6s");
    	this.pares[9][3].setText("J5s");
    	this.pares[10][3].setText("J4s");
    	this.pares[11][3].setText("J3s");
    	this.pares[12][3].setText("J2s");    	
    	this.pares[0][4].setText("ATo");
    	this.pares[1][4].setText("KTo");
    	this.pares[2][4].setText("QTo");
    	this.pares[3][4].setText("JTo");
    	this.pares[4][4].setText("TT");
    	this.pares[5][4].setText("T9s");
    	this.pares[6][4].setText("T8s");
    	this.pares[7][4].setText("T7s");
    	this.pares[8][4].setText("T6s");
    	this.pares[9][4].setText("T5s");
    	this.pares[10][4].setText("T4s");
    	this.pares[11][4].setText("T3s");
    	this.pares[12][4].setText("T2s");    	
    	this.pares[0][5].setText("A9o");
    	this.pares[1][5].setText("K9o");
    	this.pares[2][5].setText("Q9o");
    	this.pares[3][5].setText("J9o");
    	this.pares[4][5].setText("T9o");
    	this.pares[5][5].setText("99");
    	this.pares[6][5].setText("98s");
    	this.pares[7][5].setText("97s");
    	this.pares[8][5].setText("96s");
    	this.pares[9][5].setText("95s");
    	this.pares[10][5].setText("94s");
    	this.pares[11][5].setText("93s");
    	this.pares[12][5].setText("92s");
    	this.pares[0][6].setText("A8o");
    	this.pares[1][6].setText("K8o");
    	this.pares[2][6].setText("Q8o");
    	this.pares[3][6].setText("J8o");
    	this.pares[4][6].setText("T8o");
    	this.pares[5][6].setText("98o");
    	this.pares[6][6].setText("88");
    	this.pares[7][6].setText("87s");
    	this.pares[8][6].setText("86s");
    	this.pares[9][6].setText("85s");
    	this.pares[10][6].setText("84s");
    	this.pares[11][6].setText("83s");
    	this.pares[12][6].setText("82s");
    	this.pares[0][7].setText("A7o");
    	this.pares[1][7].setText("K7o");
    	this.pares[2][7].setText("Q7o");
    	this.pares[3][7].setText("J7o");
    	this.pares[4][7].setText("T7o");
    	this.pares[5][7].setText("97o");
    	this.pares[6][7].setText("67o");
    	this.pares[7][7].setText("77");
    	this.pares[8][7].setText("76s");
    	this.pares[9][7].setText("75s");
    	this.pares[10][7].setText("74s");
    	this.pares[11][7].setText("73s");
    	this.pares[12][7].setText("72s");
    	this.pares[0][8].setText("A6o");
    	this.pares[1][8].setText("K6o");
    	this.pares[2][8].setText("Q6o");
    	this.pares[3][8].setText("J6o");
    	this.pares[4][8].setText("T6o");
    	this.pares[5][8].setText("96o");
    	this.pares[6][8].setText("86o");
    	this.pares[7][8].setText("76o");
    	this.pares[8][8].setText("66");
    	this.pares[9][8].setText("65s");
    	this.pares[10][8].setText("64s");
    	this.pares[11][8].setText("63s");
    	this.pares[12][8].setText("62s");    	
    	this.pares[0][9].setText("A5o");
    	this.pares[1][9].setText("K5o");
    	this.pares[2][9].setText("Q5o");
    	this.pares[3][9].setText("J5o");
    	this.pares[4][9].setText("T5o");
    	this.pares[5][9].setText("95o");
    	this.pares[6][9].setText("85o");
    	this.pares[7][9].setText("75o");
    	this.pares[8][9].setText("65o");
    	this.pares[9][9].setText("55");
    	this.pares[10][9].setText("54s");
    	this.pares[11][9].setText("53s");
    	this.pares[12][9].setText("52s");    	
    	this.pares[0][10].setText("A4o");
    	this.pares[1][10].setText("K4o");
    	this.pares[2][10].setText("Q4o");
    	this.pares[3][10].setText("J4o");
    	this.pares[4][10].setText("T4o");
    	this.pares[5][10].setText("94o");
    	this.pares[6][10].setText("84o");
    	this.pares[7][10].setText("74o");
    	this.pares[8][10].setText("64o");
    	this.pares[9][10].setText("54o");
    	this.pares[10][10].setText("44");
    	this.pares[11][10].setText("43s");
    	this.pares[12][10].setText("42s");    	
    	this.pares[0][11].setText("A3o");
    	this.pares[1][11].setText("K3o");
    	this.pares[2][11].setText("Q3o");
    	this.pares[3][11].setText("J3o");
    	this.pares[4][11].setText("T3o");
    	this.pares[5][11].setText("93o");
    	this.pares[6][11].setText("83o");
    	this.pares[7][11].setText("73o");
    	this.pares[8][11].setText("63o");
    	this.pares[9][11].setText("53o");
    	this.pares[10][11].setText("43o");
    	this.pares[11][11].setText("33");
    	this.pares[12][11].setText("32s");    	
    	this.pares[0][12].setText("A2o");
    	this.pares[1][12].setText("K2o");
    	this.pares[2][12].setText("Q2o");
    	this.pares[3][12].setText("J2o");
    	this.pares[4][12].setText("T2o");
    	this.pares[5][12].setText("92o");
    	this.pares[6][12].setText("82o");
    	this.pares[7][12].setText("72o");
    	this.pares[8][12].setText("62o");
    	this.pares[9][12].setText("52o");
    	this.pares[10][12].setText("42o");
    	this.pares[11][12].setText("32o");
    	this.pares[12][12].setText("22");
    	
    	
//    	updateUI();
//    	repaint();
		
		
	}
}
