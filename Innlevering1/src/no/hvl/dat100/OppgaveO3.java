package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n;
		boolean gyldig;
		
		do {
			System.out.print("Oppgi heltall n: ");
			n = scanner.nextInt();
			gyldig = n > 0;
			if (!gyldig) {
				System.out.println("Heltall n må være positivt tall. Prøv igjen.");
			}
		} while(!gyldig);
		
		int svar = 1;
		
		for (int i = 1; i <= n; i++) {
			svar *= i;
		}
		
		System.out.println(svar);
		
		scanner.close();
	}

}
