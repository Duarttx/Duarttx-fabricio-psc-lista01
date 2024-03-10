import java.util.Scanner;

public class Exercicio04{
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String nome;
        
        System.out.print("Informe seu nome"); 
        nome = input.nextLine();

        String endereco;
        System.out.print("informe seu endereco");
        endereco = input.nextLine();
        
        int numero;
        System.out.println("informe seu telefone");
        numero = input.nextInt();
    

        System.out.println(" seu nome é:" + nome);
        System.out.println("Seu endereço é:" + endereco);
        System.out.println("Seu telefone é:" + numero);

       input.close();
 


    }
}