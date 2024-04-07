package SistemaDeControle;

import java.util.ArrayList;
import java.util.List;

import ListaDeTarefas.Tarefa;

public class GerenciadorDeEstoque {
	private List<Produto> produtos;
	
	public GerenciadorDeEstoque() {
		produtos = new ArrayList();
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public boolean removerProduto(int codigo) {
		for(int i = 0; i < produtos.size(); i++) {
			if(produtos.get(i).getCodigoProduto() == codigo) {
				produtos.remove(i);
				return true;
			}
		}
		return false;		
	}
	
	public boolean atualizarQuantidade(int codigo, int quantidade) {
		for(int i = 0; i < produtos.size(); i++) {
			if(produtos.get(i).getCodigoProduto() == codigo) {
				produtos.get(i).setQuantidadeProduto(quantidade);
				return true;
			}
		}
		return false;
	}
	
	public String buscarProduto(int codigo) {
		for(int i = 0; i < produtos.size(); i++) {
			if(produtos.get(i).getCodigoProduto() == codigo) {
				return "Produto: " + produtos.get(i).getNomeProduto() +
						"\nCodigo do Produto: " + produtos.get(i).getCodigoProduto() +
						"\nQuantidade do Produto: " + produtos.get(i).getQuantidadeProduto() +
						"\nPreço do Produto: " + produtos.get(i).getPrecoProduto();	
			}
		}
		return null;
	}
	
	public List<Produto> listarProdutos(){
		return produtos;
	}
	
}
