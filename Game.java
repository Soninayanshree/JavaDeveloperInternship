import java.util.*;
class Game{
	int guess_number;
	int rd_number;
	
	Scanner sc = new Scanner(System.in);
	Game(){
		Random rd = new Random();
	    this.rd_number = rd.nextInt(100);
	}
	//function for checking the number;
	boolean verify(){
		System.out.print("Guess the number: ");
		int guess_number = sc.nextInt();
		
		if(guess_number == rd_number){
			System.out.println("Congratulation you guess a right number...");
			return true;
		}
		else if(guess_number < rd_number){
			System.out.println("You are number is less than guess number...");
		}
		else if(guess_number > rd_number){
			System.out.println("You are number is greater than guess number...");
		}
		else{
			System.out.println("No guessing...");
		}
		return false;
		}
}	
	
class Task1{
	public static void main(String arg[]){
		Game obj = new Game();
		System.out.println("Welcome to guessing number game");
		boolean b = false;
		int total_guess = 0;
		while(!b){
			b = obj.verify();
			total_guess++;
		}
		System.out.print("Number of guess:" + total_guess);
	}

}
	
	
