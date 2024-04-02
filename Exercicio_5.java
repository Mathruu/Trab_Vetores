import java.util.ArrayList;
import java.util.Random;

public class Exercicio_5 {
    public static void main(String[] args) {
        // 5 Utilize o vetor de tamanho dinâmico criado anteriormente. Gere 1000 números aleatórios e armazene neste vetor.
        ArrayList<Integer> vetorDinamico = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            vetorDinamico.add(random.nextInt());
        }
        System.out.println(vetorDinamico);
        }
}
