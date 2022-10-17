package Principal;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		    int num = sc.nextInt();
		    System.out.println("Por favor digite um número: ");
		    if(num % 2 == 0) {
		     System.out.println("O número é par ");
		   }
		    else {
		     System.out.println("O númro é ímpar");
		    }
	}
}
