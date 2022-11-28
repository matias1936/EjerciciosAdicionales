package ejercicio1;

import java.util.Scanner;

public class KmAMts {

	public static void main(String args []) {
		
		@SuppressWarnings("resource")
		Scanner velocidad = new Scanner(System.in);
		double km, Mts;
		System.out.println("Introduzca una velocidad en km/h");
		km = velocidad.nextDouble();
		Mts = (km*5/18) ;
		System.out.println ( km +"Los kilómetros introducidos equivalen a:  " + Mts + "M/s.");
		
		
		 
		    }
		

	}


