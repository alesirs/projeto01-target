package br.target.empregados;

import java.util.Scanner;

import br.target.empregados.Empregado;
import br.target.empregados.Gerente;
import br.target.empregados.Instrutor;
import br.target.empregados.Vendedor;

public class PrincipalEmpregados {

	public static void main(String[] args) {

		PrincipalEmpregados pe = new PrincipalEmpregados();
		try {
			pe.executar();
		} catch (EntradaInvalidaException e) {
			e.printStackTrace();
		}
		
		//pe.imprimePosicao(2);
	}

	private void imprimePosicao(int posicao) {
		try {
			int[] myNumbers = {1,2,3};
			System.out.println(myNumbers[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			//System.out.println("Posicao invalida");
			//thrown new PosicaoInvalidaException;
		}
		
		
	}

	private void executar() throws EntradaInvalidaException {
		Scanner entradaConsole = new Scanner(System.in);
		String funcaoEmpregado = null;
		for (; ;) {
			int tipoEmpregado = 0;
			System.out.println("Informe o tipo de empregado: ");
			
			System.out.print("1-Vendedor / 2-Instrutor / 3-Gerente / 0-Sair: ");
			entradaConsole = new Scanner(System.in);
			//Tratar excecao em caso de digitacao de texto. Pegar o fonte do professor
			//Tratar todo o tipo de excecao
			//
			try {
			   tipoEmpregado = Integer.valueOf(entradaConsole.next());
			} catch (NumberFormatException e) {
				throw new EntradaInvalidaException();
			}

			Empregado empregado = null;

			switch (tipoEmpregado) {
			case 0: {
				break;
			}
			case 1: {
				funcaoEmpregado = "Vendedor";
				System.out.println("\n-------------"+funcaoEmpregado+"-------------");
				System.out.print("Informe o percentual de comissao: ");
				Double comissao = Double.valueOf(entradaConsole.next());
				System.out.print("Informe o valor das vendas: ");
				Double valorDasVendas = Double.valueOf(entradaConsole.next());

				Vendedor vendedor = new Vendedor(comissao, valorDasVendas);
				empregado = vendedor;
				break;
			}
			case 2: {
				funcaoEmpregado = "Instrutor";
				System.out.println("\n-------------"+funcaoEmpregado+"-------------");
				System.out.print("Informe o valor da hora: ");
				Double valorHora =  Double.valueOf(entradaConsole.next());
				System.out.print("Informe as horas trabalhadas: ");
				Integer horasTrabalhadas = Integer.valueOf(entradaConsole.next());
				Instrutor instrutor = new Instrutor(horasTrabalhadas, valorHora);
				empregado = instrutor;
				break;
			}
			case 3: {
				funcaoEmpregado = "Gerente";
				System.out.println("\n-------------"+funcaoEmpregado+"-------------");
				Gerente gerente = new Gerente();
				System.out.print("Informe o salario: ");
				gerente.setSalario(Double.valueOf(entradaConsole.next()));
				System.out.print("Informe o valor da gratificacao: ");
				gerente.setGratificacao(Double.valueOf(entradaConsole.next()));
				empregado = gerente;
				break;
			}
			default:{
				throw new EntradaInvalidaException();
			}
			}

			if (tipoEmpregado == 0) {
				break;
			}
			
			System.out.print("Informe o nome do " + funcaoEmpregado + ": ");
			empregado.setNome(entradaConsole.next());
			System.out.print("Informe a data de nascimento: ");
			empregado.setDataNascimento(entradaConsole.next());
			System.out.print("Informe o e-mail: ");
			empregado.setEmail(entradaConsole.next());

			System.out.printf("Recebiveis de "+empregado.getNome() + ": R$ %.2f\n\n", empregado.calcularRendimentos());

		}
	}

	/*

        Scanner entradaConsole = new Scanner(System.in);
        for (int i=0; ; ) {
            int tipoEmpregado = 0;
            System.out.println("Informe o tipo de empregado: ");
            System.out.print("1-Gerente / 2-Vendedor / 3-Instrutor / 0-Sair: ");
            entradaConsole = new Scanner(System.in);
            tipoEmpregado = Integer.valueOf(entradaConsole.next());

            switch (tipoEmpregado) {
                case 0: {
                    break;
                }
                case 1: {
                    System.out.println("\n-------------Gerente-------------");
                    Gerente gerente = new Gerente();
                    System.out.print("Informe o nome do Gerente: ");
                    gerente.setNome(entradaConsole.next());
                    System.out.print("Informe a data de nascimento: ");
                    gerente.setDataNascimento(entradaConsole.next());
                    System.out.print("Informe o e-mail: ");
                    gerente.setEmail(entradaConsole.next());
                    System.out.print("Informe o salario: ");
                    gerente.setSalario(Double.valueOf(entradaConsole.next()));
                    System.out.print("Informe o valor da gratificacao: ");
                    gerente.setGratificacao(Double.valueOf(entradaConsole.next()));
                    System.out.printf("Recebiveis do Gerente: R$ %.2f\n\n", gerente.calcularRendimentos());
                    break;
                }
                case 2: {
                    System.out.println("\n-------------Vendedor-------------");
                    Vendedor vendedor = new Vendedor();
                    System.out.print("Informe o nome do Vendedor: ");
                    vendedor.setNome(entradaConsole.next());
                    System.out.print("Informe a data de nascimento: ");
                    vendedor.setDataNascimento(entradaConsole.next());
                    System.out.print("Informe o e-mail: ");
                    vendedor.setEmail(entradaConsole.next());
                    System.out.print("Informe o percentual de comissao: ");
                    //vendedor.setSalario();
                    vendedor.setComissao(Double.valueOf(entradaConsole.next()));
                    System.out.print("Informe o valor das vendas: ");
                    vendedor.setValorDasVendas(Double.valueOf(entradaConsole.next()));
                    System.out.printf("Recebiveis do Vendedor: R$ %.2f\n\n", vendedor.calcularRendimentos());
                    break;
                }
                case 3: {
                    System.out.println("\n-------------Instrutor-------------");
                    Instrutor instrutor = new Instrutor();
                    System.out.print("Informe o nome do Instrutor: ");
                    instrutor.setNome(entradaConsole.next());
                    System.out.print("Informe a data de nascimento: ");
                    instrutor.setDataNascimento(entradaConsole.next());
                    System.out.print("Informe o e-mail: ");
                    instrutor.setEmail(entradaConsole.next());
                    System.out.print("Informe o salario: ");
                    instrutor.setSalario(Double.valueOf(entradaConsole.next()));
                    System.out.print("Informe a quantidade de horas trabalhadas: ");
                    instrutor.setHorasTrabalhadas(Integer.valueOf(entradaConsole.next()));
                    System.out.printf("Recebiveis do Instrutor: R$ %.2f\n\n", instrutor.calcularRendimentos());
                    break;
                }
                default:{
                    System.out.println("Opcao invalida!");
                }
            }
            if (tipoEmpregado == 0) {
                break;
            }
        }
		/*
		Vendedor vendedorVariavel = new Vendedor();
		vendedorVariavel.setNome("Juca Bala");
		Gerente gerenteVariavel = new Gerente();
		gerenteVariavel.setNome("Gerentao");
		Instrutor instrutor = new Instrutor();
		instrutor.setNome("Master");
		List<Empregado> empregados = new ArrayList<Empregado>();
		empregados.add(vendedorVariavel);
		empregados.add(gerenteVariavel);
		empregados.add(instrutor);

		for (Empregado empregado : empregados) {
			System.out.println(empregado.getNome() + " --> " +  empregado.calcularRendimentos()); 
		}
	 */
}

