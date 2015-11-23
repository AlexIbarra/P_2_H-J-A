package ranking;

import main.PilaPosiciones;
import observers.RankingObserver;

public interface Ranking {
	public PilaPosiciones getPosiciones (int porcentaje);
	public void addObserver(RankingObserver obs);
	public void notifyNewRanking(PilaPosiciones pila);
	public void rellenaArray();
}
