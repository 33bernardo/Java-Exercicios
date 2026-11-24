
public class Main {

    public static void main(String[] args) {

        int[] numeros = {4, 7, 4, 2, 9, 7, 7, 1, 2, 5};

        int removidos = 0;

        System.out.println("Números originais:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nSem repetidos:");

        for (int i = 0; i < numeros.length; i++) {

            boolean repetido = false;

            for (int x = 0; x < i; x++) {

                if (numeros[i] == numeros[x]) {
                    repetido = true;
                    removidos++;
                    break;
                }
            }

            if (!repetido) {
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println("\n\nQuantidade removida: " + removidos);
    }
}
