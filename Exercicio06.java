import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
         Double idade = 0.0;
         Double diasviv = 0.0;
         Double dias = 365.0;


         System.out.print("Informe sua idade: ");
         idade = input.nextDouble();

         diasviv = idade * dias;
     
         System.out.println("A quantidade de dias vividos foram: " + diasviv);
         input.close();
    
    }
}
