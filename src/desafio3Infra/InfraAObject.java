package desafio3Infra;

import java.util.Objects;

public class InfraAObject {
	
	private String word;
	private Integer sum;
	
	public InfraAObject(String word) {
		super();
		this.word = word;
		sumAsc(getWord());
		
	}
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public Integer getSum() {
		return sum;
	}
	
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
	@SuppressWarnings("deprecation")
	private void sumAsc(String word) {
		int x = 0;
		String ver = word.toUpperCase();
		byte[] temp = new byte[ver.length()];
		ver.getBytes(0, ver.length(), temp, 0);
		for (int i = 0; i < temp.length; i++) {
			x += temp[i];
			}
		setSum(x);
		}
	
	@Override
	public int hashCode() {
		return Objects.hash(sum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfraAObject other = (InfraAObject) obj;
		return Objects.equals(sum, other.sum);
	}

}
