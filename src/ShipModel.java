public enum ShipModel {
	PORTE_AVION(5), CROISEUR(4), TORPILLEUR(3),CONTRE_TORPILLEUR(3),SOUS_MARIN(2);

	private final int size;
	
	private ShipModel(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}	
	
}
