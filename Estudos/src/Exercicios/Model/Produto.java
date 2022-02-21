package Exercicios.Model;

public class Produto {
	
	public String nome;
	public double preco;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto() {
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}	
}
