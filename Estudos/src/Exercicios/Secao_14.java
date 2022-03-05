package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Exercicios.Model.Pessoa.Pessoa;
import Exercicios.Model.Pessoa.PessoaFisica;
import Exercicios.Model.Pessoa.PessoaJuridica;

public class Secao_14 {
	
	//teste regra

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int qtd = 0;
		List<Pessoa> arrPessoa = new ArrayList<Pessoa>();
		
		/* EX 1 */
		
		System.out.println("Quantos serão registrados?");
		qtd = sc.nextInt();		
		sc.nextLine();
		
		for(int i = 0; i < qtd; i++) {	
			Pessoa pessoa = null;
			String tpoPessoa = "";
			
			System.out.printf("Tax #%d%n", i+1);
			
			while(!tpoPessoa.equals("f") && !tpoPessoa.equals("j")) 
			{
				System.out.println("Pessoa fisica ou juridica? (f/j):");			
				tpoPessoa = sc.nextLine();
				
				if(tpoPessoa.equals("f"))
					pessoa = new PessoaFisica();			
				else if(tpoPessoa.equals("j"))
					pessoa = new PessoaJuridica();				
			}

			System.out.println("Nome:");
			pessoa.setNome(sc.nextLine());
			
			System.out.println("Valor por ano:");
			pessoa.setRendaAnual(sc.nextDouble());
			sc.nextLine();
			
			if(pessoa instanceof PessoaFisica)
			{
				System.out.println("Gastos com saude:");
				((PessoaFisica) pessoa).setGastoSaude(sc.nextDouble());
				sc.nextLine();				
			}
			
			if(pessoa instanceof PessoaJuridica)
			{
				System.out.println("Numero de funcionarios:");
				((PessoaJuridica) pessoa).setNumFuncionarios(sc.nextInt());
				sc.nextLine();				
			}
			
			arrPessoa.add(pessoa);
		}	
		
		for(Pessoa p : arrPessoa) {
			System.out.printf("%s: %.2f \n", p.getNome(), p.CalcularImposto());
		}

		sc.close();
	}

}
