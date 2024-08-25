import java.util.Scanner;

public class ExercicioArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		------------------------------------------------------------------------------
		System.out.print("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n]; 
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		} 
		System.out.println("Numeros negativos: ");
		for (int i=0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		--------------------------------------------------------------------------------
		*/
		/*
		---------------------------------------------------------------------------------------
		System.out.print("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n]; 
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		} 
		
		double soma = 0;
		double media = 0;
		
		System.out.print("VALORES: ");
		for (int i=0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
			soma += vect[i];
			media = soma / vect.length;
		}
		System.out.println();
		System.out.println("SOMA: " + soma);
		System.out.println("MEDIA: " + media);
		---------------------------------------------------------------------------------------
		*/
		
		/*
		-------------------------------------------------------------------------------------
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
	    int[] idades = new int[n];
	    double[] alturas = new double[n];
		
	    for(int i=0; i<n; i++) {
	    	System.out.println("Dados da Pessoa " + (i + 1));
	    	System.out.print("Nome: ");
	    	nomes[i] = sc.next();
	    	System.out.print("Idade: ");
	    	idades[i] = sc.nextInt();
	    	System.out.print("Altura: ");
	    	alturas[i] = sc.nextDouble();
	    }
	    
	    double alturaTotal = 0;
	    double mediaAnos = 0;
	    
	    for(int i=0; i<n; i++) {
	    	alturaTotal += alturas[i];
	    	if(idades[i] < 16) {
	    		mediaAnos++;
	    	}
	    	
	    }
	    System.out.printf("Altura média: %.2f\n" , alturaTotal / alturas.length );
	    System.out.println("Pessoas com menos de 16 anos: " + ((mediaAnos / n) * 100)+ "%");
	    
	    for(int i=0; i<n; i++) {
	    	if(idades[i] < 16) {
	    		System.out.println(nomes[i]);
	    	}
	    }
	    ---------------------------------------------------------------------------------------------------------
	    */
		
		/*
		-------------------------------------------------------------------
		System.out.print("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n]; 
		int pares = 0;
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		} 
		
		System.out.println("NUMEROS PARES: ");
		for(int i=0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				pares++;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + pares);
		--------------------------------------------------------------------
		 */

		/*
		----------------------------------------------------------
		System.out.print("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n]; 
		double maior = 0;
		int posicao = 0;
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		} 
		for(int i=0; i < vect.length; i++) {
			if(vect[i] > maior) {
				maior = vect[i];
				posicao = i;
			}
		}
		System.out.println("Maior valor: " + maior);
		System.out.println("posicao do maior valor: " + posicao);
		-----------------------------------------------------------
		*/
		
		/*
		---------------------------------------------------------
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
	    int[] b = new int[n];
		
	    System.out.println("Digite os valores do vetor A:");
	    for(int i=0; i<n; i++) {
	    	a[i] = sc.nextInt();
	    }
	    System.out.println("Digite os valores do vetor B:");
	    for(int i=0; i<n; i++) {
	    	b[i] = sc.nextInt();
	    }
	    System.out.println("Vetor resultante:");
	    for(int i=0; i<n; i++) {
	    	System.out.println(a[i] + b[i]);
	    }
	    ---------------------------------------------------------
	    */
		
		/*
		----------------------------------------------------
		System.out.print("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double total = 0;
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			total += vect[i];
		}
		double media = total / vect.length;
		System.out.println("Media do vetor = " + media);
		
		System.out.println("Elementos abaixo da media: ");
		for(int i=0; i < vect.length; i++) {
			if(vect[i] <= 10) {
				System.out.println(vect[i]);
			}
		}
		---------------------------------------------------
		*/
		
		/*
		----------------------------------------------------------------
		System.out.print("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n]; 
		double media = 0;
		int pares = 0;
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				pares += vect[i];
				media ++;
			}
		}
		
		if (pares > 1) {
			System.out.println("Media dos pares = " + (pares / media));
		} else {
			System.out.println("Nenhum numero par");
		}
		---------------------------------------------------------------
		*/

		/*
		-------------------------------------------------------------
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
	    int[] idades = new int[n];
	    int velho = 0;
	    String nomeDoVelho = "";
		
	    for(int i=0; i<n; i++) {
	    	System.out.println("Dados da Pessoa " + (i + 1));
	    	System.out.print("Nome: ");
	    	nomes[i] = sc.next();
	    	System.out.print("Idade: ");
	    	idades[i] = sc.nextInt();
	    	if(idades[i] > velho) {
	    		velho = idades[i];
	    		nomeDoVelho = nomes[i];
	    	}
	    }
	    System.out.println("PESSOA MAIS VELHA: " + nomeDoVelho);
	    ---------------------------------------------------------------
	    */
	    
		/*
		-------------------------------------------------------------------------------
		System.out.print("Quantos alunos serao digitar? ");
		int n = sc.nextInt();
		String[] aluno = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		double media = 6;
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do aluno " + (i + 1));
			aluno[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i=0; i<n; i++) {
			if ((nota1[i] + nota2[i]) / 2 >= media) {
				System.out.println(aluno[i]);
			}
		}
		------------------------------------------------------------------------------
		*/
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n]; 
		char[] genero = new char[n];
		
		double maior = 0 , menor = 0 , media = 0;
		int numeroF = 0, numeroM = 0;
		
		for(int i=0; i<n; i++) {
			System.out.println("Altura da pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.println("Genero da pessoa: ");
			genero[i] = sc.next().charAt(0);
			menor = altura[i];
		}
		for(int i=0; i<n; i++) {
			if(altura[i] > maior) {
				maior = altura[i];
			}
			if (altura[i] < menor) {
				menor = altura[i];
			}
			if(genero[i] == 'F') {
				media += altura[i];
				numeroF++;
			} else {
				numeroM++;
			}
		}
		System.out.println("Maior altura = " + maior);
		System.out.println("Menor altura = " + menor);
		System.out.printf("Media das alturas das mulheres =  %.2f\n",  media / numeroF);
		System.out.println("Numero de homens = " + numeroM);
		
		
		sc.close();
	}

}
