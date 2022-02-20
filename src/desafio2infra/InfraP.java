package desafio2infra;

public class InfraP {
	
	private String password;
	private boolean valid = true;
	
	public InfraP(String password) {
		super();
		String pass = clean(password);
		verify1(pass);
		isSpecial(pass);
		isNumeric(pass);
		verify4(pass);
		show(pass);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValid() {
		return valid;
	}

	private void setValid(boolean valid) {
		this.valid = valid;
	}
	
	private void verify1(String pass) {
		if(!(pass.length() >= 6)) {
			setValid(false);
			System.out.println("A senha deve conter no mínimo 6 caracteres!");
		}
	}
	
	@SuppressWarnings("deprecation")
	private void isNumeric(String pass) {
		String ver = pass;
		boolean x = false;
		byte[] temp = new byte[ver.length()];
		ver.getBytes(0, ver.length(), temp, 0);
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] >= 48 && temp[i] <= 57 ) {
				x = true;
				break;
			}
		}
		if(!x) {
			setValid(x);
			System.out.println("A senha deve conter ao menos um dígito"
					+ " entre 0 e 9! ");
			}
		}
	
	
	private void show(String pass) {
		System.out.println("Senha informada   ==> " + pass);
		System.out.println("Qty de caracteres ==> " + pass.length());
		
	}
	
	private String clean(String pass) {
		int cont = 0;
		String ver = pass;
		char[] temp = new char[ver.length()];
		ver.getChars(0, ver.length(), temp, 0);
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] != ' ') {
				cont ++;
			}
		}
		char[] temp1 = new char[cont];
		for (int i = 0, j = 0; i < temp.length; i++) {
			if(temp[i] != ' ') {
				char x = temp[i];
				temp1[j] = x;
				j ++;
			}
		}
		String senha = new String(temp1);
		setPassword(senha);
		return this.password;
	}
	
	@SuppressWarnings("deprecation")
	private boolean isLower(String pass) {
		String ver = pass;
		boolean x = false;
		byte[] temp = new byte[ver.length()];
		ver.getBytes(0, ver.length(), temp, 0);
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] >= 97 && temp[i] <= 122 ) {
				x = true;
				break;
			}
		}
		return x;
	}
	
	private void verify4(String pass) {
		boolean upper = isUpper(pass);
		boolean lower = isLower(pass);
		if(!upper) {
			setValid(upper);
			System.out.println("A senha precisa ter ao menos"
					+ " uma letra em maiúsculo!");
		}
		if(!lower) {
			setValid(lower);
			System.out.println("A senha precisa ter ao menos"
					+ " uma letra em minúsculo!");
		}
	}
	
	@SuppressWarnings("deprecation")
	private boolean isUpper(String pass) {
		String ver = pass;
		boolean x = false;
		byte[] temp = new byte[ver.length()];
		ver.getBytes(0, ver.length(), temp, 0);
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] >= 65 && temp[i] <= 90 ) {
				x = true;
				break;
			}
		}
		return x;
	}
	
	@SuppressWarnings("deprecation")
	private void isSpecial(String pass) {
		boolean x = false;
		String ver = pass;
		byte[] temp = new byte[ver.length()];
		ver.getBytes(0, ver.length(), temp, 0);
		for (int i = 0; i < temp.length; i++) {
			if((temp[i] >= 35 && temp[i] <= 38) ||
			   (temp[i] >= 40 && temp[i] <= 43) ||
			   (temp[i] == 33) || (temp[i] == 45) ||
			   (temp[i] == 64) || (temp[i] == 94)) {
				x = true;
				break;
			}
		}
		if(!x) {
			setValid(x);
			System.out.print("A senha deve conter ao menos um dos"
					+ " seguintes caracteres ==> ");
			System.out.println("! * & + - $ ( ) # @ % ^");	
		}
	}
}
