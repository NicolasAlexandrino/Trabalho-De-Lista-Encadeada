package BListaDupla;


/**
 * Implementação de uma lista duplamente encadeada com teste automático.
 */
public class ListaDupla<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public ListaDupla() {
        head = tail = null;
        size = 0;
    }

    public void inserirInicio(T valor) {
        Node<T> novo = new Node<>(valor);
        if (head == null) {
            head = tail = novo;
        } else {
            novo.next = head;
            head.prev = novo;
            head = novo;
        }
        size++;
    }

    public void inserirFim(T valor) {
        Node<T> novo = new Node<>(valor);
        if (tail == null) {
            head = tail = novo;
        } else {
            tail.next = novo;
            novo.prev = tail;
            tail = novo;
        }
        size++;
    }

    public void inserirPos(int pos, T valor) {
        if (pos < 0 || pos > size) throw new IndexOutOfBoundsException("Posição inválida");
        if (pos == 0) { inserirInicio(valor); return; }
        if (pos == size) { inserirFim(valor); return; }

        Node<T> atual = head;
        for (int i = 0; i < pos; i++) atual = atual.next;

        Node<T> novo = new Node<>(valor);
        novo.prev = atual.prev;
        novo.next = atual;
        atual.prev.next = novo;
        atual.prev = novo;
        size++;
    }

    public boolean remover(T valor) {
        Node<T> atual = head;
        while (atual != null) {
            if ((valor == null && atual.data == null) || (valor != null && valor.equals(atual.data))) {
                if (atual.prev != null) atual.prev.next = atual.next; else head = atual.next;
                if (atual.next != null) atual.next.prev = atual.prev; else tail = atual.prev;
                size--;
                return true;
            }
            atual = atual.next;
        }
        return false;
    }

    public String listarFrente() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> atual = head;
        while (atual != null) {
            sb.append(atual.data);
            if (atual.next != null) sb.append(", ");
            atual = atual.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public String listarReverso() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> atual = tail;
        while (atual != null) {
            sb.append(atual.data);
            if (atual.prev != null) sb.append(", ");
            atual = atual.prev;
        }
        sb.append("]");
        return sb.toString();
    }

    // Teste automático ao rodar o arquivo
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<>();
        lista.inserirInicio("B");
        lista.inserirFim("A");
        lista.inserirPos(1, "C");
        System.out.println("Frente: " + lista.listarFrente());
        System.out.println("Reverso: " + lista.listarReverso());
        lista.remover("C");
        System.out.println("Após remover C: " + lista.listarFrente());
    }
}
