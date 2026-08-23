package DSA.LinkedList;

public class doubly_LL {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public doubly_LL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAthead(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head.prev = newNode;
            // head update
            head = newNode;
        }
        // 1 node add hui h
        size++;

    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAtposition(int pos, int data) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("not valid");
            return;
        }
        if (pos == 1) {
            insertAthead(data);
            return;
        }
        if (pos == size + 1) {
            insertAtTail(data);
            return;
        }
        // in between kahi pr node insert karna hai
        Node temp = head;
        for (int i = 1; i <= pos - 2; i++) {
            temp = temp.next;
        }
        // ab mera node prev par aa chuka hai
        Node prevNode = temp;
        Node nextNode = prevNode.next;
        Node currNode = new Node(data);

        // change the links
        currNode.prev = prevNode;
        prevNode.next = currNode;
        currNode.next = nextNode;
        nextNode.prev = currNode;

        size++;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print("<--" + temp.data);
            temp = temp.prev;
        }
        System.out.println();
    }

    public boolean search(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    public void updateLL(int oldVal, int newVal) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == oldVal) {
                temp.data = newVal;
            } else {
                temp = temp.next;
            }
        }
    }

    public void deletehead() {

        if (head == null) {
            System.out.println("no node to dlete");
        }

        // single node wala case
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        // LL has more than one node
        head = head.next;
        head.prev = null;

        // size update

        size--;
    }

    public void deleteTail() {

        if (tail == null) {
            System.out.println("no tail to delete");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            // yeh main bhul gaya tha
            size = 0;
            return;
        }

        tail = tail.prev;
        tail.next = null;

        size--;
    }

    public void deleteAtpos(int pos) {

        if (pos < 1 || pos > size + 1) {
            System.out.println("invalid");
            return;
        }
        if (pos == 1) {
            deletehead();
            return;
        }
        if (pos == size) {
            deleteTail();
            return;
        }
        // now main case
        Node prev = head;
        for (int i = 1; i <= pos - 2; i++) {
            prev = prev.next;
        }
        // ab mera node prev pe aa chuka hai
        Node curr = prev.next;
        Node forward = curr.next;

        prev.next = forward;
        forward.prev = prev;
        curr.prev = null;
        curr.next = null;

    }

    public static void main(String[] args) {
        doubly_LL mylist = new doubly_LL();
        mylist.insertAthead(10);
        mylist.printLL();
        mylist.insertAthead(20);
        mylist.printLL();
        mylist.insertAthead(30);
        mylist.printLL();
        mylist.insertAtTail(150);
        mylist.printLL();
        mylist.insertAtposition(3, 150);
        mylist.printLL();

        // mylist.printBackward();

        // mylist.search(20);
        // mylist.updateLL(30, 11);
        // mylist.printLL();

        // mylist.deletehead();
        // mylist.printLL();

        // mylist.deleteTail();
        // mylist.printLL();

        mylist.deleteAtpos(2);
        mylist.printLL();

    }
}