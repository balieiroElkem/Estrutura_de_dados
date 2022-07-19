import java.util.*;

/**
 * O bubble pega cada valor que está contido no vetor e
 * faz um comparação um a um até todo o vetor está ordeanado
 */

public class BubbleSort {
    public static void main(String[] args) {
        int x[] = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < x.length; ++i) {
            System.out.printf("Digite o '%d' número: ", i+1);
            x[i] = input.nextInt();
        }

        /**
         * Ordenando de forma crescente
         */
        for (int i = 0; i <= x.length; ++i) {
            for (int j = 0; j < x.length-1; j++) {
                if (x[j] > x[j+1]) {
                    int aux = x[j];
                    x[j] = x[j+1];
                    x[j+1] = aux;
                }
            }
        } 

        // Imprime o vetor ordenado na tela
        for (int i = 0; i < x.length; ++i) {
            System.out.printf("%d\t", x[i]);
        }
        
        input.close();
    }
}