package Principal;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner (System.in);
		  double num1 = sc.nextDouble();
		  double num2 = sc.nextDouble();
		  int i = sc.nextInt();
		  System.out.println("/t 1: some os dois números");
		  System.out.println("/t 2: raíz do primeiro número: ");
		  System.out.println("/t 3: raíz do segundo número: ");
		  switch(i) {
		  
		  case 1 :
		   
		   double soma = num1 + num2;
		   System.out.println("A soma dos números é: " + soma);
		   
		  case 2 :
		   
		   double raíz = Math.sqrt(num1);
		   System.out.println("A raíz do número é: " + raíz);
		   
		  case 3 :
		   
		   double raíz2 = Math.sqrt(num2);
		   System.out.println("Araíz do número é: " + raíz2);
		    

		  }
		  }
}

