package Exercicios.Model;

public class Item {
	private int quantidade;
	private double preco;
	private Produto produto = new Produto();
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double subTotal() {
		return this.preco;
	}

	public Item() {
	}
	
	public Item(int quantidade, double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}	
}
