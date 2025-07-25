package datastructures.ListaLigada;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String novoNome, String novoCpf){
        this.nome = novoNome;
        this.cpf = novoCpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return this.nome + " - " + this.cpf;
    }
}
