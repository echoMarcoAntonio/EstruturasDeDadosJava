package datastructures.ListaLigada;

public class Elemento<TIPO> {
    private TIPO valor;
    private Elemento<TIPO> proximo;

    // Método Construtor
    public Elemento(TIPO novoValor) {
        this.valor = novoValor;
    }

    // Métodos getters e setters
    public TIPO getValor(){
        return valor;
    }
    public void setValor(TIPO valor){
        this.valor = valor;
    }
    public Elemento<TIPO> getProximo(){
        return proximo;
    }
    public void setProximo(Elemento<TIPO> proximoElemento){
        this.proximo = proximoElemento;
    }

    // Demais métodos
    public void adicionar(TIPO novoValor){
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor); // Atribui valor ao elemento
    }
}
