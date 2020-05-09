package SinglyLinkedList;

public class Node<T> {
    private T Value;
    private Node<T> Next;

    public Node(T value) {
        this.Value = value;
    }


    public T getValue() {
        return Value;
    }

    private void setValue(T value) {
        Value = value;
    }

    public Node<T> getNext() {
        return Next;
    }

    public void setNext(Node<T> next) {
        Next = next;
    }
}
