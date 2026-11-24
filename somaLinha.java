
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] notas = new int[3][2];
        int total = 0;

    
        for (int i = 0; i < notas.length; i++) {

            for (int z = 0; z < notas[i].length; z++) {

                System.out.print("Digite a nota do aluno " + (i + 1) +
                                 ", disciplina " + (z + 1) + ": ");

                notas[i][z] = scan.nextInt();
            }
        }

        // Soma das notas de cada aluno
        for (int i = 0; i < notas.length; i++) {

            int soma = 0;

            for (int x = 0; x < notas[i].length; x++) {
                soma += notas[i][x];
            }

            System.out.println("Soma do aluno " + (i + 1) + ": " + soma);

            total += soma;
        }

        
        System.out.println("Total geral: " + total);

        scan.close();
    }
}
