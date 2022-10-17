package calculos;
import java.util.Scanner;
import java.text.DecimalFormat;
public class resposta9 {
	    Scanner sc = new Scanner(System.in);
	    DecimalFormat df = new DecimalFormat("0.00");
	    public int num;
	    public double n;
	    public double somaT;
	    public double mediaT;
	    public double maiorN;
	    public double menorN;
	    public double nPar;
	    public double nImpar;
	    public int contPar;
	    public int contImpar;
	    public double mediaP;
	    public double pcntI;
	    public resposta9(){
	        num = 0;
	        n = 0;       
	        somaT = 0;
	        mediaT = 0;
	        maiorN = 0;
	        menorN = 0;
	        nPar = 0;
	        nImpar = 0;
	        contPar = 0;
	        contImpar = 0;
	        mediaP = 0;
	        pcntI = 0;
	    }
	    public void calcG(){
	        System.out.println("Quantos números você quer digitar?(Máx. de 30000 algarismos!)");
	        num = sc.nextInt();
	        if(num >= 30000){
	            System.out.print("Quantidade de números excedida!");
	        }
	        else{
	              for(int i = 1; i <= num; i++){
	            System.out.println("Digite um número");
	            n = sc.nextDouble();
	            if(maiorN <= n){
	                    maiorN = n;
	                }
	            if(menorN == 0){
	                    menorN = maiorN;
	                }
	            else if(menorN >= maiorN){
	                    menorN = n;
	                }
	                   
	            if(n % 2 == 0){
	                    nPar = nPar + n;
	                }
	            somaT = somaT+n;
	                if(n % 2 == 0){
	                    contPar++;
	                }
	                else{
	                    contImpar++;
	                }
	        }       
	        if(num < 30000){
	           System.out.println("\n" + "A soma dos números é: " + df.format(somaT)); 
	        }
	        
	        mediaP = nPar/contPar;
	        pcntI = (contImpar * 100)/num;
	        }
	    }
	    public void quantN(){
	        if(num < 30000){
	            System.out.println("\n" + "Foram digitados " + num + " números");
	        }
	    }
	    public void media(){
	        mediaT = somaT/num;
	        System.out.println("\n" + "A média dos números digitados é: " + df.format(mediaT));
	    }
	    public void maior(){
	        System.out.println("\n" + "O maior número digitado foi: " + df.format(maiorN));
	    }
	    public void menor(){
	        System.out.println("\n" + "O menor número digitado foi: " + menorN);
	    }
	    public void numpares(){
	        System.out.println("\n" + "Média dos números pares: " + mediaP);
	    }
	    public void calcPcnt(){
	       System.out.println("\n" + df.format(pcntI) + "% dos números digitados são ímpares");
	    }
}