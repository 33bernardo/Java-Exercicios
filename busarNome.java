
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int soma = 0;
        String[] nomes = new String[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scann.nextLine();
        }

        System.out.print("Digite o nome para buscar: ");
        String nome = scann.nextLine();

        boolean achou = false;

        for (int i = 0; i < nomes.length; i++) {

            if (nome.equalsIgnoreCase(nomes[i])) {
                achou = true;
                System.out.println("Nome encontrado na posição: " + i);
                soma++;    
            }
        }
        System.out.print(nomes +" aparece "+ soma +" vez(es)");

        if (!achou) {
            System.out.println(nomes + "aparece"+ soma +  "vez(es)");
        }

        scann.close();
    }
}
