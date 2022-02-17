package entities;

public class PessoaFisica extends Person {

	private double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, double anualIncome, double gastosSaude) {
		super(name, anualIncome);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double tax() {
		
		double GastosSaude = getGastosSaude() * 0.5;
		
		if (getAnualIncome()<20000) {
			double sum = (getAnualIncome() * 0.15) - GastosSaude;
			return sum;
		} else {
			double sum = (getAnualIncome() * 0.25) - GastosSaude;
			return sum;
		}
	}
	
}
