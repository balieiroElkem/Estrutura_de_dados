# Complexidade de algoritmos

<p align="justify">Para criar ou utilizar um algoritmo é importante determinar o seu desempenho. Todo algoritmo é projetado para executar uma determinada função e, para isso, ele utiliza uma quantidade de memória e gasta um determinado tempo.</p>

<p align="justify">A resolução de um problema pode requerer difentes algoritmos, por isso, é necessário analisar qual deles é mais eficiente em diversos aspectos, como os citados anteriormente: memória utilizada e tempo gasto para executá-lo.</p>

### Estrutura de dados
<p align="justify">Durante o processo de computação de sua saída, um algoritmo manipula dados obtidos de sua entrada. Quando os dados são dispostos e manipulados de forma homogênea, constituem um <i><strong>tipo abstrato de dados</strong></i>.</p>

<p align="justify">Segundo Pereira(1996), um tipo abstrato de dados é formado por um conjunto de valores e por uma série de funções que podem ser aplicados sobre esses valores. Funções e valores, em conjunto, constituem um modelo matemático que pode ser empregado para 'modelar' e solucionar problemas do mundo real, especificando as características relevantes dos elementos envolvidos no problema, de que modo eles se realcionam e como podem ser manipulados. </p>

### O que é análise de algoritmos?
<p align="justify">O projeto de um algoritmo deve considerar o desempenho que este terá após uma implementação. Quando um problema é estudado e um projeto de algoritmo deve ser feito, várias soluções pode surgir, e aspectos de tmepo de execução e espaço ocupado são pontos muito relevantes. </p>

<p align="justify">Segundo Cormen (2002), analisar um algoritmo significa prever os reursos de que ele necissitará. Em geral, memória, largura de banda de computação ou <i>hardware</i> de computação são a preocupação primordial, mas frequentemente é o tempo de coputação que se deseja medir. </p>

Para Knuth (apud Ziviani, 1971), a área de análise de algoritmos possui dois tipos de problemas distintos:
   * [Análise de um algoritmo particular:]
      > "Calcula o custo de um determinado algoritmo na resolução de um problema específico. Geralmente, algumas características devem ser investigadas, como o número de vezes que cada parte do algoritmo será exectuada e quantidade de memória necessária."
   * [Análise de um classe de algoritmos:]
      > "Considerando um problema em particular, determinar o algoritmo de menor custo possível para resolvê-lo. Logo, um conjunto de algoritmos para resolver um problema específico é estudado com o propósito de determinar qual o melhor. Para isso, é necessário colocar limites para o tempo de execução dos algoritmos pertencentes a esse conjunto."

#### Outra forma (mais usada)
<p align="justify">Outra forma de medir o custo é por meio do uso de um modelo matemático ou modelo de computação genérico com um único processador, a RAM (<i>Random Access Machine </i>- Máquina de Acesso aleatório). Nele, as instruções são executadas uma após a outra, sem operações concorrentes. Para Cormen (2002), deve-se definir as instruções do modelo e os custos associadas a elas, isso, no entanto, proporciona pouca percepção ao projeto e à análise de algoritmos. </p>
<p align="justify">O modelo RAM contém instruções encontradas em computadores reais, tais como instruções aritméticas (soma, subtração, multiplicação, divisão, piso, teto, resto), de movimentação de dados (carregar, armazenar, copiar), de controle (desvio condicional, chamada e retorno de funções). Como o custo de cada operação não é algo relevante neste momento, considera-se que cada uma das instruções demora um tempo constante. As operações mais significativas dentro de um algoritmo é que contribuem para o seu tempo de execução. Por exemplo, nos algoritmos de ordenação, considera-se o número de computações entre os elementos do conjuto a ser ordenado e desconsideram-se as operações aritméticas, de atribuição e manipulação de índices, quando existem. </p>
<p align="justify">O tempo de execução de um algoritmo será representado por uma função de custo <i>T</i> onde <i>T(n)</i> é a medida do tempo necessário para executar um algoritmo para um problema de tamanho <i>n</i>. Logo, <i>T</i> é chamada <i>função de complexidade de tempo</i> do algoritmo. Se <i>T(n)</i> é a medida de memória necessária para a execução do algoritmo, então <i>T</i> é chamada <i>função de complexidade de espaço.</i> Conforme Ziviani(2004), é importante enfatizar que <i>T(n)</i> não representa diretamente o tempo de execução, mas o número de vezes que certa operação relevante é executada. </p>

