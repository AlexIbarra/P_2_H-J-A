package controlador;

import main.ParserRangos;
import main.PilaPosiciones;
import main.Posicion;
import observers.RangoObserver;

public class Controller {
	
	private ParserRangos pRangos;
	private String rango;
	
	

	public Controller() {
		this.pRangos = new ParserRangos();
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
	public void addObserver(RangoObserver obs){
		this.pRangos.addObserver(obs);
	}
	
	public void nuevoRango(String rango) {
		this.pRangos.notifyHayRango(rango);
	}
	
}
