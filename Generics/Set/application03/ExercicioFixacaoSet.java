package application03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioFixacaoSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a =  new HashSet<>();
		Set<Integer> b =  new HashSet<>();
		Set<Integer> c =  new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			a.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			b.add(sc.nextInt());
		}
		
		System.out.print("How many students for course A? ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			c.add(sc.nextInt());
		}
		
		Set<Integer> total = new HashSet<>();
		total.addAll(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " +  total.size());
		
		sc.close();
	}

}
