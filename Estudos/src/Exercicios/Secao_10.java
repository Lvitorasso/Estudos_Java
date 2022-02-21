package Exercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicios.Model.Empregado;

public class Secao_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int qtd = 0, id = 0;
		double perc = 0;
		boolean encontrou = false;
		List<Empregado> list = new ArrayList<Empregado>();
		
		System.out.println("Quantos empregados serão registrados?");
		qtd = sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			Empregado emp = new Empregado();
			
			System.out.printf("Empregado #%d%n", i+1);

			System.out.println("ID:");
			emp.setId(sc.nextInt());
			sc.nextLine();
			System.out.println("Nome:");
			emp.setNome(sc.nextLine());
			System.out.println("Salario:");
			emp.setSalario(sc.nextDouble());
			sc.nextLine();
			
			list.add(emp);
		}

		System.out.println("Entre com o id do funcionario que terá um aumento");
		id = sc.nextInt();
		
		for(Empregado i : list) {
			if(i.getId() == id)
				encontrou = true;
		}
		
		if(!encontrou)
			System.out.println("Esse ID não existe");
		else {
			System.out.println("digite a porcentagem de aumento");
			perc = sc.nextDouble();
		}		
		
		for(Empregado i : list) {
			if(i.getId() == id)
				i.aumentaSalario(perc);
		}

		System.out.println("Lista de empregados");
		for(Empregado i : list) {
			System.out.printf("%d, %s, %.2f%n", i.getId(), i.getNome(), i.getSalario());
		}
		
		sc.close();
	}

}
