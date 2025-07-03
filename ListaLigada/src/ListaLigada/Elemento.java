package ListaLigada;

public class Elemento {
    private String valor;
    private Elemento proximoElemento;

    // Método Construtor
    public Elemento(String novoValor) {
    }

    // Getter´s e Setter´s
    public String getValor(){
        return valor;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
    public Elemento getProximoElemento(){
        return proximoElemento;
    }
    public void setProximoElemento(Elemento proximoElemento){
        this.proximoElemento = proximoElemento;
    }

    // Demais métodos
}
