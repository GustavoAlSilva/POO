package escolaheranca;

public class EstudanteParticular extends Estudante {	

	private double mensalidade;

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	@Override
	public void ajustarMensalidade(double valor) {
		this.mensalidade+=valor;
		
	}

}
