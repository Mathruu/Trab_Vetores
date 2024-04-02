public class Exercicio_9 {
    public static void main(String[] args) {
        // 9 Crie um vetor com os elementos {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189}. Crie um método que retorna o menor elemento do vetor.
        int[] vetorComElementos = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};
        int menor = encontrarMenorElemento(vetorComElementos);
        System.out.println("Menor elemento: " + menor);
    }

    public static int encontrarMenorElemento(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }
}
