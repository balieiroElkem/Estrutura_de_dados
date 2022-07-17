T -> é uma função de custo
T(n) -> é a medida de tempo necessário para executar um algoritmo para um problema de tamanho 'n'.
Por conta disso 'T' é chamada de função de complexidade de tempo.

Se T(n) é a medida de memória necessária para a execução do algoritmo, então T é chamada função de complexidade de espaço.


Ex: Função para calcular o menor número de um vetor

função:
	int calcularMenor(int a[], int n) {
		int menor = a[0];

		for (int i = 1; i < n; i++) {
			if (a[i] < menor)
				menor = a[i];
		}

		return menor;
	}

Cálculo:
	Na função o T(n) vai ser o número de comparações entre os elementos de 'a', para tentar encontrar o menor valor do vetor.
	É preciso mostrar que cada um dos n-1 elementos é menor que algum outro, e para isso gasta-se pelo menos n-1 comparações. Logo T(n) = n-1.



Em problema de busca sequencial, o comportamento da função é levemente diferenciado. Vai existir três casos para ser analisados: Melhor caso, pior caso e caso médio.
	* Pior caso   -> T(n) = n
	* Melhor caso -> T(n) = 1
	* Caso médio  -> T(n) = (n+1)/2

	Desenvolvimento do cálculo do caso médio:
		T(n) = 1*p_1 + 2*p_2 + 3*p_3 + ... + n*p_n
	Considerando que a probabilidade de cada um dos registros ser encontrado é 1/n, tempos que:
		T(n) = 1 * 1/n + 2 * 1/n + 3 * 1/n + ... + n * 1/n
		T(n) = 1/n * (1 + 2 + 3 + ... + n)
		T(n) = 1/n * ((n*(n+1))/2)
		T(n) = (n*(n+1))/2n
		T(n) = (n+1)/2.
	
