import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		 //Part 1
		System.out.print("Please enter your first name: ");
		String firstName = input.nextLine();
		
		if(firstName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}
		
		System.out.print("Please enter your last name: ");
		String lastName = input.nextLine();
		
		if(lastName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}
		
		System.out.print("Please enter your age: ");
		String age = input.nextLine();
		
		if(age.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}
		int yourAge = Integer.parseInt(age);
		
		while (yourAge <= 0) {
			System.out.print("Please enter your age: ");
			yourAge = Integer.parseInt(input.nextLine());
		}
		
		System.out.print("Please enter your birth month (1 - 12): ");
		String birthMonth = input.nextLine();
		
		if(birthMonth.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}
		
		String favColor = "";
		do { 
			System.out.print("Please enter your favorite ROYGBIV color. If you don't know ROYGBIV, enter Help: ");
			favColor = input.nextLine();
			favColor = favColor.toLowerCase();
			
			if (favColor.equals("help")) {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
			}
		} while (favColor.equals("help"));
		
		
		System.out.print("Please enter your number of siblings: "); 
		String siblings = input.nextLine();
		
		if(siblings.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}
		
		int numOfSiblings = Integer.parseInt(siblings);
		
		//Part 2
		
		//retirement years based on odd or even age
		int yearsToRetire = 0;
		
		if(yourAge % 2 == 0) {
			yearsToRetire = (65 - yourAge) + 2; 
		} else		
			yearsToRetire = (65 - yourAge);
		
		//vacation home location based on # of siblings
		String vacayLocation = "";
		
		if (numOfSiblings <= 0) {
			vacayLocation = "Vostok, Antartica";
		} else {
			switch(numOfSiblings) {
			case 0:
				vacayLocation = "Hana, Maui";
				break;
			case 1:
				vacayLocation = "Athens, Greece";
				break;
			case 2:
				vacayLocation = "Marrakesh, Morrocco";
				break;
			case 3:
				vacayLocation = "New Orleans, LA";
				break;
			default: 
				vacayLocation = "Atlanta, GA";
			}
		}
		
		//transportation based on favorite color
		String transportation = "feet";
		
		switch(favColor) {
		case "red":
		case "r":
			transportation = "G Wagon";
			break;
		case "orange":
		case "o":
			transportation = "hover board";
			break;
		case "yellow":
		case "y":
			transportation = "school bus";
			break;
		case "green": 
		case "g":
			transportation = "dirt bike";
			break;
		case "blue":
		case "b":
			transportation = "private jet";
			break;
		case "indigo":
		case "i":
			transportation = "magic carpet";
			break;
		case "violet":
		case "v":
			transportation = "Ducati";
		}
		
		//bank balance based on birth month
		String bankBalance = "";
		
		switch (birthMonth) {
		case "1":
		case "2":
		case "3":
		case "4":
			bankBalance = "$900,000.00";
			break;
		case "5":
		case "6":
		case "7":
		case "8":
			bankBalance = "$56,000.49";
			break;
		case "9":
		case "10":
		case "11":
		case "12":
			bankBalance = "$7,952,100,000.99";
			break;
		default:
			bankBalance = "$1.11";
		}
	
		//Part 3
		
		//display user's fortune
		System.out.println("\n" + firstName + " " + lastName + " will retire in " + yearsToRetire +
				" year(s) with " + bankBalance + " in the bank, \na vacation home in " +
				vacayLocation + ", and travel by " + transportation + "!");

	}

}
