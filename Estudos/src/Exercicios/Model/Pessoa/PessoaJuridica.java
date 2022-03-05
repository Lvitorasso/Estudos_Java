package Exercicios.Model.Pessoa;

public class PessoaJuridica extends Pessoa  {

	private int numFuncionarios;
	private static final int FUNCIONARIOS_LIMITE = 10;

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public PessoaJuridica() {
	}
	
	private double getTaxaImposto(int funcionarios) {
		if(funcionarios < FUNCIONARIOS_LIMITE)
			return 0.16;
		else
			return 0.14;
	}
	
	public double CalcularImposto() {
		double renda = this.getRendaAnual(), valorImposto;
		var tax = this.getTaxaImposto(this.numFuncionarios);		

		valorImposto = (renda * tax);
		 
		
		return valorImposto;
	}
	
}
