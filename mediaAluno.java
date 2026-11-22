import java.util.Scanner;

/*Leia as notas de 5 alunos em um vetor. Mostre a média da turma, quantos foram aprovados
(nota ≥ 7) e quantos foram reprovados.*/
public class Main {

    public static void main(String[] args) {
        Scanner coleta = new Scanner(System.in);
        double[] alunos = new double[5]; //declara um vetor de double e cria espaço para 5 posições (índices 0 a 4)
        int aprovados = 0, reprovados = 0; //variáveis int, porque são apenas contadores
        double total = 0;

        System.out.print("\n!Média dos alunos!\n");
        

        for (int i = 0; i < alunos.length; i++){
            System.out.print("Digite as notas: ");
            alunos[i] = coleta.nextDouble();

            total += alunos[i]; //mesma coisa que total = total + alunos[i]
            if (alunos[i] >= 7){
                aprovados++;
            }else{
                reprovados++;
            } 

        }
        coleta.close();

        double media = total / alunos.length; //divide pelo tamanho do vetor

        System.out.printf("Média das nota: %.2f",media);//arredondamento com %.2f
        System.out.print("\nAprovados: "+aprovados);
        System.out.print("\nReprovados: "+reprovados);
        System.out.println(); //apenas para pular uma linha

    }
}
//8 6,5 7 9 5