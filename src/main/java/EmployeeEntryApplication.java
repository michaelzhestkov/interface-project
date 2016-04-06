import java.util.*;

import com.sqa.mz.util.helpers.*;

public class EmployeeEntryApplication {

	static String[] names, addresses, ages, cities, phoneNumbers, jobTitles;
	static int numOfEmployees;
	static Scanner scanner = new Scanner(System.in);
	static String userName;

	public static void main(String[] args) {
		welcomeUser();
		requestUserCount();
		for (int i = 0; i < numOfEmployees; i++) {
			addEmployeeInfo(i);
		}
		displayEmployees();
		farwellUser();

	}

	private static void addEmployeeInfo(int i) {
		System.out.println("Can I get Employee " + (i + 1) + "'s name:");
		names[i] = scanner.nextLine();
		System.out.println("Can I get " + names[i] + "'s address:");
		addresses[i] = scanner.nextLine();
		System.out.println("What about their age:");
		ages[i] = scanner.nextLine();
		System.out.println("What city does " + names[i] + " live in:");
		cities[i] = scanner.nextLine();
		System.out.println("What do they do for a living:");
		jobTitles[i] = scanner.nextLine();

	}

	private static void displayEmployees() {
		for (int i = 0; i < names.length; i++) {
			System.out.println("-----------------------");
			System.out.println("Employee " + (i + 1) + "'s Name: " + names[i]);
			System.out.println("Age: " + ages[i]);
			System.out.println("Address: " + addresses[i]);
			System.out.println("City: " + cities[i]);
			System.out.println("Job Title: " + jobTitles[i]);
			System.out.println("-----------------------");
		}

	}

	private static void farwellUser() {
		System.out.println("Thank you for using my application!");
		scanner.close();
		System.exit(0);

	}

	private static void requestUserCount() {
		numOfEmployees = RequestInput.getInt("How many employees would you like to enter into the System?", 1, 2, 3, 4,
				5, 6, 7, 8, 9);
		names = new String[numOfEmployees];
		ages = new String[numOfEmployees];
		cities = new String[numOfEmployees];
		jobTitles = new String[numOfEmployees];
		addresses = new String[numOfEmployees];
	}

	private static void welcomeUser() {
		userName = RequestInput.getWelcomeTheUser();
		// System.out.print("Welcome to our Application! ");
		// System.out.println("Could I get your name?");
		// userName = scanner.nextLine();

	}
}
