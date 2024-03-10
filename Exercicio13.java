import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        Double valorDaHora;
        Double numeroDeHoras;
        Double salarioBruto;
        Double desconto;
        Double salarioLiquido;

        System.out.print("Digite o valor da suas horas trabalhadas: ");
        valorDaHora = input.nextDouble();

        System.out.print("Digite o número de horas de serviço: ");
        numeroDeHoras = input.nextDouble();
        
        System.out.print("Digite o percentual de desconto do seu INSS: ");
        desconto = input.nextDouble();
        
        salarioBruto = valorDaHora*numeroDeHoras;
        desconto =(desconto/100)*salarioBruto;
        salarioLiquido = salarioBruto - desconto;
        

        System.out.println( "O sálario liquido é equivalente a: " + salarioLiquido );
        input.close();

    } 

}