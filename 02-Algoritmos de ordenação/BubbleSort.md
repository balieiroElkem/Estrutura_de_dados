<p align="justify">Em alguns algoritmos de ordenação o fator relevante que determina seu tempo de execução é o número de comprações realizadas. Considerando que o algoritmo foi implementado para um vetor com 5 posições, verifica-se que o número de iterações do primeiro laço é 5. O segundo laço possui 4 iterações, mas como está interno ao primeiro, este será executado 20 vezes (5 x 4). Logo, o número de comprações <i>(apenas o conjunto if)</i> será 20.</p>
<p align="justify">Aplicando a mesma ideia sobre um algoritmo com um vetor de tamanho <i>n</i>, ele realizará <i>n(n-1)=n^2-n</i> comparações.Utilizando uma das notações, pode-se dizer que o tempo de execução do algoritmo <i>BUBBLE SORT<i> é <i>O(n^2)</i>, pois:</p>
```

n^2-n <= c.n^2 , c=1, n >= 1

```

<p align="justify">Nesse algoritmo não há situações melhores ou piores. Qualquer que seja o vetor de entrada, o algoritmo se comportará da mesma maneira, realizando todas as comparações, mesmo que desnecessárias.</p>