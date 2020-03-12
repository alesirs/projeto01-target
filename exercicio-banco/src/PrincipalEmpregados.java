import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.target.empregados.Empregado;
import br.target.empregados.Gerente;
import br.target.empregados.Instrutor;
import br.target.empregados.Vendedor;

public class PrincipalEmpregados {

	public static void main(String[] args) {

		Vendedor vendedorVariavel = new Vendedor(0.5, 2500.0);
		vendedorVariavel.setNome("Juca Bala");
		
		Gerente gerenteVariavel = new Gerente(10000.0, 1500.0);
		gerenteVariavel.setNome("Gerentao");
		
		Instrutor instrutor = new Instrutor(3000.0, 44);
		instrutor.setNome("Master");

		Scanner entradaConsole;
		System.out.println("Informe o tipo de empregado\n");
		entradaConsole = new Scanner(System.in);
		
		switch (Integer.valueOf(entradaConsole.next())) {
			case 1: {
				System.out.println("Informe o nome do Gerente\n");
				  entradaConsole.next();
			
			}
			case 2: {
				
			}
			case 3: {
				
			}
		}
		
		
		
		
		List<Empregado> empregados = new ArrayList<Empregado>();
		empregados.add(vendedorVariavel);
		empregados.add(gerenteVariavel);
		empregados.add(instrutor);
		
		for (Empregado empregado : empregados) {
			System.out.println(empregado.getNome() + " --> " +  empregado.calcularRendimentos()); 
		}
		
	}

}
