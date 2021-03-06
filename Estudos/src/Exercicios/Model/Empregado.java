package Exercicios.Model;

public class Empregado {
	private int id;
	private String nome;
	private double salario;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Empregado() {
	}

	public Empregado(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public void aumentaSalario(double valor) {
		this.salario = this.salario * ((valor/100)+1);
	}
	
}
