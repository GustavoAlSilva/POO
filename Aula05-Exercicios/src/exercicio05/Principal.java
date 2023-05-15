package exercicio05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int resposta;
		
		Estoque estoque = new Estoque();
		
		do {
			
			resposta = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n" +
			"\n[1] - Cadastrar peças;" +
			"\n[2] - Remover peça;" +
			"\n[3] - Ver todas as peças;" +
			"\n[0] - Sair.\n\n"));
			
			switch(resposta) {
			
			case 1:
				int qtd;
				
				qtd = Integer.parseInt(JOptionPane.showInputDialog("\nQuantas peças deseja cadastrar? "));
				
				for (int i = 0; i < qtd; i++) {
					
					Peca peca = new Peca();
					
					peca.setDescricao(JOptionPane.showInputDialog("Digite a descrição da " + (i+1) + "º peça: "));
					peca.setPreco(Double.parseDouble(JOptionPane.showInputDialog("\nDigite o preço da " + (i+1) + "º peça: ")));
					peca.setCor(JOptionPane.showInputDialog("\nDigite a cor da " + (i+1) + "º peça: "));
					peca.setAltura(Double.parseDouble(JOptionPane.showInputDialog("\nDigite a altura da " + (i+1) + "º peça: ")));
					peca.setLargura(Double.parseDouble(JOptionPane.showInputDialog("\nDigite a largura da " + (i+1) + "º peça: ")));
					
					estoque.cadastraPeca(peca);
				}
				
				break;
				
			case 2:
				int indice;
				
				indice = Integer.parseInt(JOptionPane.showInputDialog("\nQual é o índice da peça que deseja remover? "));
				
				estoque.removerPeca(indice);
				
				break;
				
			case 3:
				estoque.verPecas();
				
				break;
				
			case 0:
				JOptionPane.showMessageDialog(null, "\nMuito obrigado pela participação!");
				
				break;
	
			}
			
		} while (resposta != 0);
	}
}
