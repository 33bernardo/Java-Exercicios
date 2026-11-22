import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("'==PROGRAMA PARA SOMAR DOIS VALORES=='");
        Scanner coleta = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int primeiro = coleta.nextInt();
        System.out.print("Digite o segundo valor: ");
        int segundo = coleta.nextInt();
        int total = primeiro + segundo;

        System.out.println("A soma dos valores será: "+total );

        coleta.close();
    }
        
}