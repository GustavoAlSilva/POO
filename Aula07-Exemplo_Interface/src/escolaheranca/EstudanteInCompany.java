package escolaheranca;

import javax.swing.JOptionPane;

public class EstudanteInCompany extends Estudante{
	
	private double mensalidade;
	
	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	/*Implementação do método de acordo com a necessidade da classe*/
	@Override
	public void ajustarMensalidade(double valor) {
		JOptionPane.showMessageDialog(null, "Estudante não tem reajuste de mensalidade, curso todo já pago!");
		
	}

}
