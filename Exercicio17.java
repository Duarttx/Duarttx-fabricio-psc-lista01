import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,##00.00");

    Double canetas = 0.0;
    Double valorPago = 0.0;
    Double troco = 0.0;
    Double valorPagoPorCaneta;
    

    System.out.print("Digite a quantidade de canetas compradas: ");
    canetas = input.nextDouble();
    
    System.out.print("Valor pago pelas canetas: ");
    valorPago = input.nextDouble();
    
    System.out.print("Troco recebido: ");
    troco = input.nextDouble();
    
    valorPagoPorCaneta = (valorPago - troco) / canetas;
    
    System.out.print("Valor pago por cada caneta foi: R$ " + df.format(valorPagoPorCaneta));
    

    }
}