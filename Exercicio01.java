import java.util.Scanner;
 
 public class Exercicio01 {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
         Float num1, num2;
           System.out.print("informe um número:");
              num1 = input.nextFloat();
                System.out.print("informe o segundo número:");
              num2 = input.nextFloat();
              System.out.println("A soma é: 10" + (num1+ num2) );  
              input.close();        
 }
    
}
