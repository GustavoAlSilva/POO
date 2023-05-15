package investimentointerface;

public abstract class InvestimentoMae {

	protected double totalInvestido;
	protected int tempoMesesMinimo;

	
	public int getTempoMesesMinimo() {
		return tempoMesesMinimo;
	}


	public void setTempoMesesMinimo(int tempoMesesMinimo) {
		this.tempoMesesMinimo = tempoMesesMinimo;
	}


	public double getTotalInvestido() {
		return totalInvestido;
	}


	public void setTotalInvestido(double totalInvestido) {
		this.totalInvestido = totalInvestido;
	}
	
}
