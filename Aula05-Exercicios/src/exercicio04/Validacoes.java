package exercicio04;

public class Validacoes {

	public boolean validaQuestao(String questao) {
		
		if (questao.equals("A") || questao.equals("B") || questao.equals("C") || questao.equals("D") || questao.equals("E")) {
		
			return true;
		}
		
		return false;
	}
}
