package aula01;

public class TrabalhandoComArrays {

	public static void main(String[] args) {
		TrabalhandoComArrays tca = new TrabalhandoComArrays();
		tca.executar();
	}

	private void executar() {
		Double[] listaDeNotas = new Double[10];
		listaDeNotas[0] = 2.5;
        /*
		int i = 1;
		while(i < 10) {
			listaDeNotas[i] = listaDeNotas[i-1] * 2.5;
			System.out.println(listaDeNotas[i]);
			i++;
		}
		
		i = 0;
		double media = 0;
		while (i < listaDeNotas.length) {
			media += listaDeNotas[i];
			i++;
		}
		System.out.printf("A media dos valores é: %.2f " , media / listaDeNotas.length);  
        */
		//continue: vai para condicao do while
		//break: interrompe o while		
		//JAVA : Labels
		/*
		outer: while (i < listaDeNotas.length) {
			int j = 0;
			
			while (j < 10) {
				if (j==2) {
					break outer;
				}
			}
		}
		*/
		
		for (int j=1 ; j<10 ; j++) {
			listaDeNotas[j] = listaDeNotas[j-1] * 2.5;			
			System.out.println(listaDeNotas[j]);
		}

		double media = 0;
		for (int j=1 ; j < listaDeNotas.length; j++) {
			media += listaDeNotas[j];
		}
		System.out.printf("A media dos valores é: %.2f " , media / listaDeNotas.length);  

	}
	
    //TEMA: Escreva um programa que leia do usuario 10 salarios e calcule qual é o maior, menor e imprima na tela
}
