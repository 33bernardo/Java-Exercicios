
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] valores = new int[4][3];

        for (int i = 0; i < valores.length; i++) {
            for (int y = 0; y < valores[i].length; y++) {

                System.out.print("Digite um valor: ");
                valores[i][y] = scan.nextInt();
            }
        }

        int maior = valores[0][0];
        int menor = valores[0][0];

        for (int z = 0; z < valores.length; z++) {
            for (int x = 0; x < valores[z].length; x++) {

                if (valores[z][x] > maior) {
                    maior = valores[z][x];
                }

                if (valores[z][x] < menor) {
                    menor = valores[z][x];
                }
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scan.close();
    }
}
