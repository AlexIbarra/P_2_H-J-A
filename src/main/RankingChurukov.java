
package main;

public class RankingChurukov {
	
	
	
	private int porcentaje;
	private Ranking[] vecRanking;
	
	public RankingChurukov(int porcentaje){
		this.porcentaje = porcentaje;
	}
	
	private class Ranking{
		int fila;
		int columna;
		public Ranking(int fila, int columna){
			this.fila = fila;
			this.columna = columna;
			
		}
	} 
	
	void rellenaArray(){
		
		vecRanking[0] = new Ranking(0,0);
		vecRanking[1] = new Ranking(1,1);
		vecRanking[2] = new Ranking(0,1);
		vecRanking[3] = new Ranking(2,2);
		vecRanking[4] = new Ranking(1,0);
		vecRanking[5] = new Ranking(3,3);
		vecRanking[6] = new Ranking(0,2);
		vecRanking[7] = new Ranking(4,4);
		vecRanking[8] = new Ranking(2,0);
		vecRanking[9] = new Ranking(5,5);
		vecRanking[10] = new Ranking(0,3);
		vecRanking[11] = new Ranking(6,6);
		vecRanking[12] = new Ranking(0,4);
		vecRanking[13] = new Ranking(3,0);
		vecRanking[14] = new Ranking(7,7);
		vecRanking[15] = new Ranking(8,8);
		vecRanking[16] = new Ranking(4,0);
		vecRanking[17] = new Ranking(0,5);
		vecRanking[18] = new Ranking(9,9);
		vecRanking[19] = new Ranking(0,8);
		vecRanking[20] = new Ranking(1,2);
		vecRanking[21] = new Ranking(10,10);
		vecRanking[22] = new Ranking(0,5);
		vecRanking[23] = new Ranking(0,7);
		vecRanking[24] = new Ranking(1,3);
		vecRanking[25] = new Ranking(0,9);
		vecRanking[26] = new Ranking(6,0);
		vecRanking[27] = new Ranking(0,8);
		vecRanking[28] = new Ranking(0,10);
		vecRanking[29] = new Ranking(11,11);
		vecRanking[30] = new Ranking(1,4);
		vecRanking[31] = new Ranking(7,0);
		vecRanking[32] = new Ranking(0,11);
		vecRanking[33] = new Ranking(2,1);
		vecRanking[34] = new Ranking(0,12);
		vecRanking[35] = new Ranking(9,0);
		vecRanking[36] = new Ranking(8,0);
		vecRanking[37] = new Ranking(10,0);
		vecRanking[38] = new Ranking(3,1);
		vecRanking[39] = new Ranking(2,3);
		vecRanking[40] = new Ranking(11,0);
		vecRanking[41] = new Ranking(12,12);
		vecRanking[42] = new Ranking(1,6);
		vecRanking[43] = new Ranking(12,0);
		vecRanking[44] = new Ranking(1,4);
		vecRanking[45] = new Ranking(2,4);	
		vecRanking[46] = new Ranking(1,6);
		vecRanking[47] = new Ranking(1,7);
		vecRanking[48] = new Ranking(3,4);
		vecRanking[49] = new Ranking(1,5);
		vecRanking[50] = new Ranking(1,8);
		vecRanking[51] = new Ranking(3,2);
		vecRanking[52] = new Ranking(2,5);
		vecRanking[53] = new Ranking(1,9);
		vecRanking[54] = new Ranking(8,1);
		vecRanking[55] = new Ranking(1,10);
		vecRanking[56] = new Ranking(4,2);
		vecRanking[57] = new Ranking(7,1);
		vecRanking[58] = new Ranking(1,11);
		vecRanking[59] = new Ranking(1,12);
		vecRanking[60] = new Ranking(2,6);
		vecRanking[61] = new Ranking(8,1);
		vecRanking[62] = new Ranking(3,5);
		vecRanking[63] = new Ranking(9,1);
		vecRanking[64] = new Ranking(5,2);
		vecRanking[65] = new Ranking(4,3);
		vecRanking[66] = new Ranking(10,1);
		vecRanking[67] = new Ranking(2,7);
		vecRanking[68] = new Ranking(4,5);
		vecRanking[69] = new Ranking(2,8);
		vecRanking[70] = new Ranking(11,1);
		vecRanking[71] = new Ranking(3,6);
		vecRanking[72] = new Ranking(2,9);
		vecRanking[73] = new Ranking(12,1);
		vecRanking[74] = new Ranking(8,2);
		vecRanking[75] = new Ranking(2,10);
		vecRanking[76] = new Ranking(5,3);
		vecRanking[77] = new Ranking(2,11);
		vecRanking[78] = new Ranking(4,6);
		vecRanking[79] = new Ranking(3,7);
		vecRanking[80] = new Ranking(7,2);
		vecRanking[81] = new Ranking(2,12);
		vecRanking[82] = new Ranking(8,2);
		vecRanking[83] = new Ranking(5,6);
		vecRanking[84] = new Ranking(9,2);
		vecRanking[85] = new Ranking(6,3);
		vecRanking[86] = new Ranking(5,4);
		vecRanking[87] = new Ranking(3,8);
		vecRanking[88] = new Ranking(4,7);
		vecRanking[89] = new Ranking(3,9);	
		vecRanking[90] = new Ranking(10,2);
		vecRanking[91] = new Ranking(3,10);
		vecRanking[92] = new Ranking(7,3);
		vecRanking[93] = new Ranking(11,2);
		vecRanking[94] = new Ranking(5,7);
		vecRanking[95] = new Ranking(4,6);
		vecRanking[96] = new Ranking(3,11);
		vecRanking[97] = new Ranking(4,8);
		vecRanking[98] = new Ranking(12,2);
		vecRanking[99] = new Ranking(3,12);
		vecRanking[100] = new Ranking(6,7);
		vecRanking[101] = new Ranking(8,3);
		vecRanking[102] = new Ranking(6,5);
		vecRanking[103] = new Ranking(7,4);
		vecRanking[104] = new Ranking(5,8);
		vecRanking[105] = new Ranking(9,3);
		vecRanking[106] = new Ranking(4,9);
		vecRanking[107] = new Ranking(4,10);
		vecRanking[108] = new Ranking(6,8);
		vecRanking[109] = new Ranking(10,3);
		vecRanking[110] = new Ranking(8,4);
		vecRanking[111] = new Ranking(7,5);
		vecRanking[112] = new Ranking(4,11);
		vecRanking[113] = new Ranking(7,8);
		vecRanking[114] = new Ranking(5,9);
		vecRanking[115] = new Ranking(11,3);
		vecRanking[116] = new Ranking(4,12);
		vecRanking[117] = new Ranking(7,6);
		vecRanking[118] = new Ranking(6,9);
		vecRanking[119] = new Ranking(8,5);
		vecRanking[120] = new Ranking(9,4);
		vecRanking[121] = new Ranking(12,3);
		vecRanking[122] = new Ranking(7,9);
		vecRanking[123] = new Ranking(6,10);
		vecRanking[124] = new Ranking(10,4);
		vecRanking[125] = new Ranking(8,9);
		vecRanking[126] = new Ranking(8,6);
		vecRanking[127] = new Ranking(5,11);
		vecRanking[128] = new Ranking(6,10);
		vecRanking[129] = new Ranking(9,5);
		vecRanking[130] = new Ranking(11,4);
		vecRanking[131] = new Ranking(8,7);
		vecRanking[132] = new Ranking(5,12);
		vecRanking[133] = new Ranking(7,10);	
		vecRanking[134] = new Ranking(9,10);
		vecRanking[135] = new Ranking(12,4);
		vecRanking[136] = new Ranking(9,6);
		vecRanking[137] = new Ranking(8,10);
		vecRanking[138] = new Ranking(6,11);
		vecRanking[139] = new Ranking(10,5);
		vecRanking[140] = new Ranking(9,7);
		vecRanking[141] = new Ranking(6,12);
		vecRanking[142] = new Ranking(7,11);
		vecRanking[143] = new Ranking(11,5);
		vecRanking[144] = new Ranking(9,8);
		vecRanking[145] = new Ranking(9,11);
		vecRanking[146] = new Ranking(8,11);
		vecRanking[147] = new Ranking(10,6);
		vecRanking[148] = new Ranking(12,5);
		vecRanking[149] = new Ranking(10,11);
		vecRanking[150] = new Ranking(10,7);
		vecRanking[151] = new Ranking(7,12);
		vecRanking[152] = new Ranking(10,9);
		vecRanking[153] = new Ranking(19,8);
		vecRanking[154] = new Ranking(9,12);
		vecRanking[155] = new Ranking(8,12);		
		vecRanking[156] = new Ranking(11,6);
		vecRanking[157] = new Ranking(10,12);
		vecRanking[158] = new Ranking(12,6);
		vecRanking[159] = new Ranking(11,7);
		vecRanking[160] = new Ranking(11,9);
		vecRanking[161] = new Ranking(11,8);
		vecRanking[162] = new Ranking(11,12);
		vecRanking[163] = new Ranking(11,10);
		vecRanking[164] = new Ranking(12,7);
		vecRanking[165] = new Ranking(12,9);
		vecRanking[166] = new Ranking(12,8);
		vecRanking[167] = new Ranking(12,11);
		}
	

}
