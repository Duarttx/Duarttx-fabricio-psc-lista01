import java.util.Scanner;

public class Exercicio11{
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        Double nota1 = 0.0;
        Double nota2 = 0.0;
        Double nota3 = 0.0;
        Double media = 0.0;


        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println( "A média das notas é: " + media );
        input.close();

    } 

}