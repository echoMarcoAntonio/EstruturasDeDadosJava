package datastructures.ListaLigada;

public class ListaLigada<TIPO> {
    private Elemento<TIPO> primeiro;
    private Elemento<TIPO> ultimo;
    private int tamanho;

    // Método Construtor (explícito)
    public ListaLigada(){
        this.tamanho = 0;
    }

    // Métodos getters e setters
    public Elemento<TIPO> getPrimeiro(){
        return primeiro;
    }
    public void setPrimeiro(Elemento<TIPO> primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento<TIPO> getUltimo(){
        return ultimo;
    }
    public void setUltimo(Elemento<TIPO> ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho(){
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    // Demais métodos
    public void adicionar(TIPO novoValor){
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor);
        // Caso 1: Lista vazia — define o primeiro e último elemento
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else { // Caso 2: Lista não vazia — adiciona o novo elemento após o último
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho ++;
    }

    public void remover(TIPO valorProcurado){
        Elemento<TIPO> anterior = null;
        Elemento<TIPO> atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++){
            if (atual.getValor().equals(valorProcurado)) { // equals: método padrão, filho de Object do Java.
                // Cenário 1: Remoção de um único elemento da lista.
                if (this.tamanho == 1){
                    this.primeiro= null;
                    this.ultimo = null;
                // Cenário 2: Elemento a ser removido é a primeira posição da lista.
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                // Cenário 3: Elemento a ser removido é o último da lista.
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                // Cenário 4: Elemento a ser removido não está nas extremidades da lista.
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                tamanho --;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public Elemento<TIPO> getPosicao(int posicao){
        Elemento<TIPO> atual = this.primeiro;
        for (int i = 0; i < posicao; i++){
            // Verifica se há um próximo elemento para avançar na lista
            if (atual.getProximo() != null){
                atual = atual.getProximo(); // Atual passa a apontar para seu próximo elemento
            }
        }
        return atual;
    }

    public IteratorListaLigada<TIPO> getIterator(){
        return new IteratorListaLigada<TIPO>(this.primeiro); // Inicializa um iterador que começa no primeiro elemento da lista
    }
}
