package ListaLigada;

public class Programa {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        // Adiciona elementos à lista
        lista.adicionar("AC");
        lista.adicionar("SP");
        lista.adicionar("SC");
        lista.adicionar("DF");
        lista.adicionar("MG");

        // Exibe o tamanho e os extremos da lista
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println("Primeiro elemento: " + lista.getPrimeiro().getValor()); // Encapsulamento: lista >> primeiro(elemento/nó) >> valor.
        System.out.println("Último elemento: " + lista.getUltimo().getValor()); // Note que Ultimo refere-se ao último elemento ou nó e não ao valor diretamente.

        // Imprime os valores nas posições específicas
        System.out.println("\nAcessando elementos por posição (índices 0, 2, 4):");
        System.out.println(lista.getPosicao(0).getValor());
        System.out.println(lista.getPosicao(2).getValor());
        System.out.println(lista.getPosicao(4).getValor());
    }
}
