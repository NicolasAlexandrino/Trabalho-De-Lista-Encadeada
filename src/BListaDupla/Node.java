package BListaDupla;

/**
 * Nó de uma lista duplamente encadeada.
 */
public class Node<T> {
    public T data;
    public Node<T> next;
    public Node<T> prev;

    public Node(T data) {
        this.data = data;
    }
}
