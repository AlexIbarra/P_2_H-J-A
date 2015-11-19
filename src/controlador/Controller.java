package controlador;

import main.ParserRangos;
import main.PilaPosiciones;
import main.Posicion;
import main.RankingChurukov;
import observers.RangoObserver;
import observers.RankingObserver;

public class Controller {
	
	private ParserRangos pRangos;
	private RankingChurukov rChurukov;
	private String rango;
	
	

	public Controller() {
		this.pRangos = new ParserRangos();
		this.rChurukov = new RankingChurukov();
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

	
	
	// Metodos para los Observers
	public void addRangoObserver(RangoObserver obs){
		this.pRangos.addObserver(obs);
	}
	
	public void addRankingObserver(RankingObserver obs){
		this.rChurukov.addObserver(obs);
	}
	
	
	public void nuevoRango(String rango) {
		this.pRangos.notifyHayRango(rango);
	}
	
	public void nuevoranking(int porcentaje) {
		this.rChurukov.notifyNewRanking(this.rChurukov.getPosiciones(porcentaje));
	}
	
}
