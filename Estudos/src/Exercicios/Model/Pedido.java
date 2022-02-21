package Exercicios.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private Date dtPedido = new Date();
	private Exercicios.enums.Status Status;
	public Cliente cliente = new Cliente();
	private List<Item> arrItem = new ArrayList<Item>();

	public Date getDtPedido() {
		return dtPedido;
	}

	public void setDtPedido(Date dtPedido) {
		this.dtPedido = dtPedido;
	}

	public Exercicios.enums.Status getStatus() {
		return Status;
	}

	public void setStatus(Exercicios.enums.Status status) {
		Status = status;
	}

	public List<Item> getArrItem() {
		return arrItem;
	}

	public void setArrItem(List<Item> arrItem) {
		this.arrItem = arrItem;
	}

	public void adicionar(Item item) {
		this.arrItem.add(item);		
	}
	
	public void remover(Item item) {
		this.arrItem.add(item);				
	}
	
	public double total() {
		double total = 0;
		for(Item i : this.arrItem) {
			total += i.subTotal();
		}
		
		return total;
	}

	public Pedido() {
	}
	
	public Pedido(Date dtPedido, Exercicios.enums.Status status, List<Item> arrItem) {
		this.dtPedido = dtPedido;
		Status = status;
		this.arrItem = arrItem;
	}	
	
	public void pedirConta() {
		System.out.println("Data do pedido: " + this.dtPedido);
		System.out.println("Status: " + this.Status);
		System.out.println("Cliente: " + this.cliente.getNome() 
		+ " " + this.cliente.getDtNascimento()
		+ " " + this.cliente.getEmail());

		System.out.println("Itens do pedido");
		for(Item i : this.arrItem) {
			System.out.printf("%s, Quantidade: %d, Subtotal: $%.2f", i.getProduto().getNome(), i.getQuantidade(), i.getPreco());
		}
		
		System.out.println("Preço total do pedido: $" + this.total());
	};
	
}
