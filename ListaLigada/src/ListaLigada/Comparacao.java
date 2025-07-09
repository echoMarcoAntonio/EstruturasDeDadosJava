package ListaLigada;

import java.util.ArrayList;

// Compara o tempo de adição entre ArrayList e Lista Ligada
public class Comparacao {
    public static void main(String[] args) {
        // Instanciação das estruturas de dados
        ListaLigada<Integer> lista = new ListaLigada<Integer>(); // Implementação própria
        ArrayList<Integer> vetor = new ArrayList<Integer>(); // Vetor dinâmico do Java

        int limite = 100000; // Quantidade de elementos para o teste
        long tempoInicial;    // Tempo no início da operação
        long tempoFinal;      // Tempo ao fim da operação

        // --- Teste de Desempenho em Adição: ArrayList (Vetor Dinâmico) ---
        tempoInicial = System.currentTimeMillis(); // Captura o tempo atual em milissegundos
        for (int i = 0; i < limite; i++) {
            vetor.add(i); // Adiciona elementos sequencialmente ao final do ArrayList
        }
        tempoFinal = System.currentTimeMillis(); // Captura o tempo final
        System.out.println("\nAdicionou " + limite + " elementos ao vetor.");
        System.out.println("Tempo de execução em milissegundos: " + (tempoFinal - tempoInicial)); // Calcula e exibe o tempo total

        // --- Teste de Desempenho em Adição: Lista Ligada ---
        tempoInicial = System.currentTimeMillis(); // Reinicia o contador de tempo
        for (int i = 0; i < limite; i++) {
            lista.adicionar(i); // Adiciona elementos sequencialmente ao final da Lista Ligada
        }
        tempoFinal = System.currentTimeMillis(); // Captura o tempo final
        System.out.println("\nAdicionou " + limite + " elementos a lista.");
        System.out.println("Tempo de execução em milissegundos: " + (tempoFinal - tempoInicial)); // Calcula e exibe o tempo total

        // --- Teste de Desempenho em Leitura: ArrayList ---
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.size(); i++) {
            int elemento = vetor.get(i); // Força uso real do valor
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n" + limite + " elementos do vetor lidos.");
        System.out.println("Tempo de execução em milissegundos: " + (tempoFinal - tempoInicial)); // Calcula e exibe o tempo total

        // --- Teste de Desempenho em Leitura: Lista Ligada ---
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < lista.getTamanho(); i++) {
            int elemento = lista.getPosicao(i).getValor(); // Força uso real do valor
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n" + limite + " elementos da lista lidos.");
        System.out.println("Tempo de execução em milissegundos: " + (tempoFinal - tempoInicial)); // Calcula e exibe o tempo total
    }
}
