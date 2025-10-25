package AListaSimples;

/**
 * Classe que representa um nó de uma lista encadeada simples.
 */
public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
