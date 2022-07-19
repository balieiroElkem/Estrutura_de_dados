#include <stdio.h>

#define MAX 5

int
main(void) {
    int x[MAX];

    for (int i = 0; i < MAX; ++i) {
        printf("Digite o %d número: ", i+1);
        scanf("%d", &x[i]);
    }


    // Ordenando o vetor em ordem crescente
    for (int i = 0; i <= MAX; ++i) {
        for (int j = 0; j < MAX-1; ++j) {
            if (x[j] > x[j+1]) {
                int aux = x[j];
                x[j] = x[j+1];
                x[j+1] = aux;
            }
        }
    }


    // Exibe o vetor na tela
    for (int i = 0; i < MAX; ++i) {
        printf("%d\t", x[i]);
    }

    return 0;
}