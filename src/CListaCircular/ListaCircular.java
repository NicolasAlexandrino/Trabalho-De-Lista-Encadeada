package CListaCircular;

/**
 * Implementação de uma lista encadeada circular com teste automático.
 */
public class ListaCircular<T> {
    private Node<T> tail;
    private int size;

    public ListaCircular() {
        tail = null;
        size = 0;
    }

    public void inserirInicio(T valor) {
        Node<T> novo = new Node<>(valor);
        if (tail == null) {
            tail = novo;
            tail.next = tail;
        } else {
            novo.next = tail.next;
            tail.next = novo;
        }
        size++;
    }

    public void inserirFim(T valor) {
        inserirInicio(valor);
        tail = tail.next;
    }

    public void inserirPos(int pos, T valor) {
        if (pos < 0 || pos > size) throw new IndexOutOfBoundsException("Posição inválida");
        if (pos == 0) { inserirInicio(valor); return; }

       Node<T> atual = tail.next;
        for (int i = 0; i < pos - 1; i++) atual = atual.next;

        Node<T> novo = new Node<>(valor);
        novo.next = atual.next;
        atual.next = novo;
        if (atual == tail) tail = novo;
        size++;
    }

    public boolean remover(T valor) {
        if (tail == null) return false;

        Node<T> atual = tail.next;
        Node<T> prev = tail;

        do {
            if ((valor == null && atual.data == null) || (valor != null && valor.equals(atual.data))) {
                if (atual == prev) { // único nó
                    tail = null;
                } else {
                    prev.next = atual.next;
                    if (atual == tail) tail = prev;
                }
                size--;
                return true;
            }
            prev = atual;
            atual = atual.next;
        } while (atual != tail.next);
        return false;
    }

    public String listar() {
        if (tail == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Node<T> atual = tail.next;
        do {
            sb.append(atual.data);
            atual = atual.next;
            if (atual != tail.next) sb.append(", ");
        } while (atual != tail.next);
        sb.append("]");
        return sb.toString();
    }

    // Teste automático ao rodar o arquivo
    public static void main(String[] args) {
        ListaCircular<Integer> lista = new ListaCircular<>();
        lista.inserirFim(1);
        lista.inserirFim(2);
        lista.inserirInicio(0);
        lista.inserirPos(2, 99);
        System.out.println("Circular: " + lista.listar());
        lista.remover(2);
        System.out.println("Após remover 2: " + lista.listar());
    }
}
