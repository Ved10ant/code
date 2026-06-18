public class FindKthNodeFromEnd_LL {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public (int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public Node findKthFromEnd(int value) {
        Node first = head;
        Node second = head;
        for(int i = 0 ; i <= value ; i++){
            if(second == null){
                System.out.println("Too long value");
            }
            second = second.next;
            while(second != null){
                first = first.next;
                second = second.next.next;
            }
            System.out.println("The " + value + "th node from the end is: " + first.value);
        }
        // return;
    
    }
    
    public static void main (String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.findKthFromEnd(4);
        ll.printList();
    }

}

