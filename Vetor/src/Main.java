public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        vetor[0] = 3;
        vetor[1] = 12;
        vetor[2] = 8;
        vetor[3] = 6;
        vetor[4] = 90;

        System.out.println("Imprimindo o vetor: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}