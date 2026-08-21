package DSA.LinkedList;

public class singleLL {
    static class Node {
        int data;
        Node next;

        // yhe node ka constructer hai
        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    // constructor
    public singleLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertAthead(int data) {
        Node newNode = new Node(data);
        // if LL is empty --> head and tail ko newnode pe point kardo
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtposition(int position, int data) {
        if (position < 1 || position > size + 1) {
            System.out.println("not possible");
            return;

        }
        if (position == 1) {
            insertAthead(data);
            return;

        }
        if (position == size + 1) {
            insertAtTail(data);
            return;
        }
        // middle me kahin par add krna hai
        Node prevNode = head;
        for (int i = 1; i < position - 1; i++) {
            prevNode = prevNode.next;
        }
        Node newNode = new Node(data);
        // update links
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        // increment size
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

    public boolean searchLL(int tar) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == tar) {
                return true;

            } else {
                temp = temp.next;
            }

        }
        // agar target nahin mila hence retur false krdo
        return false;
    }

    public int findPosition(int target) {
        Node temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.data == target) {
                return position;
            } else {
                temp = temp.next;
                position++;

            }

        }
        return -1;

    }

    public void updateLL(int pos, int data) {
        // chk for valid

        if (pos < 1 || pos > size + 1) {
            System.out.println("nahi hora bhai mujhse ");
            return;
        }
        Node temp = head;
        for (int i = 1; i <= pos - 1; i++) {
            temp = temp.next;

        }
        // ab mera temp, exact position wali node par hai
        temp.data = data;
    }

    public void updateVal(int orgValue, int newValue) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == orgValue) {
                temp.data = newValue;
            }
            temp = temp.next;
        }
    }

    public void deleteHead() {

        if (head == null) {
            System.out.println("ll is empty ");
            return;
        }
        head = head.next;
        size--;

        // be cautious whether the adter deletion ll is becomed empty or not

        if (head == null) {
            tail = null;
        }

    }

    public static void main(String[] args) {
        singleLL mylist = new singleLL();
        mylist.insertAthead(10);
        mylist.printLL();
        mylist.insertAthead(40);
        mylist.printLL();
        mylist.insertAthead(90);
        mylist.printLL();
        mylist.insertAtTail(42);
        mylist.printLL();
        mylist.insertAtTail(82);
        mylist.printLL();

        mylist.insertAtposition(3, 412);
        mylist.printLL();

        System.out.println(mylist.searchLL(10));

        System.out.println(mylist.findPosition(412));

        mylist.updateLL(3, 200);
        mylist.printLL();

        mylist.updateVal(90, 20);
        mylist.printLL();

        mylist.deleteHead();
        mylist.printLL();
    }
}
