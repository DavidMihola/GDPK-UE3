public class Scheibe implements Verschiebbar, Skalierbar {
	private Punkt i;
	private double r;

	public Scheibe(double ix, double iy, double radius) {
		i = new Punkt(ix, iy);
		r = Math.abs(radius); // darf nicht negativ sein
	}

	public void verschiebe(double dx, double dy) {
		i.verschiebe(dx, dy);
	}

	public void skaliere(double faktor) {
		i.skaliere(faktor);
		r = r * faktor;
	}
}

