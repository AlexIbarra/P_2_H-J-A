package main;

import carta.Carta;

public class ParserRangos {

	private class Boton{
		int fila;
		int col;
		public Boton(int f, int c){
			this.fila = f;
			this.col = c;
		}
	}
	
	private static Boton[] paresDeCartas;
	//private String cadena;
	private static Carta carta1;
	private static Carta carta2;
	private static Carta carta3;
	
	static int ancho = 14;
	
	public Boton[] parseRangos(String s) {
		
		int posArray = 0;
		String[] array = s.split(",");		
		int fila;
		int col;
		
		
		
		for(int i = 0; i < array.length;i++){
			char[] token = array[i].toCharArray();
			
			if(array[i].contains("+")){
				if (token[0] == token[1]){
					//Es pareja
					carta1 = new Carta(token[0]);
					carta2 = new Carta(token[1]);
					int j = carta1.getCodigo();
					while(j < 15){                
						paresDeCartas[posArray] = new Boton(ancho - j,ancho - j);//(ancho - j) * ancho + (ancho - j);
						j++;
						posArray++;
					}
					
				}
				else{
					//Que no sea una pareja
					if (array[i].contains("s")){
						//suited
						carta1 = new Carta(token[1]);
						carta2 = new Carta(token[5]);
						carta3 = new Carta(token[0]);
						fila = carta3.getCodigo();
						int j = carta1.getCodigo();
						int p = carta2.getCodigo();
						
						while(p <= j){
							paresDeCartas[posArray] = new Boton(ancho-fila,ancho-p);//(ancho-fila)*ancho + (ancho-p);
							p++;
							posArray++;
						}
					}
					else{
						//offsuited
						carta1 = new Carta(token[1]);
						carta2 = new Carta(token[5]);
						carta3 = new Carta(token[0]);
						col = carta3.getCodigo();
						int j = carta1.getCodigo();
						int p = carta2.getCodigo();
						while(p <= j){
							paresDeCartas[posArray] = new Boton(ancho-p,ancho-col);//(ancho-p)+ancho + (ancho-col);
							p++;
							posArray++;
						}
					}	
				}
				
			}
			else if(array[i].contains("-")){
				if (array[i].contains("s")){
					//suited
					carta1 = new Carta(token[1]);
					carta2 = new Carta(token[5]);
					carta3 = new Carta(token[0]);
					int j = carta1.getCodigo();
					int p = carta2.getCodigo();
					fila = carta3.getCodigo();
					while(p <= j){
						paresDeCartas[posArray] = new Boton(ancho-fila,ancho-p);//(ancho-fila)*ancho + (ancho-p);
						p++;
						posArray++;
					}
				}
				else{
					//offsuited
					carta1 = new Carta(token[1]);
					carta2 = new Carta(token[5]);
					carta3 = new Carta(token[0]);
					int j = carta1.getCodigo();
					int p = carta2.getCodigo();
					col = carta3.getCodigo();
					while(p <= j){
						paresDeCartas[posArray] = new Boton(ancho-p,ancho-col);//(ancho-p)+ancho + (ancho-col);
						p++;
						posArray++;
					}
				}
			}
			else{
				//Caso de un solo par de cartas.
				
				carta1 = new Carta(token[0]);
				carta2 = new Carta(token[1]);
				fila = carta1.getCodigo();
				col = carta2.getCodigo();
				paresDeCartas[posArray] = new Boton(ancho-fila,ancho-col);//(ancho-fila)+ancho + (ancho-col);
				posArray++;
								
			}
			
			
		}
		
		
		
		
		
		return paresDeCartas;
	}
		
	
	
	
	
	
	
	
}