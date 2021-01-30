package FifthTask;

public class List {
    private Node head;
    private static class Node {
        private final int value;
        private Node Next;

        public Node(int value) {
            this.value = value;
            this.Next = null;
        }
    }

    public int listSize() {
       Node iteratorNode = head;
        int ret = 0;
        while (iteratorNode != null) {
            ret++;
            iteratorNode = iteratorNode.Next;
        }
        return ret;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node node = head;
            while (node.Next != null) {
                node = node.Next;
            }
            node.Next = newNode;
        }
    }

    public int[] listToArray() {
        int[] array = new int[listSize()];
        Node node = head;
        int i = 0;
        while (node != null) {
            array[i] = node.value;
            i++;
            node = node.Next;
        }
        return array;
    }
}

