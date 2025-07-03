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

    public void remover(String novoValor){
        // TODO: Implementar lógica de remoção de elemento
    }

    public Elemento getPosicao(int posicao){
        Elemento atual = this.primeiro;
        for (int i = 0; i < posicao; i++){
            // Verifica se há um próximo elemento para avançar na lista
            if (atual.getProximo() != null){
                atual = atual.getProximo(); // atual passa a apontar para seu próximo elemento
            }
        }
        return atual;
    }
}
