import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner coleta = new Scanner(System.in);
        System.out.println("*Mostra Quantidade de  pares,ímpares e soma*");
        /* Declara o vetor de inteiros
            e reserva 10 posições (0 a 9) */
        int[] vetor = new int [10];
        int pares = 0, impares = 0, soma = 0;

        /* Primeiro for para coletar 10 vezes o que o usuário digitou*/
        for(int i=0;i <vetor.length;i++){
            System.out.print("Digite os valores: ");
            vetor[i] = coleta.nextInt();

            if (vetor[i] % 2 == 0){
                pares++;
                //pares = pares + 1
         }else{
                impares++;
                //ímpares = ímpares + 1
         }
            soma +=vetor[i];
            //soma = soma + vetor[i]
        }
        
         coleta.close();

         System.out.print("Valores digitados: ");
         /* Segundo for para exibir o que o usuário digitou. Está fora do primeiro for*/
         for (int x=0; x < vetor.length; x++){
            System.out.print(+vetor[x]+" ");
         }

        System.out.println();
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Soma: " + soma);
         
    }
    
}