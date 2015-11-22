package controlador;

import main.ParserRangos;
import main.PilaPosiciones;
import main.Posicion;
import main.Ranking;
import main.RankingChurukov;
import main.RankingJanda;
import observers.RangoObserver;
import observers.RankingObserver;

public class Controller {
	
	private ParserRangos pRangos;
	private Ranking rankings[];
	private Ranking rankingActivo;
	private RankingChurukov rChurukov;
	private String rango;
	
	

	public Controller() {
		this.pRangos = new ParserRangos();
		this.rankings  = new Ranking[2];
		this.rankings[0] = new RankingChurukov();
		this.rankings[1] = new RankingJanda();
		this.rankingActivo = this.rankings[0]; // set Churukov default
		
	}
	
	public void setRanking(int opcion) {
		if(opcion == 1)
			this.rankingActivo = this.rankings[0];
		else if(opcion == 2)
			this.rankingActivo = this.rankings[1];
	}
	
	public Ranking getRanking() {
		return rankingActivo;
	}
	
	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}
	
	public PilaPosiciones parse(String rango) {
		return this.pRangos.parseRangos(rango);
	}
	
	public boolean dimeBroadway(String cartas) {
		return this.pRangos.dimeBroadway(cartas);
	}

	
	
	// Metodos para los Observers
	public void addRangoObserver(RangoObserver obs){
		this.pRangos.addObserver(obs);
	}
	
	public void addRankingObserver(RankingObserver obs){
		this.rankingActivo.addObserver(obs);
	}
	
	
	public void nuevoRango(String rango) {
		this.pRangos.notifyHayRango(rango);
	}
	
	public void nuevoranking(int porcentaje) {
		this.rankingActivo.notifyNewRanking(this.rankingActivo.getPosiciones(porcentaje));
	}
	
	public void damePosiciones(int opcion) {
		this.pRangos.damePosicoines(opcion);
	}
	
	public void cleanGrid() {
		this.pRangos.notifyClean();
	}
	
	public void dameBroadways() {
		this.pRangos.notifyBroadways();
	}
	
}
