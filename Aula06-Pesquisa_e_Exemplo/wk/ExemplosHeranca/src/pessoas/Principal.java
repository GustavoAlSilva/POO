package pessoas;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int resposta;
		
		Pessoa p;
		
		resposta = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de pessoa você deseja cadastrar?\n" +
				"\n[0] - Pessoa Física;" + 
				"\n[1] - Pessoa Jurídica." +
				"\n\n"));

		if(resposta == 0) {
		
			p = new PessoaFisica(); // Polimorfismo
		}
		
		if(resposta == 1) {
			
			p = new PessoaJuridica(); // Polimorfismo
		}
	}
}
