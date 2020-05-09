package SinglyLinkedList;

public class SingleLinkListExample {
    public static void main(String[] args) {
        thirdRun();
    }


    private static void thirdRun() {
        LinkedListNode<Integer> linkedListNode = new LinkedListNode(2);
        linkedListNode.addLast(new Node(3));
        linkedListNode.addLast(new Node(5));
        linkedListNode.addLast(new Node(7));
        linkedListNode.addLast(9);
        linkedListNode.addLast(11);
        linkedListNode.addFirst(1);


        linkedListNode.removeLastNode();
        linkedListNode.removeFirstNode();
        linkedListNode.remove(9);

        linkedListNode.printChain();
    }

    private static void firstRun() {
        // First Run
        Node first = new Node(3);
        Node second = new Node(5);
        first.setNext(second);

        Node third = new Node(7);
        second.setNext(third);
    }

    private static void secondRun() {
        // Second implementation
        LinkedListNode linkedListNode = new LinkedListNode(3);
        linkedListNode.addLast(new Node(5));
        linkedListNode.addLast(new Node(7));
        linkedListNode.addFirst(new Node(1));
        linkedListNode.printChain();
    }

}
