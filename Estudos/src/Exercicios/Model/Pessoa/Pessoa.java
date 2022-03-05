package Exercicios.Model.Pessoa;

public abstract class Pessoa {
	
	private String nome;
	private double rendaAnual;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getRendaAnual() {
		return rendaAnual;
	}
	
	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public Pessoa(String nome, double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public Pessoa() {
		super();
	}
	
	public abstract double CalcularImposto();	

}
