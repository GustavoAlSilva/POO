package versao3;

import java.util.ArrayList;

public class MinhaLista {

	private ArrayList<Filme> listaFilmes = new ArrayList<Filme>();

	public void adicionarFilme(Filme filme) {
		
		this.listaFilmes.add(filme);
	}
	
	public String verFilmes() {
		String todosOsFilmes = "Filmes adicionados \n";
		
		for(Filme f : this.listaFilmes) {
			todosOsFilmes += "\nTítulo "+f.getTitulo()+"\n"+
					"Duração "+f.getDuracao()+"\n"+
					"Gênero "+f.getGenero()+"\n"+
					"Classificação "+f.getClassIndicativa();
		}
		
		return todosOsFilmes;
		
	}
	
}
