import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
       Double valorA;
       Double valorB; 
       Double primeiroResultado;
       Double segundoResultado;


        System.out.print("Digite o valor A: ");
        valorA = input.nextDouble();

        System.out.print("Digite o valor B: ");
        valorB = input.nextDouble();
     
        primeiroResultado = valorB;
        segundoResultado = valorA;
        
        System.out.println( " O valor de A passou a ser: " + primeiroResultado + " E o valor de B passou a ser: " + segundoResultado );
        input.close();

    } 
 } 