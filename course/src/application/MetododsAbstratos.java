package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.CircleAbstrato;
import entities.RectangleAbstrato;
import entities.ShapeAbstrato;
import entities.enums.Color;

public class MetododsAbstratos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<ShapeAbstrato> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" +i+ " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new RectangleAbstrato(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new CircleAbstrato(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (ShapeAbstrato shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}

}
