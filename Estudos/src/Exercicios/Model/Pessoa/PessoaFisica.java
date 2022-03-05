package Exercicios.Model.Pessoa;

public class PessoaFisica extends Pessoa {
	
	private double gastoSaude = 0;
	private static final double RENDA_LIMITE = 20000.00;

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public PessoaFisica() {
		super();
	}

	private double getTaxaImposto(double renda) {
		if(renda < RENDA_LIMITE)
			return 0.15;
		else
			return 0.25;
	}
	
	public double CalcularImposto() {
		double renda = this.getRendaAnual(), valorImposto;
		var tax = this.getTaxaImposto(renda);		

		valorImposto = (renda * tax) - (this.gastoSaude / 2);
		 
		
		return valorImposto;
	}

}
