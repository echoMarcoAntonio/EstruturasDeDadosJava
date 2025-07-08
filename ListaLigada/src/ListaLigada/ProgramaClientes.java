package ListaLigada;

public class ProgramaClientes {
    public static void main(String[] args) {
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
        clientes.adicionar(new Cliente("123", "Jao"));
        clientes.adicionar(new Cliente("456", "Zeca"));
        clientes.adicionar(new Cliente("789", "Ju"));

        System.out.println("Tamanho: " + clientes.getTamanho());
        for (int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println(clientes.getPosicao(i).getValor());
        }

        // LinkedList<Cliente> clientes2 = new LinkedList<Cliente>();
    }
}
