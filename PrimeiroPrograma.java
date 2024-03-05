import java.util.Scanner; //importação de biblioteca 

public class PrimeiroPrograma {
  // Ponto de partida do programa;  
     public static void main (String[]args){
         Scanner input = new Scanner(System.in);
            String nome;
              System.out.println("informe seu nome");
                 nome = input.nextLine();
                    System.out.println("O nome informado foi:" + nome);
                              input.close();

}

}