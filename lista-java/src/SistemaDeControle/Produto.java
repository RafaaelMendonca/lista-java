package SistemaDeControle;

public class Produto {
	private int codigoProduto;
	private String nomeProduto;
	private int quantidadeProduto;
	private double precoProduto;
	

	
	public Produto(int codigoProduto, String nomeProduto, int quantidadeProduto, double precoProduto) {
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.precoProduto = precoProduto;
	}

	
	//Getters e Setters
	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}


}
