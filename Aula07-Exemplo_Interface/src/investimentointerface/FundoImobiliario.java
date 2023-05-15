package investimentointerface;

public class FundoImobiliario extends InvestimentoMae implements Investimento{
	
	/*Método implementado a partir da obrigatoriedade da interface*/
	public double calcularRetorno() {
		return this.totalInvestido += totalInvestido * 1.45;
	}

}
