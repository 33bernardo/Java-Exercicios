import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaneia = new Scanner(System.in);

        int[][] diagonais = new int[4][4];

        for (int i = 0; i < diagonais.length; i++) {

            System.out.print("Digite os 4 números da linha " + (i + 1) + ": ");

            for (int x = 0; x < diagonais[i].length; x++) {
                diagonais[i][x] = escaneia.nextInt();
            }
        }

        System.out.println("\nMatriz digitada:");

        for (int z = 0; z < diagonais.length; z++) {

            for (int s = 0; s < diagonais[z].length; s++) {
                System.out.print(diagonais[z][s] + "\t");
            }

            System.out.println();
        }

        int principal = 0;
        int secundaria = 0;

        for (int i = 0; i < diagonais.length; i++) {

            principal += diagonais[i][i];

            secundaria += diagonais[i][diagonais.length - 1 - i];
        }

        System.out.println("Soma da diagonal principal: " + principal);
        System.out.println("Soma da diagonal secundária: " + secundaria);

        escaneia.close();
    }
}