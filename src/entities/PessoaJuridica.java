package entities;

public class PessoaJuridica extends Person {

	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, double anualIncome, Integer numFuncionarios) {
		super(name, anualIncome);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public Double tax() {
		if(getNumFuncionarios()<10) {
			return getAnualIncome() * 0.16;
		} else {
			return getAnualIncome() * 0.14;
		}
	}

}
