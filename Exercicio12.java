import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        Double valor;
        Double subValor;
        Double adValor;

        System.out.print(" informe o valor: ");
        valor = input.nextDouble();

        subValor = valor - 1;
        adValor = valor + 1;

        System.out.println( "O valor sucessor é: " + adValor + " e o valor antecessor é: " + subValor );
        input.close();

    }

}