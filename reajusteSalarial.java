
/*Leia os salários de 5 funcionários em um vetor. Dê 10% de aumento apenas para quem ganha
menos de R$ 2.000,00 e mostre os salários atualizados.*/
import java.util.Scanner;
import java.util.Locale; //Regional

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.forLanguageTag("pt-BR")); // configuração regional. Posso digitar 1500 ou 1.500
    

        double[] salarios = new double[5];

        System.out.println("$--Reajuste Salarial--$");

        // Leitura dos salários
        for (int x = 0; x < salarios.length; x++) {
            System.out.print("Digite o salário " + (x + 1) + ": "); //x+1 mostra a sequência para digitar os salarios
                salarios[x] = scanner.nextDouble();
        }

        // Salários sem aumento
        System.out.println("\nSalários sem ajustes:");

        for (int x = 0; x < salarios.length; x++) {
            if (salarios[x] >= 2000) {
                System.out.printf("R$ %.2f%n", salarios[x]);
            }
        }

        // Salários com aumento
        System.out.println("\nSalários com ajustes:");

        for (int x = 0; x < salarios.length; x++) {
            if (salarios[x] < 2000) {

                double novo = salarios[x] * 1.10;

                System.out.printf(
                    "Salário anterior: R$ %.2f | Com aumento: R$ %.2f%n",
                    salarios[x], novo
                    //Fechando o print dessa forma, para caber na tela.
                );
            }
        }

        scanner.close();
    }
}
