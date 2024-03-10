import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        Double combustivelConsumido;
        double kmPorLitro;
        double kmPercorrido;

        System.out.print("Digite quantos kilômetros foram percorridos: ");
        kmPercorrido = input.nextDouble();

        System.out.print("Digite a quantidade de combustível consumida:");
        combustivelConsumido = input.nextDouble();

        kmPorLitro = kmPercorrido/combustivelConsumido;
        
        System.out.println("O consumo médio foi de " + (kmPorLitro) + " Kilomêtros por litro ");

        input.close();

    } 
 } 