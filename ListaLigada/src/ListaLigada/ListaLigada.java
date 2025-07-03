package ListaLigada;

public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    // Método Construtor (explícito)
    public ListaLigada(){
        this.tamanho = 0;
    }

    // Métodos getters e setters
    public Elemento getPrimeiro(){
        return primeiro;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento getUltimo(){
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho(){
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    // Demais métodos
    public void adicionar(String novoValor){
        Elemento novoElemento = new Elemento(novoValor);
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

    public void remover(String valorProcurado){
        Elemento anterior = null;
        Elemento atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++){
            // Cenário 4: Remoção do último elemento da lista.
            if (this.tamanho == 1){
                this.primeiro= null;
                this.ultimo = null;
            }
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
                // Cenário 1: Elemento a ser removido é a primeira posição da lista.
                if (atual == primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                    // Cenario 2: Elemento a ser removido é o último da lista.
                } else if (atual == ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else {
                    // Cenário 3: Elemento a ser removido não está nas extremidades da lista.
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

    public Elemento getPosicao(int posicao){
        Elemento atual = this.primeiro;
        for (int i = 0; i < posicao; i++){
            // Verifica se há um próximo elemento para avançar na lista
            if (atual.getProximo() != null){
                atual = atual.getProximo(); // Atual passa a apontar para seu próximo elemento
            }
        }
        return atual;
    }
}
