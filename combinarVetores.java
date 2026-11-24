
/*Leia os vetores A E B (5 inteiros) Monte C. Com a soma posiçao , e D, com os valores
de A e B intercalados
A: 1 2 3 4 5
B: 10 20 30 40 50
C: 11 22 33 44 55
D: 1 10 2 20 3 30 4 40 5 50*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];
        int[] vetorD = new int[10];

        System.out.println("Digite os valores do primeiro vetor:");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + "º: ");
            vetorA[i] = scanner.nextInt();
        }

        
        System.out.println("\nDigite os valores do segundo vetor:");

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Valor " + (i + 1) + "º: ");
            vetorB[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        // Construção do vetor D (intercalado)
        for (int i = 0; i < vetorA.length; i++) {
            vetorD[2 * i] = vetorA[i];
            vetorD[2 * i + 1] = vetorB[i];
        }

        
        System.out.print("\nVetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.print("\nVetor C (soma): ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        System.out.print("\nVetor D (intercalado): ");
        for (int i = 0; i < vetorD.length; i++) {
            System.out.print(vetorD[i] + " ");
        }

        scanner.close();
    }
}
