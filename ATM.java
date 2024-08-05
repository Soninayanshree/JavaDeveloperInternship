import java.util.*;
class ATM{
	int amount = 0;
	Scanner sc = new Scanner(System.in);
	public void withdraw(){
		System.out.println("Enter the amount: ");
		int withdraw_amt = sc.nextInt();
		if(amount <= withdraw_amt){
			System.out.println("Insufficient Amount!!");
		}
		else{
			System.out.println("Total amount : " + amount);
			amount -= withdraw_amt;
			System.out.println("Deduct amount : " + withdraw_amt);
			System.out.println("Your current balance: "  + amount);
		}
	}
	public void deposit(){
		System.out.println("Enter the deposit amount: ");
		int deposit = sc.nextInt();
		amount += deposit;
		System.out.println("Your current account balance is: " + amount);
	}
	public void checkBalance(){
		System.out.println("Your account balance is "+amount);
	}
	public void exit(){
		System.exit(0);
	}
	
}
class User_account{
	public static void main(String args[]){
		int account_num = 12345;
	    int account_pin = 123;
		Scanner sc = new Scanner(System.in);
		ATM  obj = new ATM();
		System.out.println("Enter the account number: ");
		int user_num = sc.nextInt();
		System.out.println("Enter the pin: ");
	    int user_pin = sc.nextInt();
		if( account_num == user_num && account_pin == user_pin){
			while(true){
				System.out.println("Enter your choice(1-4):");
				System.out.println("1.withdraw");
				System.out.println("2.deposit");
				System.out.println("3.checkBalance");
				System.out.println("4.exit");
				int choice = sc.nextInt();
				switch(choice){
					case 1:
					obj.withdraw();
					break;
					case 2:
					obj.deposit();
					break;
					case 3:
					obj.checkBalance();
					break;
					case 4:
					obj.exit();
					break;
					default :
					System.out.println("Please enter valid key!!");
				}
			}
		}
		else{
			System.out.print("Invalid account number and pin!!");
		}
	}
	
}