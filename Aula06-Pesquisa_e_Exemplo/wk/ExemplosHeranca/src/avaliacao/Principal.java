package avaliacao;

public class Principal {

	public static void main(String[] args) {

		Resposta r = new Resposta();
		r.setQuestao1("A");

		Gabarito g = new Gabarito();
		g.setQuestao1("B");

		Avaliacao a = new Gabarito(); // Polimorfismo: Não dá para instanciar um objeto na classe Avaliacao; mas sim nas classes Gabarito e Resposta.

	}

}
