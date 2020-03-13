package br.target.empregados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.target.empregados.Empregado;
import br.target.empregados.Gerente;
import br.target.empregados.Instrutor;
import br.target.empregados.Vendedor;

public class PrincipalEmpregados {

    public static void main(String[] args) {

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

}