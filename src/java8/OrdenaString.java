package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import static java.util.Comparator.*;

public class OrdenaString {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		palavras.sort((s1, s2) -> {
		    if (s1.length() < s2.length())
		        return -1;
		    if (s1.length() > s2.length())
		        return 1;
		    return 0;
		});
		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(comparing(String::length));
		
		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s -> s.length();
		
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
		palavras.forEach(System.out::println);
	
	}
}