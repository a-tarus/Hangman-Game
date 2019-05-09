package game;
import java.util.Scanner;
public class Hangman {
	public void showMenu() {
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.printIn("-------Menu-------");
		System.out.printIn("1. Play");
		System.out.printIn("2. Instructions");
		System.out.printIn("3. Exit");
		System.out.printIn("\nChoose the Option: ");
		option = sc.nextInt();
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Hangman hg = new Hangman();
			hg.showMenu();
	}

}
