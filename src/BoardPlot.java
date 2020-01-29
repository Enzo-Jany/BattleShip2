
public class BoardPlot implements Plot {

	private int abscisse;
	private int ordonnee;
	
	public BoardPlot(int abscisse, int ordonnee) {
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}

	@Override
	public int getOrdonnee() {
		return ordonnee;
	}

	@Override
	public int getAbscisse() {
		return abscisse;
	}

	@Override
	public Plot getPlotTo(Direction uneDirection) {
		switch(uneDirection) {
			case Nord :
				return new BoardPlot(abscisse, ordonnee+1);
			case Sud :
				return new BoardPlot(abscisse, ordonnee -1);
			case Est :
				return new BoardPlot(abscisse +1, ordonnee);
			case Ouest :
				return new BoardPlot(abscisse -1, ordonnee);
			default:
				return new BoardPlot(0, 0);
				
		}
	}
}
