package prj5;

/**
 * Node class, used to store data in the doubly linked list.
 * @author Jonathan Rukaj (jrukaj)
 * @version 6.30.19
 * @param <T>
 */
public class Node<T> {

    private Node<T> next;
    private T data;
    private Node<T> prev;
    
    /**
     * Constructor for the Node class.
     * @param entry  Data to be stored.
     */
    public Node(T entry) {
        data = entry;
    }
    
    /**
     * Gets the data in the node.
     * @return the data held within the node (amazing!)
     */
    public T getData() {
        return data;
    }
    
    /**
     * Sets the argument node to be this node's next.
     * @param nextNode  The node to be set next
     */
    public void setNext(Node<T> nextNode) {
        next = nextNode;
    }
    
    /**
     * Sets the argument node to be this node's previous.
     * @param prevNode  The node to be set previous
     */
    public void setPrev(Node<T> prevNode) {
        prev = prevNode;
    }
    
    /**
     * Gets the node's next value.
     * @return the next node in the list
     */
    public Node<T> next() {
        return next;
    }
    
    /**
     * Gets the node's previous value.
     * @return the previous node in the list
     */
    public Node<T> prev() {
        return prev;
    }
}
