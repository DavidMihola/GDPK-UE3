public class Punkt implements Verschiebbar, Skalierbar {
	private double x = 0.0, y = 0.0;
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void verschiebe(double deltaX, double deltaY) {
		x = x + deltaX;
		y = y + deltaY;
	}

	public void skaliere(double faktor) {
		x = x * faktor;
		y = y * faktor;
	}

	double distanzZumUrsprung() {
		return Math.sqrt(x*x + y*y);
	}
}

