package Principal;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a;
	    System.out.printf("Digite um número inteiro maior que 1: ");
	    a = sc.nextInt();   
	    if (Primo(a)){
	    System.out.println("É primo");
	}
	    else {
	    System.out.println("Não é primo");
	    }
	}
	   
	private static boolean Primo(int numero) {
		for (int j = 2; j < numero; j++) {
	    	if (numero % j == 0)
	    	return false;   
	    }
	    return true;
	    }    
		}