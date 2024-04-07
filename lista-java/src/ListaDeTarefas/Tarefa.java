package ListaDeTarefas;

public class Tarefa {
	
	private String titulo;
	private String descricao;
	private Data vencimento;
	
	Tarefa(String titulo, String descricao, Data vencimento) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.vencimento = vencimento;
	}
	
	//getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Data getVencimento() {
		return vencimento;
	}

	public void setVencimento(Data vencimento) {
		this.vencimento = vencimento;
	}
	
	
}
