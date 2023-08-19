package StringManipulation;

public class StringManipulation {
	
	private String word;
	int wordLenght;
	String reverseWord;
	String wordNoVocals;
	String capitalWord;
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String newWord) {
		this.word = newWord;
		this.wordLenght = this.word.length();
	}
	
	public int wordLenght() {
		
;		return this.wordLenght;
	}
	
	public String doReverseWord() {
		this.reverseWord = "";
		for (int x = this.wordLenght -1 ; x >= 0; x--) {
		this.reverseWord = this.reverseWord + this.word.charAt(x);
		}
		return this.reverseWord;
	}
	
	public void print() {
		System.out.print(this.word);
	}

}
