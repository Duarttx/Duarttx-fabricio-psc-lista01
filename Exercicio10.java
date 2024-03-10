import java.util.Scanner;
 
public class Exercicio10 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        Double tempFahrenheit = 0.0;
        Double tempCelsius = 0.0;
        
        System.out.print("Informe a teperatura em Farenheit: ");
        tempFahrenheit = input.nextDouble();
        
        tempCelsius = 5 * ((tempFahrenheit - 32)/9);

        System.out.printf("A temperatura informada em Celsius é: %.0fCº", tempCelsius);
        input.close();

        
    }
}