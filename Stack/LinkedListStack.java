// Better than Dynamic Array as we can expand or shrink as much as possible
public class LinkedListStack {
  
    int count=0;
    private static class Node {
        int data;
        Node next;

        private Node(int data){
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty(){
        return top == null;
    };

    public int peek(){
        return top.data;
    }

    public int size(){
        return count;
    }

    public void push(int data){
        count++;
        Node curr = new Node(data);

        if(top == null){
            top = curr;
            return;
        }
        curr.next = top;
        top = curr;
    }

    public int pop(){
        count--;
        if(top == null){
            System.out.println("There is no element to remove.");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public void show(){
        Node curr = top;
        for(int i=0; i<count; i++){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
