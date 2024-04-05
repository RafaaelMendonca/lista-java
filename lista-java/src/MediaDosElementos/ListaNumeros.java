package MediaDosElementos;

import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
	private List<Double> numeros;
	
	public ListaNumeros() {
		numeros = new ArrayList<>();
	}
	
	public void adicionarNumeros(double numero) {
		numeros.add(numero);
	}
	
	public List<Double> getNumeros(){
		return numeros;
	}
}
