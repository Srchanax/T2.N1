package Principal;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int num,n,fat;
        System.out.println("Deseja saber a fatorial de quantos números?");
        n = sc.nextInt();
        for(int i = 1;i<=n;i++) {
            System.out.println("\n"+"Digite um numero: ");
            num = sc.nextInt();
            System.out.print("\n");
            fat = 1;
            if (num < 4){
                fat = num;
            }
            for(int j = 1; j<=num; j++) {
                fat = fat * j;
            }
            System.out.println("\n"+"A fatorial deste número é: "+fat);
        }
    }

	}


