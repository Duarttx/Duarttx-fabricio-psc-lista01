import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        Double metros = 0.0;
        Double centimetros = 0.0;

        System.out.print(" Digite a medida em metros: ");
        metros = input.nextDouble();

        centimetros = metros * 100;

        System.out.println(" A medida em centimetros deste valor é:  " + centimetros);
        input.close();
    
    }
}