package SistemaDeControle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GerenciadorDeEstoque estoque = new GerenciadorDeEstoque();
		List<Produto> listar = new ArrayList();

		int opcao;
		do {
			System.out.println("Gerenciador de estoque");
			System.out.println("1- adicionar produto");
			System.out.println("2- remover produto");
			System.out.println("3- buscar produto");
			System.out.println("4- listar produtos salvos");
			System.out.println("5- encerrar sistema");
			opcao = sc.nextInt();
			sc.nextLine(); // Limpar o buffer do scanner

			boolean validandoAsEtapas = false; // vai servir para tratativa de erro caso o usuario pule etapas
			switch (opcao) {
			case 1:
				// Adicionar produto
				String nomeProduto = null;
				int codigo = 0;
				int quantidade = 0;
				double preco = 0;
				do {
					System.out.println("Quantos produtos você deseja adicionar?");
					int quantidadeDeproduto = sc.nextInt();
					sc.nextLine();
					for (int i = 0; i < quantidadeDeproduto; i++) {
						System.out.println();
						System.out.println("Nome do produto:");
						nomeProduto = sc.nextLine();
						System.out.println("Código do produto:");
						codigo = sc.nextInt();
						System.out.println("Quantidade do produto:");
						quantidade = sc.nextInt();
						System.out.println("Preco do produto:");
						preco = sc.nextDouble();
						sc.nextLine();
					}
					Produto produto = new Produto(codigo, nomeProduto, quantidade, preco);
					estoque.adicionarProduto(produto);
					validandoAsEtapas = true;

				} while (nomeProduto.isEmpty() || codigo <= 0 || quantidade <= 0 || preco <= 0);
				break;
			case 2:
				// Remover Produto
				if (validandoAsEtapas == false) {
					break;
				}
				System.out.println("Digite o codido do produto a qual voce deseja" + " remover");
				codigo = sc.nextInt();
				boolean removido = estoque.removerProduto(codigo);
				if (removido) {
					System.out.println("Produto removido");
				} else {
					System.out.println("Código não encontrado");
				}
				break;
			case 3:
				// Buscar produto
				System.out.println("Pesquise o código do produto que você deseja buscar");
				codigo = sc.nextInt();
				for (int i = 0; i < listar.size(); i++) {
					if (listar.get(i).getCodigoProduto() == codigo) {
						System.out.println("Codigo: " + listar.get(i).getCodigoProduto());
						System.out.println("Nome: " + listar.get(i).getNomeProduto());
						System.out.println("Quantidade: " + listar.get(i).getQuantidadeProduto());
						System.out.println("Preço: " + listar.get(i).getPrecoProduto());
						int opcaoParaAlterar;
						System.out.println("1- alterar quantidade");
						System.out.println("2- alterar preço");
						System.out.println("3- não alterar");
						opcaoParaAlterar = sc.nextInt();
						if (opcaoParaAlterar == 1) {
							System.out.println("Qual a nova quantidade?");
							int novaQuantidade = sc.nextInt();
							if (novaQuantidade > 0) {
								listar.get(i).setQuantidadeProduto(novaQuantidade);
								;
							} else {
								System.out.println("Quantidade inválida");
							}
						} else if (opcaoParaAlterar == 2) {
							System.out.println("Novo preço:");
							double novoPreco = sc.nextDouble();
							if (novoPreco <= 0) {
								listar.get(i).setPrecoProduto(novoPreco);
							} else {
								System.out.println("Preço inválido");
							}
						} else if (opcaoParaAlterar == 3) {
							System.out.println("Produto não alterado");
						}
						break;
					}
				}
				break;
			case 4:
				// Listar produto
				listar = estoque.listarProdutos();
				for (int i = 0; i < listar.size(); i++) {
					System.out.println();
					System.out.println("Codigo: " + listar.get(i).getCodigoProduto());
					System.out.println("Nome: " + listar.get(i).getNomeProduto());
					System.out.println("Quantidade: " + listar.get(i).getQuantidadeProduto());
					System.out.println("Preço: " + listar.get(i).getPrecoProduto());
				}
				break;
			default:
				System.out.println("Sistema encerrado");
				break;
			}
		} while (opcao != 5);
		sc.close();
	}
}