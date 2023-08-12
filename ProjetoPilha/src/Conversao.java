import java.util.Scanner;
import java.util.Stack;


/* ler um valor inteiro e positivo e converter para binário    */

public class Conversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner (System.in);
		Stack<Long> binario = new Stack<>();
		
	Long n;
	
	System.out.println("Digite um valor inteiro positivo: ");
	n = teclado.nextLong();
	
	while(n != 0) {
		binario.push(n%2);
		n = n/2;
		
	}
	
	while (!binario.empty()) {
		
		System.out.print(binario.pop());
		
	}
	
	}

}
