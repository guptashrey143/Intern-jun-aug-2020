package SixthTask;

public class List {

    private static class Node {
        private int value;
        private Node Next;

        public Node(int value) {
            this.value = value;
            this.Next = null;
        }
    }

    private Node head;
    boolean isCircular = false;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (!isCircular) {
            if (head == null) {
                head = newNode;
            } else {
                Node node = head;
                while (node.Next != null) {
                    node = node.Next;
                }
                node.Next = newNode;
            }
            System.out.println(value + " Added to singly linked list");
        } else {
            if (head == null) {
                head = newNode;
            } else {
                Node node = head;
                while (node.Next != head) {
                    node = node.Next;
                }
                node.Next = newNode;
            }
            newNode.Next = head;
            System.out.println(value + " Added to circular linked list");
        }
    }

    public void delete() {
        if (head == null) {
            System.out.println("List Underflow!!");
        } else {
            Node node = head;
            if (!isCircular) {
                if (head.Next == null) {
                    System.out.println("Value deleted: " + head.value);
                    head = null;
                } else {
                    while (node.Next.Next != null) {
                        node = node.Next;
                    }
                    System.out.println("Value deleted: " + node.Next.value);
                    node.Next = null;
                }
            } else {
                if (head.Next == head) {
                    System.out.println("Value deleted: " + head.value);
                    head = null;
                } else {
                    while (node.Next.Next != head) {
                        node = node.Next;
                    }
                    System.out.println("Value deleted: " + node.Next.value);
                    node.Next = head;
                }
            }
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is empty!!");
        } else {
            Node node = head;
            if (!isCircular) {
                System.out.print("head -> ");
                while (node != null) {
                    System.out.print(node.value + " -> ");
                    node = node.Next;
                }
                System.out.println("null");
                System.out.println("List Traversed!!");
            } else {
                System.out.print("head -> ");
                while (node.Next != head) {
                    System.out.print(node.value + " -> ");
                    node = node.Next;
                }
                System.out.print(node.value + " -> ");
                System.out.println("head");
                System.out.println("List Traversed!!");
            }

        }
    }

    public void singleLLToCircularLL() {
        if (!isCircular) {
            isCircular = true;
            if (head != null) {
                Node node = head;
                while (node.Next != null) {
                    node = node.Next;
                }
                node.Next = head;

            }
            System.out.println("operation Successful!");
        } else {
            System.out.println("Already Circular!");
        }
    }

    public void circularLLtoSinglyLL() {
        if (isCircular) {
            isCircular = false;
            if (head != null) {
                Node node = head;
                while (node.Next != head) {
                    node = node.Next;
                }
                node.Next = null;

            }
            System.out.println("operation Successful!");
        } else {
            System.out.println("Already Singly Linked!");
        }
    }
}
