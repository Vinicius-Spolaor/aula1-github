package curso_java;

import java.util.Scanner;

public class ExerciciosJava {

	public static void main(String[] args) {
		int ivalor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor e eu direi se...");
		System.out.println("1) � positivo ou negativo. ");
		System.out.println("2) � par ou �mpar. ");
		
		ivalor = teclado.nextInt();
		
		if(ivalor < 0) {
			System.out.println("O valor digitado: " + ivalor + " � negativo!");
		} else {
			System.out.println("O valor digitado: "+ ivalor + " n�o � negativo!");
		}
		
		teclado.close();

	}

}
