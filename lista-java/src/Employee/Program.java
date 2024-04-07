package Employee;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Employee> lista = new ArrayList<>();
		Employee empployee = new Employee(5463, "Rafael", 574.50); //employee significa FUNCIONARIOS
		
		lista.add(empployee); // dessa forma ele vai receber os valores da instancia employee
	
		Employee empployee2 = new Employee(5465, "Rafael", 700.0);
		lista.add(empployee2);
		Employee empployee3 = new Employee(5469, "Rafael", 150.5);
		lista.add(empployee3);		
		System.out.println(lista);
		
		//Colocamos o ID que queremos que o metodo hasId enconte o índice
		Integer idSalary = hasId(lista, 5469);
		Double percent = 10.0;
		
		//Validando se o ID foi encontrado ou não
		Double newSalary;
		if(idSalary == null) {
			System.out.println("Id does not exist"); //sempre tentar colocar as coisas em inglês
		}
		else {
			lista.get(idSalary).increaseSalary(percent);;
		}
		
		for (Employee employee : lista) {
			System.out.println(employee);
		}
	
	}
	//Ele vai atrás do ídice que a matricula está localizada
	public static Integer hasId(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) return i;
		}
		//Pelo fato do método ser Integer, podemos retornar o valor de NULL caso o ID não for encontrado.
		return null;
	}

}
