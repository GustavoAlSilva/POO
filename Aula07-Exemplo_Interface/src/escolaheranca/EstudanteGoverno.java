package escolaheranca;

import javax.swing.JOptionPane;

public class EstudanteGoverno extends Estudante{

	
	/*Implementação do método de acordo com a necessidade da classe*/
	@Override
	public void ajustarMensalidade(double valor) {
		JOptionPane.showMessageDialog(null, "Estudante não paga mensalidade!");
	}

}
