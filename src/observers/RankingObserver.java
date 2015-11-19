package observers;

import main.PilaPosiciones;

public interface RankingObserver {
	
	public void hayRanking(PilaPosiciones pila);
	
	public void addObserver(RankingObserver obs);

}
