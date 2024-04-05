package MediaDosElementos;

import java.util.List;

public class CalcularMedia {
	
	private double media = 0.0;

	public double calcularMedia(List<Double> numeros) {
		for (Double numero : numeros) {
			media += numero;
		}
		return media / numeros.size();
	}
}
