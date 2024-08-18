import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		Exercicio 1
		int senha = 2002;
		int tentativa = 0;
		while (senha != tentativa) {
			tentativa = sc.nextInt();
			if (tentativa != senha) {
				System.out.println("Senha Invalida");
			} else {
				System.out.println("Acesso Permitido");
			}
		}
		*/
		
		/*
		Exercicio 2
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (x != 0 && y != 0) {
			if (x > 0 & y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
					System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
					System.out.println("Terceiro");
			} else if (x > 0 && y < 0) {
					System.out.println("Quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		*/
		
		
		int gas = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		while (gas != 4) {
			if (gas == 1) {
				alcool++;
			} else if (gas == 2) {
				gasolina++;
			} else if (gas == 3){
				disel++;
			}
			gas = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina:" + gasolina);
		System.out.println("Disel: " + disel);
		
		
		sc.close();

	}

}
