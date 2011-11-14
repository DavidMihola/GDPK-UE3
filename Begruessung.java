public class Begruessung {

	public static String begruesse(Person person) {
		String gruss = person.gruss();
		String anrede = person.anrede();

		return gruss + " " + anrede;
	}
}

