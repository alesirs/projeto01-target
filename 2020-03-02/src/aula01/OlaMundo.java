package aula01;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
		System.out.println(idade.doubleValue());
		
        String idadeString = "30";
        Double saidaIdade = Double.valueOf(idadeString);
        System.out.println(saidaIdade*2);
        
        System.out.println("\b\b\b");
        System.out.println("Testando o git");
        
        //System.out.println(Soma(5d,4d));
        
        OlaMundo om = new OlaMundo();
        Double r = om.soma(14d, 15.5);
        System.out.println(r);

        Double r1 = om.subtracao(r, 2.5);
        System.out.println(r1);
        
        om.imprimeNaTelaBoaNoite("Vai dormir");
	}

	public Double soma(Double Valor1, Double Valor2) {
		if (Valor1 > 10 && Valor2 > 10) {
			return Valor1 + Valor2;
		} 
		return -1.0;
	}
	
	public Double subtracao(Double Valor1, Double Valor2) {
		return Valor1 - Valor2;		
	}
	
	public void imprimeNaTelaBoaNoite(String Texto) {
		System.out.println(Texto);
	}
	
	
	
}
