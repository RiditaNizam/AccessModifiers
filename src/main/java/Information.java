class Information {
	private String info; // Shouldn't be null

	public Information(String i) {
		if (i != null) {
			info = i;
		} else {
			info = "";
		}
	}

	public String getInfo() { // Fine because we can't modify the private String info.
		return info;
	}

	public void setInfo(String string) {
		if (string == null) {
			return; // Don't do anything.
		} else {
			info = string;
		}

	}
}