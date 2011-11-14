public class Frau implements Person {
	private String name;

	public Frau(String name) {
		this.name = name;
	}

	public String gruss() {
		return "Sehr geehrte";
	}

	public String anrede() {
		return "Frau " + this.name;
	}
}
