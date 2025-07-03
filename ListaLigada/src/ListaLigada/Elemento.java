package ListaLigada;

public class Elemento {
    private String valor;
    private Elemento proximo;

    // Método Construtor
    public Elemento(String novoValor) {
        this.valor = novoValor;
    }

    // Métodos getters e setters
    public String getValor(){
        return valor;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
    public Elemento getProximo(){
        return proximo;
    }
    public void setProximo(Elemento proximoElemento){
        this.proximo = proximoElemento;
    }

    // Demais métodos
    public void adicionar(String novoValor){
        Elemento novoElemento = new Elemento(novoValor); // Atribui valor ao elemento
    }
}
