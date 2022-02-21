package Exercicios.Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Exercicios.enums.Cargo;

public class Trabalhador {
	private String nome;
	private Cargo nivel;
	private double salarioBase;
	private String departamento;
	private List<Contrato> arrContratos = new ArrayList<Contrato>();
	SimpleDateFormat formatterAnoMes = new SimpleDateFormat("MM/yyyy");
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cargo getNivel() {
		return nivel;
	}
	
	public void setNivel(Cargo nivel) {
		this.nivel = nivel;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Trabalhador() {
	}
	
	public Trabalhador(String nome, Cargo nivel, double salarioBase) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
	}
	
	public void adicionarContrato(Contrato contrato) {
		this.arrContratos.add(contrato);		
	}
	
	public void removerContrato(Contrato contrato) {
		this.arrContratos.remove(contrato);				
	}
	
	@SuppressWarnings("deprecation")
	public void rendimentoMensal(Date anoMes) {
		double rendimento = 0;
		for(Contrato c : this.arrContratos) {
			if(anoMes.getYear() == c.getData().getYear() && anoMes.getMonth() == c.getData().getMonth() )
			rendimento += (c.getValorHora() * c.getHoras());
		}
		
		rendimento += this.salarioBase;

		System.out.println("Name: " + this.nome + "%n");	
		System.out.println("Departamento: " + this.departamento + "%n");	
		System.out.println("Salario para o mês: " + anoMes);
		System.out.println(rendimento);	
	}
	
}
