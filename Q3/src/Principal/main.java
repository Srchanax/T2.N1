package Principal;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double a, b, c, delta,r1,r2;
	    System.out.println("Digite o valor de a:");
	    a = sc.nextDouble();
	    System.out.println("Digite o valor de b:");
	    b = sc.nextDouble();
	    System.out.println("Digite o valor de c:");
	    c = sc.nextDouble();
	    System.out.println(a + "x² +" + b + "x +"  + c);
	    delta = (b*b) - (4*a*c);
	    if(delta == 0){ 
            System.out.println("A equação fornecida apresenta duas raízes reias iguais"); 
            r1 = r2 = ((-b + Math.pow(delta,0.5))/2 * a); 
            System.out.println("que são respectivamente : "+ r1 +" e "+ r2+"!"); 
        } 
        else if(delta >=1){ 
            System.out.println("A equação fornecida apresenta duas raízes reais e distintas"); 
            r1 = ((-b + Math.pow(delta,0.5))/2*a); 
            r2 = ((-b - Math.pow(delta,0.5))/2*a); 
            System.out.println("que são respectivamente : "+ r1 +" e "+ r2 +"!"); 
        } 
        else{ 
            System.out.println("A equação fornecida não apresenta raízes reais(R)!");
        }
	        
	    

	}

}
