package datastructures.ListaLigada;

public class IteratorListaLigada<TIPO> {
    // Referência para o elemento atual da iteração
    private Elemento<TIPO> elemento;

    public IteratorListaLigada(Elemento<TIPO> atual) {
        this.elemento = atual;
    }

    // Verifica se existe um próximo elemento
    public boolean temProximo() {
        return elemento.getProximo() != null;
    }

    // Retorna o próximo elemento da lista e avança o ponteiro
    public Elemento<TIPO> getProximo() {
        elemento = elemento.getProximo();
        return elemento;
    }
}
