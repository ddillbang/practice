package wordtest;

public class Word {
	private String english;
	private String korean;
	
	public Word(String english, String korean) {
		this.english = english;
		this.korean = korean;
	}
	
	public String getEnglish() {
		return english;
	}
	
	public String getKorean() {
		return korean;
	}
}
