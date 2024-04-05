package MediaDosElementos;

public class Main {
	public static void main(String[] args) {
		ListaNumeros numeros = new ListaNumeros();
		
		numeros.adicionarNumeros(5);
		numeros.adicionarNumeros(10);
		numeros.adicionarNumeros(10);
		numeros.adicionarNumeros(6);
		numeros.adicionarNumeros(7);
		
		CalcularMedia calcular = new CalcularMedia();
		final double MEDIA = calcular.calcularMedia(numeros.getNumeros());
		
		System.out.printf("%.2f", MEDIA);
	}
}
