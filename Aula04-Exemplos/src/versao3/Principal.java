package versao3;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos filmes deseja adicionar à lista"));
		
		MinhaLista minhaLista = new MinhaLista();
		
		for (int i=0; i<opcao; i++) {
			
			Filme filme = new Filme();
			
			JOptionPane.showMessageDialog(null, "Informe os dados do filme "+(i+1)+" que pretende adicionar");
			
			filme.setTitulo(JOptionPane.showInputDialog("Informe o nome do título"));
			filme.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Informe a duração em minutos")));
			filme.setGenero(JOptionPane.showInputDialog("Informe o gênero"));
			filme.setClassIndicativa(Integer.parseInt(JOptionPane.showInputDialog("Informe classificação indicativa")));	
		
			minhaLista.adicionarFilme(filme);
			
		}
		
		JOptionPane.showMessageDialog(null,minhaLista.verFilmes());
		
	}

}
