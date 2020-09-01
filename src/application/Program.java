package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shape = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #"+i+" data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.nextLine();
			sc.nextLine();
			
			if (type == 'r') {
				
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				shape.add(new Rectangle(Color.valueOf(color), width, height));
				
			} else {
				
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				shape.add(new Circle(Color.valueOf(color), radius));
			}
		
			System.out.println();
			System.out.println("SHAPE AREAS:");
			for (Shape obj: shape) {
				System.out.println(obj);
			}

		}
		
	sc.close();

	}

}
