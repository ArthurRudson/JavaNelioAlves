import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		 */
		
		/*
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		int valor = 0;
		for (int i = 1; i <= n; i++) {
			valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		*/
		
		/*
		int n = sc.nextInt();
		double media = 0;
		for (int i = 1; i <= n; i++) {
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
			System.out.printf("%.1f%n", media);
		}
		*/
		
		/*
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			double div = (double) a / b;
			if (b != 0) {	
				System.out.println(div);
			} else {
				System.out.println("divisao imposivel");
			} 
		}
		*/
		
		/*
		int n = sc.nextInt();
		int fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
		*/
		
		/*
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		*/
		
		int n = sc.nextInt();
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				int quadrado = i * i;
				int cubo = i * i * i;
				
				System.out.println(i + " " + quadrado + " " + cubo);
			}
		} else {
			System.out.println("digite um numero positivo.");
		}
		
		
		
		sc.close();
	}

}
