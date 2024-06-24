package application;

import java.util.Locale;
import java.util.Scanner;

import entities.VectorNumber;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many values in this vector? ");
		int n = sc.nextInt();
				
		VectorNumber [] a = new VectorNumber [n];
		VectorNumber [] b = new VectorNumber [n];
		VectorNumber [] c = new VectorNumber [n];
		
		System.out.println("Enter values to A vector: ");
		for (int i = 0; i < a.length; i++) {
			double value = sc.nextDouble();
			a[i] = new VectorNumber(value);			
		}
		
		System.out.println("Enter values to B vector: ");
		for (int i = 0; i < b.length; i++) {
			double value = sc.nextDouble();
			b[i] = new VectorNumber(value);			
		}

		
		for (int i = 0; i < c.length; i++) {
			c[i] = new VectorNumber(a[i].getValue()+ b[i].getValue());		
			System.out.println(c[i].getValue());
		}
		
		
		sc.close();
	}

}
