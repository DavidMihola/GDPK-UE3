public class Linie implements Verschiebbar {
	// Gerade von p1 nach p2
	private Punkt p1;
	private Punkt p2;
	
	public Linie(Punkt initP1, Punkt initP2) {
		p1 = initP1;
		p2 = initP2;
	}

	public void verschiebe(double deltaX, double deltaY) {
		p1.verschiebe(deltaX, deltaY);
		p2.verschiebe(deltaX, deltaY);
	}

	public void skaliere(double faktor) {
		p1.skaliere(faktor);
		p2.skaliere(faktor);
	}
}

