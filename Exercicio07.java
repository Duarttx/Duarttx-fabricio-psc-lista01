import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        Double salario = 0.0;
        Double reajustesalario = 0.0;

        System.out.print("Informe o seu salario ( sem ponto ): ");
        salario = input.nextDouble();
        
        reajustesalario = salario + (salario * 0.07);

        System.out.println("Seu salario reajustado é: " + reajustesalario );
        input.close();
    
    
    }
}

