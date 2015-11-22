package jugadores;

import carta.Mano;
import jugadas.Jugadas;
import main.Ranking;

public class Jugador {
	
	private Mano mano;
	private Jugadas mejorJugada;
	private int valor;
	private int numJugador; // es la posicion del jugador en la mesa (0..9)

	
	
	// Atributos de la parte 2.3
	private Ranking ranking;
	private boolean juega; // determina si el jugador hace OR o FOLD	
	
	
	
	// Constructores

	public Jugador(Mano mano) {
		this.mano = mano;
	}
	
	public Jugador(int n) {
		this.numJugador = n;
		this.juega = false;
	}
	
	
	// Metodos
	
	
	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}
	
	
	public boolean getJuega() {
		return juega;
	}

	public void setJuega(boolean juega) {
		this.juega = juega;
	}
	
	public Mano getMano() {
		return this.mano;
	}
	
	public void setMejorJugada(Jugadas jugada) {
		this.mejorJugada = jugada;
		this.valor = this.mejorJugada.getValorJugada();
	}

	
	public int getValorJugador() {
		return this.valor;
	}
	
	public int getNumJugador() {
		return this.numJugador;
	}
	
	public void setMano(Mano mano) {
		this.mano = mano;
	}
	
	public Jugadas getMejorJugada() {
		return this.mejorJugada;
	}
	
	
	
	public String toString() {
		String cadena;
		cadena = "J"+this.numJugador+": "+this.mejorJugada.toString();
		return cadena;
	}

}
