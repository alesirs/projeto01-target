package aula01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class OlaMundo {

	/*static*/ int i;  //atributo ou propriedade de classe
	public int x; //global
	static Boolean meuBoolean;

	String minhaString = "";

	public static void main(String[] args) {

		//i = 1;
		//------------------
		int codigoPedigree = 12232;
		float pesoAnimal = 50.5f;
		double precoAnimal = 1800.50d;
		short alturaAnimal = 95;
		long comprimentoAnimal = 120;
		byte idedeAnimal = 127;
		boolean temDono = true;
		char letraInicialAnimal = 'D';
		//------------------
		//string minhaString1  = ""; //nao existe string primitiva
		String minhastring = "Target";
		String minhastring1 = "Target Trust";

		Double wrapper = 2.0; //autoboxing
		double primitivo = 2.0;
		byte   b = 1;

		wrapper = primitivo;		
		primitivo = wrapper;

		wrapper = (double) b;  //autocasting

		//System.out.println("Olá Mundo");
		//System.out.println(minhastring.substring(2));
		//System.out.println(minhastring.charAt(2));
		//System.out.println(minhastring.indexOf("t"));
		//System.out.println(minhastring.indexOf("x"));
		//System.out.println(minhastring.concat(" Trust"));
		//minhastring1 = minhastring1.substring(minhastring1.indexOf("us"));
		//System.out.println(minhastring1);
		//System.out.println(wrapper);
		//System.out.println(primitivo);

		//		System.out.println(codigoPedigree);
		//		System.out.println(pesoAnimal);
		//		System.out.println(precoAnimal);
		//		System.out.println(alturaAnimal);
		//		System.out.println(comprimentoAnimal);
		//		System.out.println(idedeAnimal);
		//		System.out.println(temDono);
		//		System.out.println(letraInicialAnimal);
		//
		//		Integer CodigoPedigree = 12232;
		//		Float PesoAnimal = 50.5f;
		//		Double PrecoAnimal = 1800.50d;
		//		Short AlturaAnimal = 95;
		//		Long ComprimentoAnimal = 120l;
		//		Byte IdedeAnimal = 127;
		//		Boolean TemDono = true;
		//		Character LetraInicialAnimal = 'D';

		//		System.out.println("================================");
		//		System.out.println(codigoPedigree + CodigoPedigree);
		//		System.out.println(pesoAnimal + PesoAnimal);
		//		System.out.println(precoAnimal + PrecoAnimal);
		//		System.out.println(alturaAnimal + AlturaAnimal);
		//		System.out.println(comprimentoAnimal + ComprimentoAnimal);
		//		System.out.println(idedeAnimal + IdedeAnimal);
		//		System.out.println(temDono && TemDono);
		//		System.out.println(letraInicialAnimal + LetraInicialAnimal);
		//		System.out.println("================================");
		//		BigDecimal valorCheio = new BigDecimal("150.97");
		//System.out.println(valorCheio.divide(new BigDecimal("10"), 2));


		//System.out.println(valorCheio.divide(new BigDecimal("10")));

		//BigDecimal dezPorCentovalorCheio = valorCheio.multiply(new BigDecimal("0.1"));
		//System.out.println(dezPorCentovalorCheio.setScale(2, RoundingMode.HALF_EVEN));

		//boolean meuBoolean1 = false;
		//System.out.println(meuBoolean || !meuBoolean);

		Integer idade = 18;
		//System.out.println(idade.doubleValue());

		String idadeString = "30";
		Double saidaIdade = Double.valueOf(idadeString);
		//System.out.println(saidaIdade*2);

		//System.out.println("\b\b\b");
		//System.out.println("Testando o git");

		//System.out.println(Soma(5d,4d));

		OlaMundo om = new OlaMundo();
		Double r = om.soma(14d, 15.5);
		//System.out.println(r);

		Double r1 = om.subtracao(r, 2.5);
		//System.out.println(r1);

		//om.imprimeNaTelaBoaNoite("Vai dormir");

		//String entradaDoUsuario = om.lerTeclado(); 
		//System.out.println("Testando a entrada do usuario: " + entradaDoUsuario);
		
		//******************************************************************************
		/*
		 * System.out.println("Digite o 1o. valor"); Double n1 =
		 * Integer.valueOf(om.lerTeclado()).doubleValue();
		 * System.out.println("Digite o 2o. valor"); Double n2 =
		 * Integer.valueOf(om.lerTeclado()).doubleValue();
		 * 
		 * Double res = om.soma(n1, n2); System.out.println("O resultado da soma é: "+
		 * res);
		 */		//******************************************************************************
      		
		System.out.println("Digite a 1a. nota");
		Double nota1 = Double.valueOf(om.lerTeclado());

		System.out.println("Digite a 2a. nota");
		Double nota2 = Double.valueOf(om.lerTeclado());

		System.out.println("Digite a 3a. nota");
		Double nota3 = Double.valueOf(om.lerTeclado());

		Double media = om.calculaMedia(nota1, nota2);
		media = om.calculaMedia(media, nota3);
		System.out.println(String.format("1. A media das notas é: %.2f " , media));
		
		if (om.verificaAprovacao(media)) {
			System.out.println("Parabens! Aluno aprovado!");
		} else {
			System.out.println("Aluno nao foi aprovado!");
		}
		
		//media = media > 7.0 ? 10.0 : 22.0;
		System.out.println(media = media > 7.0 ? 10.0 : 22.0);
		
		Double[] listaDeNotas = new Double[10];
		listaDeNotas[0] = 1.0;
		listaDeNotas[1] = 2.0;
		listaDeNotas[2] = 3.0;
		listaDeNotas[3] = 4.0;
		listaDeNotas[4] = 5.0;
		listaDeNotas[5] = 6.0;
		listaDeNotas[6] = 7.0;
		listaDeNotas[7] = 8.0;
		listaDeNotas[8] = 9.0;
		listaDeNotas[9] = 10.0;
		
	}

	public Double soma(Double Valor1, Double Valor2) {
		//if (Valor1 > 10 && Valor2 > 10) {
		return Valor1 + Valor2;
		//} 
		//return -1.0;
	}

	public Double subtracao(Double Valor1, Double Valor2) {
		return Valor1 - Valor2;		
	}

	public void imprimeNaTelaBoaNoite(String Texto) {
		System.out.println(Texto);
	}

 
	public Double calculaMedia(Double v1, Double v2) {
		return (v1 + v2) / 2;
	}
	
	public String lerTeclado() {
		Scanner entradaConsole = new Scanner(System.in);
		System.out.println("");
		return entradaConsole.next();
	}
	
	public Boolean verificaAprovacao(Double media) {
		return media >= 7.0;
	}
}
