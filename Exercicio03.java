import java.util.Scanner;

public class Exercicio03 {
 public static void main(String[] args) {
     
   Scanner input = new Scanner(System.in);
    String nome;
     
   System.out.print("Escreva seu nome:" );
    nome = input.nextLine();
     
   System.out.print("Olá," + nome );
    input.close();
}
}  