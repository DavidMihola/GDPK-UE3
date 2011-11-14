public class Mann implements Person {
	private String name;

	public Mann(String name) {
		this.name = name;
	}

	public String gruss() {
		return "Sehr geehrter";
	}

	public String anrede() {
		return "Herr " + this.name;
	}
}
