import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * int y = 32; double x = 10.35784; System.out.println(y);
		 * System.out.println(x); System.out.printf("%.2f%n", x);
		 * System.out.printf("%.4f%n", x); System.out.println("Olá, mundo!");
		 * Locale.setDefault(Locale.US); System.out.printf("%.2f%n", x);
		 * System.out.printf("%.4f%n", x);
		 * System.out.printf("Resultado = %.2f metros%n", x);
		 * 
		 * 
		 * String nome = "Maria"; int idade = 31; double renda = 4000.0;
		 * System.out.printf("%s tem %d anos e ganha R$ %2f reais%n", nome, idade,
		 * renda);
		 * 
		 */

		// EXERCICIO
		/*
		 * String product1 = "Computer"; String product2 = "Office desk"; int age = 30;
		 * int code = 5290; char gender = 'F'; double price1 = 2100.0; double price2 =
		 * 650.50; double measure = 53.234567;
		 * 
		 * System.out.println("Products:");
		 * System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		 * System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		 * System.out.println();
		 * System.out.printf("Record: %d years old, code %d and gender: %c%n", age,
		 * code, gender); System.out.println();
		 * System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		 * System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		 * Locale.setDefault(Locale.US); System.out.printf("US decimal point: %.3f%n",
		 * measure);
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();

	}

}
