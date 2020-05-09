package SinglyLinkedList;

public class LinkedListNode<E> {
    private Node<E> Head, Tail;
    private int nodeCount = 0;

    public LinkedListNode(E value) {
        addFirst(value);
    }


    /*
        @{Add Methods}
     */
    public void addFirst(E item) {
        addFirst(new Node<E>(item));
    }
    public void addFirst(Node<E> node) {
        Node<E> temp = Head;
        Head = node;
        Head.setNext(temp);

        nodeCount++;
        if (nodeCount==1){
            Tail = Head;
        }
    }
    public void addLast(E item) {
        addLast(new Node(item));
    }
    public void addLast(Node node) {
        if (nodeCount == 0){
            Head = node;
        }else {
            Tail.setNext(node);
        }
        Tail = node;
        nodeCount++;
    }



    /*
        @{Remove Methods}
     */
    public void removeFirstNode() {
        if (nodeCount > 1) {
            Head = Head.getNext();
            nodeCount--;
            return;
        }
        Head = null;
        Tail = null;
    }
    public void removeLastNode() {
        if (nodeCount > 1) {
            Node currentNode = Head;
            while (currentNode.getNext().getNext() != null) {   // Checking if the next is not tail. You can also do **currentNode.getNext() != Tail**
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            Tail = currentNode;
            nodeCount--;
        }else{
            Tail = null;
            Head = null;
        }
    }
    public void remove(E item) {
        Node previous=null, current = Head;

        if (nodeCount==1) {
            if (Head.getValue().equals(item)) {
                Head = null;
                Tail = null;
                nodeCount--;
            }
        }

        if (nodeCount > 1) {
            while(current != null) {
                if (current.getValue().equals(item)) {
                    if (previous==null) Head = current.getNext();
                    else if (current == Tail){ Tail = previous; Tail.setNext(null);}
                    else previous.setNext(current.getNext());
                    nodeCount--;
                    break;
                }
                previous = current;
                current = current.getNext();
            }
        }
    }



    /*
        @{find method}
     */
    public Node findLinkedListNode(int value) {
        return null;
    }

    /*
        @{clear method}
     */
    public void clear() {
        Head = null;
        Tail = null;
        nodeCount = 0;
    }


    /*
        @{Enumerate Methods}
     */
    public void printChain() {
        printNodeChain(Head);
    }
    private void printNodeChain(Node<E> node) {
        while(node != null) {
            print("Current node chain value is %d", node.getValue());
            node = node.getNext();
        }
    }
    private void print(String string, Object... args) {
        String value = String.format(string, args);
        System.out.println(value);

    }
}
