public class Tests {
	public static void main(String[] args) {

		// Beispiel 1
		System.out.println(new Punkt(1,1));
		Linie linie = new Linie(new Punkt(1,1), new Punkt(2,3));
		linie.skaliere(2);
		System.out.println(linie);
	
		linie.verschiebe(-2, -2);	
		System.out.println(linie);

		Scheibe s = new Scheibe ( 2.0, 1.0, 17.0 );
		s.skaliere(2);
		System.out.println(s);

		// Beispiel 2
		System.out.println(Begruessung.begruesse(new Kind("Victor")));
		System.out.println(Begruessung.begruesse(new Mann("Mihola")));
		System.out.println(Begruessung.begruesse(new Frau("Kwiatkowski")));
	}
}

