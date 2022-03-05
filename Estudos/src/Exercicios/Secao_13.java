package Exercicios;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import Exercicios.Model.Contrato;
import Exercicios.Model.Item;
import Exercicios.Model.Pedido;
import Exercicios.Model.Produto;
import Exercicios.Model.Trabalhador;
import Exercicios.enums.Cargo;
import Exercicios.enums.Status;

public class Secao_13 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatterAnoMes = new SimpleDateFormat("MM/yyyy");
		
		/* EX 1 */
		
		Trabalhador empregado = new Trabalhador();
		int qtdContrato = 0;
		
		System.out.println("Digite o nome do departamento");
		empregado.setDepartamento(sc.nextLine());		

		
		System.out.println("Registre o Empregado");

		System.out.println("Nome:");
		empregado.setNome(sc.nextLine());		

		System.out.println("Nivel:");
		empregado.setNivel(Cargo.valueOf(sc.nextLine()));		

		System.out.println("Salario base:");
		empregado.setSalarioBase(sc.nextDouble());
		sc.nextLine();				

		System.out.println("Quantos contratos ?");
		qtdContrato = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < qtdContrato; i++) {
			Contrato contrato = new Contrato();
			
			System.out.printf("Contrato #%d%n", i+1);

			System.out.println("Data:");			
			contrato.setData(formatter.parse(sc.nextLine()));
			
			System.out.println("Valor por hora:");
			contrato.setValorHora(sc.nextDouble());
			sc.nextLine();
			
			System.out.println("Duração:");
			contrato.setHoras(sc.nextInt());
			sc.nextLine();
			
			empregado.adicionarContrato(contrato);
		}
		
		System.out.printf("Entre com o mês e ano para calculo do salario (MM/AAAA)");	
		empregado.rendimentoMensal(formatterAnoMes.parse(sc.nextLine()));		

		/* EX FIXAÇÃO */

		Pedido pedido = new Pedido();
		int qtdItens = 0;
		
		System.out.println("Entre com os dados do cliente");
			
		System.out.println("Nome:");
		pedido.cliente.setNome(sc.nextLine());

		System.out.println("email:");
		pedido.cliente.setEmail(sc.nextLine());

		System.out.println("Data de nascimento (DD/MM/AAAA)");
		pedido.cliente.setDtNascimento(formatter.parse(sc.nextLine()));

		System.out.println("Entre com o STATUS do pedido");
		pedido.setStatus(Status.valueOf(sc.nextLine()));
		
		System.out.println("Quantos itens ?");
		qtdItens = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < qtdItens; i++) {
			Produto produto = new Produto();
			Item item = new Item();
			
			System.out.printf("Item #%d%n", i+1);

			System.out.println("Nome do produto:");			
			produto.setNome(sc.nextLine());
			
			System.out.println("Preco:");
			produto.setPreco(sc.nextDouble());
			sc.nextLine();
			
			item.setProduto(produto);			

			System.out.println("Quantidade:");
			item.setQuantidade(sc.nextInt());	
			sc.nextLine();		

			item.setPreco(item.getQuantidade() * produto.getPreco());
			
			pedido.adicionar(item);
		}
		
		pedido.pedirConta();
		
		sc.close();
	}

}
