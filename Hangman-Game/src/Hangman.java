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
		switch(option) {
			case 1: playGame();
				break;
			case 2: instructGame();
				break;
			case 3: exitGame();
				break;
		default: System.out.println("Incorrect menu option");
			showMenu();
			break;
		}
	}	
	
	public void playGame() {
		System.out.println("PlayGame Method is invoked");
	}
	
	public void instructGame() {
		System.out.println("InstructGame Method is invoked");
	}
	public void exitGame() {
		System.out.println("ExitGame Method is invoked");
		System.exit(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Hangman hg = new Hangman();
			hg.showMenu();
	}

}
