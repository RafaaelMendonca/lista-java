package SistemaDeVotacao;

public class Main {
	public static void main(String[] args) {
		SistemaDeVotacao cadastro = new SistemaDeVotacao();
		
		cadastro.cadastrarCandidatoEPartido();
		cadastro.sistemaDeVotacao();
		cadastro.sistemaDeVotacao();
		cadastro.sistemaDeVotacao();
		
		cadastro.resultadoDasVotacoes();
	}
}
