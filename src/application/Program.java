package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Program {
	
	public static void main (String[] args) {
		
		List<String> list = new ArrayList<>();//Lista tipo inteiro (USAR WRAPPER CLASS)
		
		list.add("Maria");// add elementos
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		for (String x : list) {
			System.out.println(x);
			}
		System.out.println("-----------");
		
		
		list.add(2, "Marco"); //add na posição 2
		for (String x : list) {
			System.out.println(x);
			}
		System.out.println("-----------");
		
		System.out.println(list.size());
		
		list.remove("Anna"); // remoção
		list.remove(1);// remoção por posição
		for (String x : list) {
			System.out.println(x);
			}
		System.out.println("-----------");
		
		list.removeIf(x -> x.charAt(0)=='M');//remoção por predicado
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("-----------");
		
		
		System.out.println("Index of Bob:"+list.indexOf("Bob"));//encontrar por posição
		System.out.println("Index of Marco:"+list.indexOf("Bob"));//encontrar por posição que não existe = -1
		System.out.println("-----------");
		
		
		list.add("Maria");// add elementos
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //add na posição 2
		
		for (String x : list) {
			System.out.println(x);
			}
		System.out.println("-----------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());//só com a letra A 
		for (String x : result) {
			System.out.println(x);
			}
		System.out.println("-----------");
		
		String name = list.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);//trazer o primeiro elemento com A ou retornar Null
		System.out.println(name);
		System.out.println("-----------");
		
		name = list.stream().filter(x -> x.charAt(0)=='J').findFirst().orElse(null);//trazer o primeiro elemento com J ou retornar Null
		System.out.println(name);
	}

}
