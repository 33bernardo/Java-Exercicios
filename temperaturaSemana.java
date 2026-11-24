/*Leia a temperatura de cada dia da semana (Domingo a Sábado). Mostre a média, os dias acima
da média e o dia mais quente.
Entrada: 22,5 25 27,5 21 19,5 24 28
Média da semana: 23,9 °C
Dias acima da média:
Segunda (25,0 °C)
Terça (27,5 °C)
Sexta (24,0 °C)
Sábado (28,0 °C)
Dia mais quente: Sábado (28,0 °C)
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.forLanguageTag("pt-BR"));//aceita vírgulas

        String[] semanas = {
            "Domingo", "Segunda", "Terça",
            "Quarta", "Quinta", "Sexta", "Sábado"
        };

        double[] temperaturas = new double[7];
        double soma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(semanas[i] + ", digite a temperatura: ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;
        System.out.printf("%nMédia da semana: %.1f °C%n", media);

        System.out.println("Dias acima da média:");
        int temperaturaMaior = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.printf("%s (%.1f °C)%n", semanas[i], temperaturas[i]);
            }
            if (temperaturas[i] > temperaturas[temperaturaMaior]) {
                temperaturaMaior = i;
            }
        }

        System.out.printf("Dia mais quente: %s (%.1f °C)%n",
                semanas[temperaturaMaior], temperaturas[temperaturaMaior]);

        scanner.close();
    }
}