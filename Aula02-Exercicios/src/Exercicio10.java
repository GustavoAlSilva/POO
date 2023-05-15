import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int[] votes = new int[20];
		int irineu = 0, felipe = 0, jarbas = 0;
		String favorite; 
		
		for(int i = 0; i < 20; i++) {
			
			votes[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do seu preferencial candidato:\n\n[88] - Irineu\n[95] - Felipe Smith\n[23] - Jarbas\n\n"));
			
			switch (votes[i]) {
			
			case 88:
				irineu++;
				break;
				
			case 95:
				felipe++;
				break;
				
			case 23:
				jarbas++;
				break;
				
			default:
				
				JOptionPane.showMessageDialog(null, "Candidato inválido");
				return;
				
			}
			
		}
		
		if(irineu > felipe & irineu > jarbas) {
			
			favorite = "Irineu é o candidato favorito.";
			
		} else if(felipe > irineu & felipe > jarbas) {
			
			favorite = "Felipe Smith é o candidato favorito.";
			
		} else if(jarbas > irineu & jarbas > felipe) {
			
			favorite = "Jarbas";
			
		} else {
			
			favorite = "Empate! Não há candidato favorito.";
			
		}
		
		JOptionPane.showMessageDialog(null, "Irineu: " + irineu + "\nFelipe Smith: " + felipe + "\nJarbas: " + jarbas + "\n\n" + favorite);
		
	}

}
