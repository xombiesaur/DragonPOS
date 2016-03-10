//execution class for loging in and starting transaction
import java.util.Scanner;
import java.util.ArrayList;

public class welcome{
    public static void main(String args[]){
    	ArrayList<String> cashierIDs = new ArrayList<String>();
    	cashierIDs.add("1a");
    	cashierIDs.add("2b");
    	cashierIDs.add("3c");
    	cashierIDs.add("4d");
	String correctPass = "dragonPassword";
		System.out.printf("Welcome to DragonPOS. Please enter system password: ");
		Scanner scanner = new Scanner(System.in);
		String systemPass = scanner.next();
		System.out.println(systemPass);
		if(!systemPass.equals(correctPass)){
		    System.out.println("Incorrect system password. Goodbye!");
		    System.exit(1);
		}
		String cashierID = "-1";
		while(!cashierIDs.contains(cashierID)){
			System.out.printf("Please enter CashierID: ");
			cashierID = scanner.next();
			if(!cashierIDs.contains(cashierID)){
				System.out.println("That is not an acceptable CashierID.");
			}
		}
		System.out.println("Welcome. Would you like to start a new transaction? (yes or no): ");
		String newTransaction = scanner.next();
		while(newTransaction.equals("yes")){
			Transaction curTransaction = new Transaction();


			System.out.println("Would you like to start a new transaction? (yes or no): ");
			newTransaction = scanner.next();
		}
		System.out.println("Goodbye!");
	}
}
	