

import java.util.Scanner;

public class hipotenusa {

	public static void main(String args []) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cateto 1");
		float cateto1=sc.nextFloat();
		System.out.println ("Introduzca cateto 2");
		float cateto2=sc.nextFloat();
		double
		hipotenusa=Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
		System.out.println("La hipotenusa tiene un valor de "+hipotenusa);
		
		
		
		 
		    }
		

	}

