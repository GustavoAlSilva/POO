package exercicio05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Estoque {

	private ArrayList<Peca> listaDePecas = new ArrayList<>();
	
	public void cadastraPeca(Peca peca) {
		
		this.listaDePecas.add(peca);
		
	}
	
	public void removerPeca(int indice) {
		
		this.listaDePecas.remove(indice);
		
	}
	
	public void verPecas() {
		
		if (this.listaDePecas.size() == 0) {
			
			JOptionPane.showMessageDialog(null, "\nA lista de peças está vazia!");
			
		} else {
		
			for (int i = 0; i < this.listaDePecas.size(); i++) {
				Peca peca = this.listaDePecas.get(i);
				
				JOptionPane.showMessageDialog(null, "\nPeça de índice " + i + ":\n" +
				"\nDescrição: " + peca.getDescricao() +
				"\nPreço: " + peca.getPreco() +
				"\nCor: " + peca.getCor() +
				"\nAltura: " + peca.getAltura() +
				"\nLargura: " + peca.getLargura());
			}
		}
	}
}
