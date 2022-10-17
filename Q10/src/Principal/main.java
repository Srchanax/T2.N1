package Principal;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int numero;
	      int a;
	         System.out.println("Escolha a tabuada de um número de 1 a 10: " );
	         numero = sc.nextInt();
	         System.out.println("Aqui está a tabuada do número " +numero);
	         for ( a=1; a<=10; a++) {
	            System.out.println(""+numero+" X "+a+" = " + (a*numero));
	         }
	     }
	}