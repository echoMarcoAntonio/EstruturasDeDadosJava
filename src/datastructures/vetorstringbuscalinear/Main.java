package datastructures.VetorStrBuscaLinear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] estadosBrasil = new String[10];

        estadosBrasil[0] = "AC";
        estadosBrasil[1] = "BA";
        estadosBrasil[2] = "CE";
        estadosBrasil[3] = "RJ";
        estadosBrasil[4] = "AM";
        estadosBrasil[5] = "AP";
        estadosBrasil[6] = "PB";
        estadosBrasil[7] = "RN";
        estadosBrasil[8] = "MS";
        estadosBrasil[9] = "SC";

        System.out.println("Imprimindo os estados do Brasil: ");

        for (int i = 0; i < estadosBrasil.length; i++) {
            System.out.println(estadosBrasil[i]);
        }

        System.out.println("Busca linear");

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um estado para busca: ");
        String siglaBusca = leitor.nextLine();

        boolean encontrado = false;
        int posicaoEncontrado = -1;
        for (int i = 0; i < estadosBrasil.length; i++) {
            String elemento = estadosBrasil[i];
            if (elemento.equalsIgnoreCase(siglaBusca)) {
                encontrado = true;
                posicaoEncontrado = i;
                break;
            }
        }
        if (encontrado == true) {
            System.out.println("O estado de " + siglaBusca.toUpperCase() + " foi encontrado na posição [" + posicaoEncontrado + "]!");
        } else {
            System.out.println("Estado não encontrado no vetor!");
        }
    }
}
