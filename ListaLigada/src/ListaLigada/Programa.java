package ListaLigada;

public class Programa {
    public static void main(String[] args) {

        ListaLigada<String> lista = new ListaLigada<String>();

        // Adiciona elementos à lista
        lista.adicionar("AC");
        lista.adicionar("SP");
        lista.adicionar("SC");
        lista.adicionar("DF");
        lista.adicionar("MG");

        // Imprime todos os valores
        System.out.println("\nImprimindo estados: ");
        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println("Elemento / Nó: " + lista.getPosicao(i).getValor());
        }

        // Remove os estados do AC e DF e adiciona RS
        lista.remover("AC");
        lista.remover("DF");
        lista.adicionar("RS");

        // Imprime todos os valores
        System.out.println("\nImprimindo estados após exclusão: ");
        for (int i = 0; i < lista.getTamanho(); i++){
            System.out.println("Elemento / Nó: " + lista.getPosicao(i).getValor());
        }

        // Exibe o tamanho e os extremos da lista
        System.out.println("\nTamanho da lista: " + lista.getTamanho());
        System.out.println("Primeiro elemento: " + lista.getPrimeiro().getValor()); // Encapsulamento: lista >> primeiro(elemento/nó) >> valor.
        System.out.println("Último elemento: " + lista.getUltimo().getValor()); // Note que Ultimo refere-se ao último elemento ou nó e não ao valor diretamente.
    }
}
