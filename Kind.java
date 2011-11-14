public class Kind implements Person {
	private String name;

	public Kind(String name) {
		this.name = name;
	}
	
	public String gruss() {
		return "Hallo";
	}

	public String anrede() {
		return this.name;
	}
}
