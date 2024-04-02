public class Exercicio_7 {
    public static void main(String[] args) {
        // 7 Crie um vetor com os elementos {1, 2, 3, 4, 5, 6, 7, 8, 9}. Crie um método que calcule a média dos elementos.
        int[] vetorComElementos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int media = calcularMedia(vetorComElementos);
        System.out.println("Média dos elementos: " + media);
    }

    public static int calcularMedia(int[] vetor) {
        int soma = 0;
        for(int indice = 0; indice<vetor.length; indice++){
            soma += (vetor[indice]);
        }
        return soma/vetor.length;
    }
}
