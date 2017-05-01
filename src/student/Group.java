package student;

public enum Group {
	G1("101"), G2("111"), G3("102"), G4("103");

	private final String title;

	Group(String name) {
		title = name;
	}

	@Override
	public String toString() {
		return title;
	}
}
