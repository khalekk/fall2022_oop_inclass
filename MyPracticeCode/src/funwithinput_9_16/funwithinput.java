package funwithinput_9_16;
import java.util.Scanner; 	

public class funwithinput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = sc.next(); 
		sc.nextLine(); // suck in and throw away the EOL marker that is on the input 
		System.out.print("Enter a phrase: ");
		String phrase = sc.nextLine();
		System.out.println(phrase);
		
	}
}
