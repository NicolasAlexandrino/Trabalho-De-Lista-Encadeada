package CListaCircular;

/**
 * Nó da lista encadeada circular.
 */
public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
