package controlador;

import main.ParserRangos;
import main.ParserRankings;
import main.PilaPosiciones;
import main.Posicion;
import observers.RangoObserver;
import observers.RankingObserver;
import ranking.*;

public class Controller {
	
	private ParserRangos pRangos;
	private ParserRankings pRankings;
	private Ranking rankings[];
	private Ranking rankingActivo;
	private RankingChurukov rChurukov;
	private String rango;
	
	

	public Controller() {
		this.pRangos = new ParserRangos();
		this.pRankings = new ParserRankings();
		this.rankings  = new Ranking[3];
		this.rankings[0] = new RankingChurukov();
		this.rankings[1] = new RankingJanda();
		this.rankings[2] = new RankingMa();
		this.rankingActivo = this.rankings[0]; // set Churukov default
		
	}
	
	
	
	
	
	public void evaluaRango(String mano, String pos, String accion){
		// parsera el fichero y devolver los string con los datos
		String[] salida = new String[4];
		this.pRankings.setRango(this.rankingActivo.toString());
		salida[0] = this.rankingActivo.toString();
		this.pRankings.setManoJugada(mano);
		salida[1] = mano;
		this.pRankings.setPosicion(pos);
		salida[2] = pos;
		this.pRankings.setOR(accion);
		salida[3] = accion;
		this.pRankings.notifyJugadaEvaluada(salida, this.pRankings.Resultado());
	}
	
	public void setRanking(int opcion) {
		if(opcion == 1)
			this.rankingActivo = this.rankings[0];
		else if(opcion == 2)
			this.rankingActivo = this.rankings[1];
		else if(opcion == 3)
			this.rankingActivo = this.rankings[2];
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
		this.pRankings.addObserver(obs);
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
	
	public void addSeleccionado(String selec) {
		this.pRankings.addSeleccionado(selec);
	}
	
}
