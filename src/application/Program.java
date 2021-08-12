package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Client;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String name = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n): ");
		String initialDeposit = sc.nextLine();

		double balance = 0.0;

		if (initialDeposit.equals("y") || initialDeposit.equals("Y")) {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
		}

		Client client = new Client(account, balance, name);

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(client.toString());
		System.out.println();

		System.out.print("Enter a deposit value: ");
		balance = sc.nextDouble();
		client.addBalance(balance);
		System.out.println("Updated account data:");
		System.out.println(client.toString());
		System.out.println();

		System.out.print("Enter a withdrwa value: ");
		balance = sc.nextDouble();
		client.removalBalance(balance);
		System.out.println("Updated account data:");
		System.out.println(client.toString());

		sc.close();
	}

}
