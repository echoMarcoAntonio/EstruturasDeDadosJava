package BuscaLinear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[100]; // Cria vetor do tipo inteiro com 100 posições

        // Preenche posições do vetor com valores aleatórios
        System.out.print("Vetor com valores aleatórios: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100000);
            System.out.print(vetor[i] + " ");
        }

        // Busca Linear por números
        System.out.print("\nDigite um número inteiro: ");
        Scanner leitor = new Scanner(System.in);
        int busca = leitor.nextInt();

        boolean encontrado = false;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == busca) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Elemento encontrado!");
        } else {
            System.out.println("Elemento não encontrado :c");
        }
    }
}