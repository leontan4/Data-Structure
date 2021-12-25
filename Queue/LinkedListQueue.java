public class LinkedListQueue {
    private class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public boolean isEmpty(){
        return tail == null;
    }

    public void enQueue(int data){
        Node node = new Node(data);
        if(head == null && tail == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public int deQueue(){
        if(head == null){
            tail = null;
            System.out.println("There are no elements to remove from queue.");
            return -1;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }
    
    public int size(){
        return size;
    }

    public int peek(){
        if(tail == null){
            System.out.println("There are no elements in the queue.");
            return -1;
        }
        return head.data;
    }
}
