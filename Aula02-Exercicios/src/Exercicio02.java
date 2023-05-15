import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		String nomeDisciplina;
		double mediaFinal, frequencia;
		
		nomeDisciplina = JOptionPane.showInputDialog("Informe a disciplina");
		mediaFinal = Double.parseDouble(JOptionPane.showInputDialog("Informe sua média final na disciplina " + nomeDisciplina));
		frequencia = Double.parseDouble(JOptionPane.showInputDialog("Informe sua frequência em % na disciplina " + nomeDisciplina));
		
		if(mediaFinal>=7 && frequencia>=75) {
			JOptionPane.showMessageDialog(null, "Com média "+mediaFinal+" e frequência "+frequencia+"%, você está APROVADO na disciplina de "+nomeDisciplina);
	
		}else {
			JOptionPane.showMessageDialog(null, "Com média "+mediaFinal+" e frequência "+frequencia+"%, você está REPROVADO na disciplina de "+nomeDisciplina);
		}
		
	}

}

// A PROFESSORA QUE FEZ. COPIEI DO EXEMPLO
