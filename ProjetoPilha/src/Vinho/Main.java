package Vinho;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		// declaração de variaveis
		Stack<vinhos> adega = new Stack<>();
		Stack<vinhos> aux = new Stack<>();
		// inserir 7 vinhos na adega
		adega.push(new vinhos ("Margeaux", 2000));
		adega.push(new vinhos ("Mouton", 1976));
		adega.push(new vinhos ("Petrus", 1945));
		adega.push(new vinhos ("Hermitage", 2002));
		adega.push(new vinhos ("Père et Fils", 2010));
		adega.push(new vinhos ("Clos", 2018));
		adega.push(new vinhos ("Alberone", 2021));
		
		// vinho para abrir em uma ocasião especial
		System.out.println("Vinho para abrir em uma ocasião especial");
		System.out.println(adega.peek());
		
		// 5 vinhos mais antigos da adega
		System.out.println();
		System.out.println("vinhos mais antigos");
		while(adega.size() > 5) {
			aux.push(adega.pop());
	}
		while(!adega.empty()) {
			System.out.println(adega.peek());
			aux.push(adega.pop());
		}
		//voltando as garrafas para adega
		while(!aux.empty()) {
			adega.push(aux.pop());
		}
  }
}
