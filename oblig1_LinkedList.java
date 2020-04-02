import org.w3c.dom.Node;
import java.util.LinkedList;
import java.io.*;

public class oblig1_LinkedList {


    Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node() {

        }
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;


        if (head == null) {
            head = node;

        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;

            }
            n.next = node;
        }


    }

    static Node removeFistNode(Node head) {
        if (head == null)
            return null;

        Node temp = head;
        head = head.next;

        return head;
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }

    public void deleteAll() {
        head = null;
    }


    public void show() {
        System.out.println("The linked List are: ");
        Node node = head;
        while (node.next != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.print(" " + node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;

        head = node;

    }

    public class insertAtEnd {
        private Node head;

        public insertAtEnd() {
            this.head = null;
        }

    }

    public Node insertAtEnd(int data) {
        if (head == null) {
            head = new Node(data);


        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(data);
        }
        return head;

    }

    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int DeleteCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    public void insertAtAnyLocation(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {

            Node n = head;


            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;


        }

    }


    public static void main(String[] args) {

        Node head = null;

        oblig1_LinkedList list = new oblig1_LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.insert(35);
        list.insertAtStart(1);
        list.insertAtAnyLocation(1, 40);
        list.insertAtAnyLocation(8, 45);
        list.insertAtAnyLocation(9, 50);
        list.insertAtEnd(10);
        list.insertAtEnd(100);


        System.out.println("The size of the nodes that got deleted is: " + list.DeleteCount());
        list.deleteAll();

        list.removeFistNode(head);
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.println(temp.data + " ");
        System.out.println("All the node will be deleted ");


        System.out.println("The size of the linked list is : " + list.getCount());

        list.deleteAt(0);


        list.show();

    }
}