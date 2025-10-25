package AListaSimples;

/**
 * Implementação de uma lista encadeada simples com testes automáticos.
 */
public class ListaSimples<T> {
    private Node<T> head;
    private int size;

    public ListaSimples() {
        head = null;
        size = 0;
    }

    public void inserirInicio(T valor) {
        Node<T> novo = new Node<>(valor);
        novo.next = head;
        head = novo;
        size++;
    }

    public void inserirFim(T valor) {
        Node<T> novo = new Node<>(valor);
        if (head == null) {
            head = novo;
        } else {
            Node<T> atual = head;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = novo;
        }
        size++;
    }

    public void inserirPos(int pos, T valor) {
        if (pos < 0 || pos > size) throw new IndexOutOfBoundsException("Posição inválida");
        if (pos == 0) {
            inserirInicio(valor);
            return;
        }
        Node<T> atual = head;
        for (int i = 0; i < pos - 1; i++) atual = atual.next;
        Node<T> novo = new Node<>(valor);
        novo.next = atual.next;
        atual.next = novo;
        size++;
    }

    public int buscar(T valor) {
        Node<T> atual = head;
        int idx = 0;
        while (atual != null) {
            if ((valor == null && atual.data == null) || (valor != null && valor.equals(atual.data)))
                return idx;
            atual = atual.next;
            idx++;
        }
        return -1;
    }

    public boolean remover(T valor) {
        if (head == null) return false;
        if ((valor == null && head.data == null) || (valor != null && valor.equals(head.data))) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> atual = head;
        while (atual.next != null) {
            if ((valor == null && atual.next.data == null) || (valor != null && valor.equals(atual.next.data))) {
                atual.next = atual.next.next;
                size--;
                return true;
            }
            atual = atual.next;
        }
        return false;
    }

    public String listar() {
        StringBuilder sb = new StringBuilder();
        Node<T> atual = head;
        sb.append("[");
        while (atual != null) {
            sb.append(atual.data);
            if (atual.next != null) sb.append(", ");
            atual = atual.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // Teste automático ao rodar o arquivo
    public static void main(String[] args) {
        ListaSimples<Integer> lista = new ListaSimples<>();
        lista.inserirInicio(10);
        lista.inserirFim(20);
        lista.inserirPos(1, 15);
        System.out.println("Lista: " + lista.listar());
        System.out.println("Buscar 15 => posição: " + lista.buscar(15));
        lista.remover(10);
        System.out.println("Após remover 10: " + lista.listar());
    }
}
