public class Exercicio_8 {
    public static void main(String[] args) {
        // 8 Crie um vetor com os elementos {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189}. Crie um método que retorna o maior elemento do vetor.
        int[] vetorComElementos = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};
        int maior = encontrarMaiorElemento(vetorComElementos);
        System.out.println("Maior elemento: " + maior);
    }

    public static int encontrarMaiorElemento(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
}
