# GuessingGameimport java.util.Random;
import java.util.Scanner;

public class GuessTheCard {

	
	
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);  			Random random = new Random();

			int CorrectGuesses = 0;   int IncorrectChoices = 0;		boolean Correct = false;
			String guess = null;		int GuessCount = 0;

			String[] cards = {"Joker", "Ace", "Reaper", "Doug", "Cawts", "Queen"};
		
		
				//Randomizer 
				int  CardRandomInt = random.nextInt(cards.length);
				String  CardRandomString = cards[CardRandomInt].toUpperCase();
		
				
				
					System.out.print("Here are the guesses: ");	
				for(int i = 0; i < cards.length; i++) {
					System.out.print(cards[i] + ", ");
				}System.out.println();
				
				
				
				PlayerGuess();
				SearchIndex(CardRandomString);
				
		
	}
	public static String SearchIndex(String CardRandomString) {
			String Search = "";
		
		String[] cards = {"Joker", "Ace", "Reaper", "Doug", "Cawts", "Queen"};
		for(int i = 0; i < cards.length; i++) {
			if(Search == CardRandomString) {
				return cards[i];
			}
		}
		
		return Search;
	}
	public static void PlayerGuess() {
		
					int stop = 0;
		
		int CorrectGuesses = 0;
		int NumberOfGuesses = 0;
		int IncorrectChoices = 1;
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		
		
		//selections
	String[] cards = {"Joker", "Ace", "Reaper", "Doug", "Cawts", "Queen"};
	
		
			int  CardRandomInt = random.nextInt(cards.length);
			String  CardRandomString = cards[CardRandomInt].toUpperCase();
			
		System.out.print("Enter your card Guess: ");
		String guess = scanner.next().toUpperCase();
		
			do {
				while(NumberOfGuesses < 3) {
		
					if(!guess.equals(CardRandomString)) {
						System.out.println("Your guess or input is incorrect speeling or you have a wrong guess ");
						System.out.println("Try guessing again: ");
						for(int i = 0; i < NumberOfGuesses; i++) {
							IncorrectChoices++;
							stop++;
							
						}
						
						System.out.println("counts of incorrect guesses " + IncorrectChoices);
							
							guess = scanner.next().toUpperCase();
					}else {
						System.out.println("Your guess is correct! ");
								System.out.println("THANK YOU FOR PLAYING! ");
							CorrectGuesses++; 
						
					}
					NumberOfGuesses++;
				}
			}while(stop < 3);
			
			if(GuessesResults(NumberOfGuesses).equals("lose")) {
				System.out.println("You lose! the correct guess is " + CardRandomString);
			}else {
				System.out.println("You win! Number of guesses " + NumberOfGuesses);
				System.out.println("Thank you for playing !");
				
			}
		
	}
	public static String GuessesResults(int NumberOfGuesses) {
			
			if(NumberOfGuesses == 3) {
				return "lose";
			}else {
				return "win";
			}
		
		
		
	}

}
