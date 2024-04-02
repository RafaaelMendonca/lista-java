package SistemaDeVotacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.QualifiedNameable;

public class SistemaDeVotacao {
	private List<String> nomeCandidato = new ArrayList<String>();
	private List<String> partidoPolitico = new ArrayList<String>();
	private List<Integer> resultadoVotacao = new ArrayList<>(nomeCandidato.size());
	private String resultado = null;
	Scanner sc = new Scanner(System.in);
	
	// cadastramento do(s) candidato(s)
	public void cadastrarCandidatoEPartido() {
		
		int quantidadeCandidatos;
		do {
			System.out.println("Quantos candidatos voce deseja cadastrar?");
			quantidadeCandidatos = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < quantidadeCandidatos; i++) {
			    System.out.println("Nome do candidato:");
			    String nome = sc.nextLine();
			    
			    System.out.println("Partido do candidato:");
			    String partido = sc.nextLine();

				//validacao se tem declaracoes vazias
				do {
					if(nome.isEmpty() == true) {
						System.out.println("Nome do candidato:");
						nome = sc.nextLine();						
					}
					if(partido.isEmpty() == true) {
						System.out.println("Partido do candidato:");
						partido = sc.nextLine();	
					}
					
				}while(nome.isEmpty() || partido.isEmpty());
				
				nomeCandidato.add(nome);
				partidoPolitico.add(partido);
				resultadoVotacao.add(0);
			}
			
		}while(quantidadeCandidatos <= 0);
		System.out.println("Concluido!");
	}
	
	//Processamento completo do sistema de votacao
	public void sistemaDeVotacao() {
	    int quantidadeCandidatos = nomeCandidato.size();
	    System.out.println("Em quem você irá votar?");

	    for (int i = 0; i < quantidadeCandidatos; i++) {
	        System.out.println((i+1) + ". " + nomeCandidato.get(i));
	    }
	    String nomeDoCandidato = sc.nextLine();
	    for (int i = 0; i < nomeCandidato.size(); i++) {
			if(nomeCandidato.get(i).equalsIgnoreCase(nomeDoCandidato)) {
				resultadoVotacao.set(i, resultadoVotacao.get(i) + 1);
				break;
			}
		}
	
	    //resultado dos votos
	    for (int i = 0; i < resultadoVotacao.size(); i++) {
	    	int maiorNumero = Integer.MIN_VALUE;
			if(resultadoVotacao.get(i) > maiorNumero) {
				resultado = nomeCandidato.get(i);
			}
		}
	}
	
	//exibir o resultado
	public void resultadoDasVotacoes() {
		System.out.println("Vencedor: " + resultado);
	}
	

}
