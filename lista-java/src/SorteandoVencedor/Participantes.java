package SorteandoVencedor;

import java.util.ArrayList;
import java.util.List;

public class Participantes {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList();
		
		nomes.add("Rafael");
		nomes.add("Pedro");
		
		boolean validacao = nomes.contains("Rafael");
		
		if(validacao) System.out.println("Rafael esta aqui");
		else System.out.println("Rafael não está aqui");
	}

}
