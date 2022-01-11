import java.util.Scanner;
import java.util.Random;
public class ICS3U1_FP {
	
	public static void movie_show(String [] movie_show, Scanner input) {
	
		// displaying all of the movie/shows that the users can pick from
		
		movie_show[0] = "Avengers Endgame";
		movie_show[1] = "Loki";
		movie_show[2] = "Spiderman No Way Home";
	
			
			// loop through the movie_show array and display all of the movies

			System.out.println("Here are the available options for today");
			for(int i = 0; i < movie_show.length; i++) {
				System.out.println(movie_show[i] + " ");
			}
			
		}
	
	public static void chooseMovie_Show(String [] movie_show, Scanner input) {
		
		// loop through the array and ask for user input
		
		for(int i = 0; i < movie_show.length; i++) {
			System.out.println("Which show would you like to pick first?");
			movie_show[i] = input.next();
		}
	}
		
		
	public static void ifMovie_show_Valid(String [] movie_show, Scanner input) {
		
		movie_show(movie_show, input);
		chooseMovie_Show(movie_show, input);

		
		// loop through the available movies and tv shows 
		
		for(int i = 0; i < movie_show.length; i++) {
			if(movie_show[i].equalsIgnoreCase(movie_show[0])) { // if the user picks avengers endgame
				endgame(); // direct them to this method (answer questions there)
			}
			if(movie_show[i].equalsIgnoreCase(movie_show[1])) {
				loki(); // direct them to this method (answer questions there)
			}
			if(movie_show[i].equalsIgnoreCase(movie_show[2])) {
				spiderman(); // direct them to this method (answer questions there)
			}
			else {
				System.out.println("Erorr");
			}
		}
		
	}
	public static void endgame() {
			
		
	}
			
	public static void loki() { 
	
	
	}
	
	public static void spiderman() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); // to allow the program to read variables and take user inptu
		
		String [] movie_show = new String [3]; // there will be three options available
		
		
		// welcoming the user(s) and explaining the rules of jeopardy
		
		String welcomeline = "Welcome to Jeopardy! Today we will be having two very special guests over\n"
				+ "They will both be quizzed on Marvel's best movies and TV shows. "
				+ "Here are the rules: "
				+ "1. Each player must pick an available category. If the category is not available\n"
				+ "then the game will not progress"
				+ "2. The program will pick a random player at the beginning to answer"
				+ "3. Your score will only be able to increase by 100 each time you\n "
				+ "answer a question currently. "
				+ "4. If you get a question wrong, you will lose 100 points unless you are at 0 and have not\n"
				+ "answered any questions currently"
				+ "5. Remember to have fun!";
		
		System.out.println(welcomeline);
		
		System.out.println(); // to create spacing between the method and the rules to avoid conjested code
		
		ifMovie_show_Valid(movie_show, input);		
	
	}

}
