package exercicio04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int nota = 0;
		
		String questao;
		
		Gabarito gabarito = new Gabarito();
		Resposta resposta = new Resposta();
		Validacoes validacoes = new Validacoes();
		
		// ----------------- Gabarito -----------------
		
		do {
			questao = JOptionPane.showInputDialog("Informe o gabarito da questão 01: ");

		} while (!validacoes.validaQuestao(questao));
		gabarito.setQuestao01(questao);

		do {
			questao = JOptionPane.showInputDialog("Informe o gabarito da questão 02: ");

		} while (!validacoes.validaQuestao(questao));
		gabarito.setQuestao02(questao);
		
		do {
			questao = JOptionPane.showInputDialog("Informe o gabarito da questão 03: ");

		} while (!validacoes.validaQuestao(questao));
		gabarito.setQuestao03(questao);
		
		do {
			questao = JOptionPane.showInputDialog("Informe o gabarito da questão 04: ");

		} while (!validacoes.validaQuestao(questao));
		gabarito.setQuestao04(questao);
		
		do {
			questao = JOptionPane.showInputDialog("Informe o gabarito da questão 05: ");

		} while (!validacoes.validaQuestao(questao));
		gabarito.setQuestao05(questao);
		
		// ----------------- Resposta -----------------
		
		do {
			questao = JOptionPane.showInputDialog("Informe a resposta da questão 01: ");

		} while (!validacoes.validaQuestao(questao));
		resposta.setQuestao01(questao);

		do {
			questao = JOptionPane.showInputDialog("Informe a resposta da questão 02: ");

		} while (!validacoes.validaQuestao(questao));
		resposta.setQuestao02(questao);
		
		do {
			questao = JOptionPane.showInputDialog("Informe a resposta da questão 03: ");

		} while (!validacoes.validaQuestao(questao));
		resposta.setQuestao03(questao);
		
		do {
			questao = JOptionPane.showInputDialog("Informe a resposta da questão 04: ");

		} while (!validacoes.validaQuestao(questao));
		resposta.setQuestao04(questao);
		
		do {
			questao = JOptionPane.showInputDialog("Informe a resposta da questão 05: ");

		} while (!validacoes.validaQuestao(questao));
		resposta.setQuestao05(questao);
		
		// ----------------- Comparação -----------------
		
		if (gabarito.getQuestao01().equals(resposta.getQuestao01())) {
			
			nota += 2;
		}
		
		if (gabarito.getQuestao02().equals(resposta.getQuestao02())) {
			
			nota += 2;
		}
		
		if (gabarito.getQuestao03().equals(resposta.getQuestao03())) {
			
			nota += 2;
		}
		
		if (gabarito.getQuestao04().equals(resposta.getQuestao04())) {
			
			nota += 2;
		}

		if (gabarito.getQuestao05().equals(resposta.getQuestao05())) {
	
			nota += 2;
		}
		
		JOptionPane.showMessageDialog(null, "Nota final: " + nota);
	}
}