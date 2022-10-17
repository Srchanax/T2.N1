package Menu;
import java.util.Scanner;
public class Interface {
	 Scanner sc = new Scanner(System.in);
	    public double salario;
	    public double novosal;
	    public double quantS;
	    public int valorimposto;
	    public double imposto;   
	    int opção;
	    public Interface(){
	        salario = 0;
	        novosal = 0;
	        quantS = 0;
	        valorimposto = 0;
	        imposto = 0;
	    }
	    public void menu(){
	        System.out.println("Menu de opções");
	        System.out.print("\n");
	        System.out.println("1: Imposto");
	        System.out.println("2: Novo salário");
	        System.out.println("3: Classificação");
	        System.out.println("4: Sair");
	    }
	    public void imposto(){
	        System.out.println("Digite o seu salário:");
	        salario = sc.nextDouble();
	        if(salario < 500.00){
	            valorimposto = 5;
	        }
	        else if(salario >= 500.00 && salario <= 850.00){
	            valorimposto = 10;
	        }
	        else {
	            valorimposto = 15;
	        }
	        imposto = (valorimposto * salario)/100;
	        System.out.println("\n" + "O valor do seu imposto é: " + imposto);
	    }
	    public void novosalario(){
	        System.out.println("Digite o seu salário:");
	        salario = sc.nextDouble();
	        if(salario > 1500){
	            quantS = 25;
	        }
	        else if((salario <= 1500) & (salario >= 750)){
	            quantS = 50;
	        }
	        else if((salario <= 750) & (salario >= 450)){
	            quantS = 75;
	        }
	        else {
	            quantS = 100;
	        }
	        novosal = salario + quantS;
	        System.out.println("\n" + "Seu novo salário é: " + novosal);
	    }
	    public void remuneração(){
	        System.out.println("Digite seu salário:");
	        salario = sc.nextDouble();
	        if(salario <= 750){
	            System.out.println("\n" + "Você é mal remunerado :(");
	        }
	        else{
	            System.out.println("\n" + "Você é bem remunerado :)");
	        }
	    }
	    
	    public void paginainicial(){
	        do{
	            menu();
	            opção = sc.nextInt();
	            switch(opção){
	                case 1:
	                    imposto();
	                    System.out.print("\n");
	                    break;
	                case 2:
	                    novosalario();
	                    break;
	                case 3:
	                    remuneração();
	                    break;
	                case 4:
	                    break;
	                default:
	                    System.out.println("Opção inválida >:(");
	            }
	            
	        }while(opção != 4);
	        
	    }
}
