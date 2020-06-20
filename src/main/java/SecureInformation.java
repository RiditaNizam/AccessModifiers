class SecureInformation {
	private String secureInfo;
	private String password;

	public SecureInformation(String givenSecureInfo, String givenPassword) {
		if (givenSecureInfo != null) {
			secureInfo = givenSecureInfo;
		} else {
			secureInfo = "";
		}
		if (givenPassword != null) {
			password = givenPassword;
		} else {
			password = "";
		}
	}

	public String getInfo(String givenPassword) {
		if (password.equals(givenPassword)) { // Now can't get secure info without the password
			return secureInfo;
		} else {
			return null;
		}
	}

	public void setInfo(String givenSecureInfo, String givenPassword) {
		if (password.equals(givenPassword)) {
			if (givenSecureInfo != null) {
				secureInfo = givenSecureInfo;
			}
		}
	}
}