package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle2;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle2 x, y;
		x = new Triangle2();
		y = new Triangle2();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		if (areaX > areaY) {
		     System.out.println("Larger area: X");
		}
		else {
		     System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
