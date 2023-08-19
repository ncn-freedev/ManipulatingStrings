package StringManipulation;
import java.util.Scanner;

public class Main {
	
	public static void main (String [] args ) {
		Scanner input = new Scanner(System.in);
		StringManipulation word = new StringManipulation();
		System.out.println("Digite uma frase:");
		String data = input.nextLine();
		input.close();
		word.setWord(data);
		System.out.println("Sua frase é: " + word.getWord());
		System.out.println("Sua frase tem "+ word.wordLenght()+" caracteres");
		System.out.println("Sua frase ao contrário é: " + word.doReverseWord());
		
		
	}

}
