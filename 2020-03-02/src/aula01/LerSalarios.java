package aula01;

import java.util.Scanner;

public class LerSalarios {

	private static Scanner entradaConsole;

	public static void main(String[] args) {

		Double minSalario = Double.MAX_VALUE, 
			   maxSalario = Double.MIN_VALUE, 
			   atuSalario = 0.0;

		for (int i=0 ; i<10 ; i++) {
			System.out.print("Digite o " + (i+1) + "o. salario: ");
			entradaConsole = new Scanner(System.in);
			atuSalario = Double.valueOf(entradaConsole.next());

			
			if (atuSalario > maxSalario) {
				maxSalario = atuSalario;
			} else {
				if (atuSalario < minSalario) {
					minSalario = atuSalario;
				}
			}
		}
		
		System.out.printf("O menor salario é: %.2f\n", minSalario );
		System.out.printf("O maior salario é: %.2f\n", maxSalario );
	}

}
