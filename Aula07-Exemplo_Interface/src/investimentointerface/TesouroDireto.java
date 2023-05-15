package investimentointerface;

public class TesouroDireto extends InvestimentoMae implements Investimento {
	
	/*Método implementado a partir da obrigatoriedade da interface*/
	public double calcularRetorno() {
		return this.totalInvestido += totalInvestido * 1.30;
	}

}
