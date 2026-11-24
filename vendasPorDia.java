
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaneia = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {

            System.out.print("Digite a quantidade de vendas do "
                    + (i + 1) + " Funcionário: ");

            for (int x = 0; x < matriz[i].length; x++) {
                matriz[i][x] = escaneia.nextInt();
            }
        }

        int total = 0;
        int maior = matriz[0][0];

        for (int u = 0; u < matriz.length; u++) {

            for (int z = 0; z < matriz[u].length; z++) {

                total += matriz[u][z];

                if (matriz[u][z] > maior) {
                    maior = matriz[u][z];
                }
            }
        }

        System.out.println("Total de vendas de todos os funcionários: " + total);
        System.out.println("Maior número de vendas: " + maior);

        
        int maiorDia = 0;
        int vendeuMuito = 0;

        for (int dia = 0; dia < matriz[0].length; dia++) {

            int totalDia = 0;

            for (int funcionario = 0; funcionario < matriz.length; funcionario++) {

                totalDia += matriz[funcionario][dia];
            }

            System.out.println("Total vendido no dia " + (dia + 1) + ": " + totalDia);

            if (totalDia > maiorDia) {
                maiorDia = totalDia;
                vendeuMuito = dia + 1;
            }
        }

        System.out.println("Dia com maior venda: " + vendeuMuito);
        System.out.println("Total vendido nesse dia: " + maiorDia);

        escaneia.close();
    }
}
