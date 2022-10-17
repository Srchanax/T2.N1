package Times;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Classificação {
	Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    public double peso;
    public double altura;
    public int idade;
    public int idades;
    public double pesos;
    public double porcentagemP;
    double contP, mediaI, mediaA, Alturas;
    int contI;
    public Classificação(){
        contP = 0;
        contI = 0;
        idades = 0;
        Alturas = 0;
    }
    public void Jogadores(){
        System.out.println("Qual o peso do jogador?");
        peso = sc.nextDouble();
        if (peso > 80){
            contP++;
        }
        System.out.println("Qual a sua altura(em metros)? ");
        altura = sc.nextDouble();
        Alturas = Alturas + altura;
        System.out.println("Qual sua idade?");
        idade = sc.nextInt(); 
         
        if(idade < 18){
            contI ++;
        }
        idades = idades + idade;
    }
    public void CalcIdades(int i){
        idades = idades/11;
        System.out.println("A média das idades do " + i + "° time é: " + idades);
        idades = 0;
    }
    public void Escalação(){
     for(int i = 1; i < 6; i++){
            System.out.println("Time " + i);
            for(int j = 1; j < 12; j++){
                System.out.print("\n");
                System.out.println(j + "° Jogador do " + i + "° time");
                Jogadores();  
            }
            CalcIdades(i); 
        }
    }
    public void CalcP(){
        porcentagemP = (contP*100)/55;
        System.out.println("\n"+porcentagemP + "% dos jogadores do campeonato tem mais de 80 kg.");
    }
    public void PrintAge(){
        System.out.print("\n");
        System.out.println("Há " + contI + " jogadores com idade inferior a 18 anos nesse campeonato.");
    }
    public void MediadasAlturas(){
        mediaA = Alturas/55;
        System.out.print("\n");
        System.out.println("A média das alturas dos jogadores deste campeonato é:" + df.format(mediaA) + " metros");
    }

}