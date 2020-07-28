package curso_java;

import java.util.Scanner;

public class ExerciciosJava {

	public static void main(String[] args) {
		int ivalor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor e eu direi se...");
		System.out.println("1) É positivo ou negativo. ");
		System.out.println("2) É par ou ímpar. ");
		
		ivalor = teclado.nextInt();
		
		if(ivalor < 0) {
			System.out.println("O valor digitado: " + ivalor + " é negativo!");
		} else {
			System.out.println("O valor digitado: "+ ivalor + " não é negativo!");
		}
		
		teclado.close();

	}

}
