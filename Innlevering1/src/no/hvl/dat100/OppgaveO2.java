package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			
			boolean gyldig;
			int poengsum;
			
			do {
				System.out.print("Poengsum for prøve: ");
				poengsum = scanner.nextInt();
				
				gyldig = poengsum >= 0 && poengsum <= 100;
				
				if (!gyldig) {
					System.out.println("Ugyldig poengsum. Prøv igjen.");
				}
			} while(!gyldig);

			if (poengsum >= 0 && poengsum < 40) {
				System.out.println("Karakter: F");
			} else if (poengsum >= 40 && poengsum < 50) {
				System.out.println("Karakter: E");
			} else if (poengsum >= 50 && poengsum < 60) {
				System.out.println("Karakter: D");
			} else if (poengsum >= 60 && poengsum < 80) {
				System.out.println("Karakter: C");
			} else if (poengsum >= 80 && poengsum < 90) {
				System.out.println("Karakter: B");
			} else if (poengsum >= 90 && poengsum <= 100) {
				System.out.println("Karakter: A");
			} 
			
			// un-comment påfølgende linje for å sjekke at den leser inn 10 gyldige poengsummer
			// System.out.println(i + 1);
			
		}

		scanner.close();

	}

}
