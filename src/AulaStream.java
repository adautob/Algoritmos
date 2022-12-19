
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AulaStream {

	public static void main(String[] args) {
		

		//Declaração da lista
		List<Integer> lista = Arrays.asList(2,3,5,6,8,4);
				
		// usando map para multiplicar cada elemento da lista por 3
		List<Integer> novaLista = lista.stream().map(x -> x * 3).collect(Collectors.toList());
		
		System.out.println("Lista inicial");
		lista.forEach(System.out::print);
	
		System.out.println();
	
		System.out.println("map para fazer uma multiplicação dos elementos da lista");
		novaLista.forEach(System.out::print);
		
		// usando filter para filtrar os elementos pares
		List<Integer> listaPares = lista.stream().filter(x -> x%2==0).collect(Collectors.toList());
		
	
		System.out.println();
		System.out.println("Filter para filtrar os pares");
		listaPares.forEach(System.out::print);
	
		// usando reduce para somar os elementos da lista
		Integer listaSoma = lista.stream().reduce(0, (x, y) -> x + y);
		
		System.out.println();
		System.out.println("Reduce somando com lambda");
		System.out.println(listaSoma);
		
		Integer listaSoma2 = lista.stream().reduce(0, Integer::sum);
		
		System.out.println("Reduce somando com reference method");
		System.out.println(listaSoma2);

	}

}
