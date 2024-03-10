import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     Double cotDolar = 4.95;
     Double dolar = 0.0;
     Double real = 0.0;

     System.out.print("Informe o valor em dolar: ");
     dolar = input.nextDouble();

     real = cotDolar * dolar;
     
     System.out.println("O valor em real é: " + real );
     input.close();           
    
    }  
      
}       
 