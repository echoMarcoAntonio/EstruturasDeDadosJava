package ListaLigada;

public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    // Getter´s e Setter´s
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
        // Cenário 1: Lista vazia, primeira inserção de elemento.
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
            this.tamanho ++;
        }
    }
}
