import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Let's locate some primes!");
		System.out.println("This application will find you any prime, in order, from the first number on.");
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Which prime number do you want to see?");
			int userPrime = input.nextInt();
			System.out.println("The " + userPrime + "th prime number is " + findPrime(userPrime) + ".");
			System.out.println("Would you like to find another prime number? (y/n)");
			String userContinue = input.next();
			if (userContinue.contains("y")) {
				continue;
			}
			else {
				System.out.println("Goodbye.");
				break;
			}
		}
	}
	public static int findPrime(int userInput) {
		int primeNumber = 0;
		if (userInput > 0) {
			int i = 0;
			int count = 0;
			while (count < userInput) {
				primeNumber = primeNumber + 1;
				for (i = 2; i <= primeNumber; i++) {
					if (primeNumber % i == 0) {
						break;
					}
				}
				if (i == primeNumber) {
					count = count + 1;
				}
			}
		}
		return primeNumber;
	}
	}