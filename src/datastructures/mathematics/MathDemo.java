package datastructures.mathematics;

import java.util.Scanner;

public class MathDemo {

    public static void main(String[] args) {

        System.out.println("--- Demonstração de Constantes e Métodos da Classe Math em Java ---");

        // --- Constantes Matemáticas ---
        // A classe Math fornece algumas constantes já definidas,
        // como PI (aproximação de 3.14159) e E (base do logaritmo natural, ~2.71828).
        // Essas constantes são úteis em cálculos trigonométricos, exponenciais, etc.
        System.out.println("\n--- Constantes Matemáticas ---");
        System.out.println("Valor de Pi (Math.PI): " + Math.PI);
        System.out.println("Valor de E (Math.E): " + Math.E);

        // --- Métodos Matemáticos Comuns ---
        // Demonstração prática dos principais métodos da classe Math.
        // Inclui operações básicas e funções que lidam com arredondamento e comparação.
        System.out.println("\n--- Métodos Matemáticos ---");

        double base = 2.0;
        double expoente = 3.0;
        // Elevação de base ao expoente: 2^3 = 8.0
        System.out.println("Potência (" + base + "^" + expoente + "): " + Math.pow(base, expoente));

        int numeroNegativo = -5;
        // Retorna o valor absoluto (módulo). Exemplo: |-5| = 5.
        System.out.println("Valor absoluto de " + numeroNegativo + ": " + Math.abs(numeroNegativo));

        double numeroParaRaiz = 9.0;
        // Calcula a raiz quadrada. Aqui: √9 = 3.0
        System.out.println("Raiz quadrada de " + numeroParaRaiz + ": " + Math.sqrt(numeroParaRaiz));

        double numeroParaArredondar = 3.14;
        // Arredonda para o inteiro mais próximo.
        // Se a parte decimal for >= 0.5, arredonda pra cima. Caso contrário, pra baixo.
        System.out.println("Arredondamento de " + numeroParaArredondar + ": " + Math.round(numeroParaArredondar));

        numeroParaArredondar = 3.7;
        System.out.println("Arredondamento de " + numeroParaArredondar + ": " + Math.round(numeroParaArredondar));

        double numeroParaCeil = 3.14;
        // Retorna o menor inteiro que é maior ou igual ao número (arredondamento pra cima).
        System.out.println("Teto de " + numeroParaCeil + ": " + Math.ceil(numeroParaCeil));

        double numeroParaFloor = 3.99;
        // Retorna o maior inteiro que é menor ou igual ao número (arredondamento pra baixo).
        System.out.println("Piso de " + numeroParaFloor + ": " + Math.floor(numeroParaFloor));

        int num1 = 10;
        int num2 = 20;
        // Compara dois valores e retorna o maior.
        System.out.println("Máximo entre " + num1 + " e " + num2 + ": " + Math.max(num1, num2));
        // Compara dois valores e retorna o menor.
        System.out.println("Mínimo entre " + num1 + " e " + num2 + ": " + Math.min(num1, num2));

        // --- Exercícios Práticos com Entrada do Usuário ---
        // Aplicação dos métodos anteriores em situações reais e geométricas.
        System.out.println("\n--- Exercícios Práticos com Entrada do Usuário ---");

        Scanner scanner = new Scanner(System.in);

        // --- Cálculo da Hipotenusa (Teorema de Pitágoras) ---
        // Fórmula: hipotenusa = sqrt(a² + b²)
        // Exemplo clássico do uso combinado de Math.pow e Math.sqrt.
        System.out.println("\n--- Cálculo da Hipotenusa ---");
        System.out.print("Digite o valor do lado A: ");
        double ladoA = scanner.nextDouble();
        System.out.print("Digite o valor do lado B: ");
        double ladoB = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
        System.out.println("A hipotenusa é: " + hipotenusa);

        // --- Cálculo de Circunferência, Área do Círculo e Volume da Esfera ---
        // Usa Math.PI e Math.pow em três fórmulas geométricas importantes:
        // Circunferência: 2πr
        // Área do círculo: πr²
        // Volume da esfera: (4/3)πr³
        System.out.println("\n--- Cálculo de Circunferência, Área e Volume de Esfera ---");
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double circunferencia = 2 * Math.PI * raio;
        System.out.printf("Circunferência (2 * Pi * raio): %.2f%n", circunferencia);

        double areaCirculo = Math.PI * Math.pow(raio, 2);
        System.out.printf("Área do círculo (Pi * raio^2): %.2f%n", areaCirculo);

        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.printf("Volume da esfera ((4/3) * Pi * raio^3): %.2f%n", volumeEsfera);

        // Fecha o Scanner para liberar recursos do sistema (boa prática)
        scanner.close();

        System.out.println("\n--- Fim da Demonstração ---");
    }
}
