package escolaheranca;

public class Principal {

	public static void main(String[] args) {
		
		/*
		Registrando um estudante qualquer para um projeto;
		
		Sendo qualquer tipo de estudante necessário, nesse caso, faria sentido criar um objeto polimorfo, a 
		partir da classe Estudante. Esse estudante, receberia a instância de qualquer uma das 3 classes filhas;
		
		Porém, quando se usa polimorfismo, o objeto é criado respeitando os comportamentos da classe mãe.
		*/
		Estudante e;
		
		//e= new EstudanteInCompany();
		//e= new EstudanteGoverno();
		//e= EstudanteParticular();
		
		/*
		Registrando um estudante que faz curso conveniado por uma empresa
		*/
		EstudanteInCompany ec = new EstudanteInCompany();
		
		
		
		

	}

}
