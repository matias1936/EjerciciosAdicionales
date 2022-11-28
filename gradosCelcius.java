package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String args []) {
		
		Scanner grados = new Scanner(System.in);
		double gradosc, gradosf;
		System.out.println("Introduce los grados celcios");
		gradosc = grados.nextDouble();
		gradosf = (gradosc * 9/5) + 32;
		System.out.println ( gradosc +"Los grados Celcios equivalen a:  " + gradosf + "grados Fahrenheit.");
		
		
		 
		    }
		

	}


