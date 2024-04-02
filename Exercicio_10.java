public class Exercicio_10 {
    public static void main(String[] args) {
        // 10 Crie um vetor com os elementos {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189}. Imprima os elementos do vetor na ordem inversa.
        int[] vetorComElementos = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};
        System.out.println("Elementos do vetor na ordem inversa:");
        imprimirOrdemInversa(vetorComElementos);
    }

    public static void imprimirOrdemInversa(int[] vetor) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

}