#### Exemplo 1:
```java

int calculaMenor(int a[], int n) {
   int menor = a[0];

   for (int i = 1; i < n; ++i) {
      if (a[i] < menor)
         menor = a[i];
   }

   return menor;
}

```
<p align="Justify">Na função <strong>calculaMenor</strong> mostrada, a função de complexidade de tempo <i>T(n)</i> é o número de comparações entre os elementos de <i>a</i>, visto que, para encontrar o menor elemento do vetor, é preciso mostrar que cada um dos <i>n - 1</i> elementos é menor do que algum outro, e para isso gasta-se pelo menos <i>n - 1</i> comparações. Logo, <i>T(n) = n - 1</i>. </p>
<p align="justify">O tempo de execução de um algoritmo depende principalmente do tamanho da entrada de dados. No exemplo anterior, o tempo de execução é uniforme para qualquer tamanho de entrada <i>n</i>. Há algoritmos, porém, que dependem de outros fatores, como os de ordenação, em que o algoritmo gastará menos tempo se a entrada estiver quase ordenada. </p>


#### Exemplo 2:
<p align="justify">Considere um arquivo contendo registros de dados. A busca mais conhecida é a sequencial. Nesse caso, o algoritmo não se comporta de maneira uniforme como no exemplo do cálculo do menor mostrado anteriormente. Em situações como esta, identificam-se três casos: pior caso, melhor caso e caso médio. O <i>pior caso</i> corresponde ao maior tempo de execução sobre todas as entradas de tamanho <i>n</i>. O <i>melhor caso</i> corresponde ao menor tempo de execução sobre todas as entradas de tamanho <i>n</i>. O </i>caso médio</i> corresponde à média dos tempos de execução do algoritmo sobre todas as entradas de tamanho <i>n</i>. </p>

<p align="justify">Dessa forma, no caso médio leva-se em consideração uma distribuição de probabilidades, o que é uma suporsição feita sobre a entrada. Comumente supõe-se que todas as entradas são igualmente prováveis, contudo, como essa suposição nem sempre é verdadeira, a análise do caso médio é mais difícil de se calcular do que as análises de pior e melhor caso. </p>

<p align="justify">No problema da busca sequencial, a função de complexidade de tempo <i>T</i> é calculada em função do número de registros consultados no arquivo. Logo, o melhor caso da busca sequencial acontece quando o registro a ser procurado é o primeiro a ser consultado. Já o pior caso acontece quando o registro a ser procurado é o último a ser consultado ou mesmo quando o registro não é encontrado no arquivo. </p>

```

Pior   caso: T(n) = n.
Melhor caso: T(n) = 1.
Caso  médio: T(n) = (n + 1) / 2

```

<p align="justify">Para encontrar o tempo do caso médio, considere <i>p_i</i> a probabilidade de procurar o <i>i</i>-ésimo registro. Como para encontrar o <i>i</i>-ésimo registro são necessárias <i>i</i> comparações, temos que: </p>

```

T(n) = 1 * p_1 + 2 * p_2 + 3 * p_3 + ... + n * p_n

```

<p align="justify">Considerando que a probabilidade de cada um dos registros a ser encontrado é 1/n, temos que: </p>

```

T(n) = 1 * 1/n + 2 * 1/n + 3 * 1/n + ... + n * 1/n
T(n) = 1/n ( 1 + 2 + 3 + ... + n)
T(n) = 1/n [(n * (n+1))/2]
T(n) = (n + 1)/2

```


<p align="justify">Na segunda linha do cálculo anterior, aparece um somatório de termos (1 + 2 + 3 + ... + n), que é uma prograssão aritmética (PA) de razão 1. Como se pode observar, o tempo de execução de um algoritmo aumenta à medida que o tamanho da entrada <i>n</i> do problema aumenta. No caso do problema para calcular o menor elemento de um vetor, o número de comparações realizadas aumentará à medida que o tamanho de <i>n</i> do vetor aumentar. </p>


## Elementos da análise assintótica




#
### Estrutura de dados: algoritmos, análise da complexidade e implementações JAVA E C/C++ <br> <i>Ana Fernanda Gomes Ascencio & Graziela Santos de Araújo</i>
