public class Exercicio_6 {
    public static void main(String[] args) {
        // 6 Crie um vetor com os elementos {1, 2, 3, 4, 5, 6, 7, 8, 9}. Crie um método que calcula a soma dos elementos.
        int[] vetorComElementos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int soma = calcularSoma(vetorComElementos);
        System.out.println("Soma dos elementos: " + soma);
    }
    
    public static int calcularSoma(int[] vetor) {
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return soma;
    }
}
