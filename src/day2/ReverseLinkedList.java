package day2;

public class ReverseLinkedList {


    static Node reverseList(Node head) {

        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    public static void main(String[] args) {

        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node four = new Node(5);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = four;

        Node res = reverseList(head);
        while (res != null) {
            System.out.println(res.data);
            res = res.next;
        }
    }
}

