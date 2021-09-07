package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Oppgi din bruttoinntekt: ");
		int bruttoInntekt = scanner.nextInt();
		
		int trinn1 = 184800;	// 1.7% 
		int trinn2 = 260100;	// 4.0% 
		int trinn3 = 651250;	// 13.2% 
		int trinn4 = 1021550;	// 16.2% 
		
		double trinnSkatt;
		
		if (bruttoInntekt >= 0 && bruttoInntekt <= 184800) {
			System.out.println("Bruttoinntekt kr " + bruttoInntekt + " har ingen trinnskatt.");
		} else if (bruttoInntekt > 184800 && bruttoInntekt <= 260100) {
			trinnSkatt = (bruttoInntekt - trinn1) * 0.017;
			System.out.println("Trinnskatt for bruttoinntekt kr " + bruttoInntekt + " er kr " + trinnSkatt);
		} else if (bruttoInntekt > 260100 && bruttoInntekt <= 651250) {
			trinnSkatt = ((bruttoInntekt - trinn2) * 0.04) 
					+ ((trinn2 - trinn1) * 0.017);
			System.out.println("Trinnskatt for bruttoinntekt kr " + bruttoInntekt + " er kr " + trinnSkatt);
		} else if (bruttoInntekt > 651250 && bruttoInntekt <= 1021550) {
			trinnSkatt = ((bruttoInntekt - trinn3) * 0.132) 
					+ ((bruttoInntekt - trinn2) * 0.04) 
					+ ((trinn2 - trinn1) * 0.017);
			System.out.println("Trinnskatt for bruttoinntekt kr " + bruttoInntekt + " er kr " + trinnSkatt);
		} else if (bruttoInntekt > 1021550) {
			trinnSkatt = ((bruttoInntekt - trinn4) * 0.162) 
					+ ((bruttoInntekt - trinn3) * 0.132) 
					+ ((bruttoInntekt - trinn2) * 0.04) 
					+ ((trinn2 - trinn1) * 0.017);
			System.out.println("Trinnskatt for bruttoinntekt kr " + bruttoInntekt + " er kr " + trinnSkatt);
		}
		
		scanner.close();
		
	}

}
