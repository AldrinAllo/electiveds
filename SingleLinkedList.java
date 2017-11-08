package lilo;


public class SingleLinkedList {
    private static class Node {
        private Object data;
        private Node nextLink;

        public Node(Object data, Node next) {
            this.data = data;
            this.nextLink = next;
        }

        public Node(Object data) {
            this.data = data;
            this.nextLink = null;
        }
    }

    private Node head; // sometimes called top
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Node Insertion in a Linked List
    // 1. Insert	element	at	the	start

    public void addAtHead(Object data) {
        head = new Node(data, head);
        size++;
    }

    // 2. Insert	element	at	the	end
    public void addToTail(Object data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (head == null)
            head = newNode;

        while (curr.nextLink != null) {
            curr = curr.nextLink;
        }
        curr.nextLink = newNode;

    }
    // 3. Insert	of	an	element	at	the	Nth position

    Node InsertNth(Object data, int position) {
        Node node = head;
        if (position == 0) {
            node = new Node(data, head);
            return node;
        } else {
            while (--position > 0) {
                node = node.nextLink;
            }
            Node next = node.nextLink;
            node.nextLink = new Node(data, next);
            return head;
        }
    }


    // 3. Insert	element	in	sorted	order


    // TRAVERSE A LINKED LIST

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.toString() + "\n");
            temp = temp.nextLink;
        }
    }


}