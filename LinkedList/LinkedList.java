public class LinkedList{
    
    Node head;
    
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(head == null){
            head = node;
            return;
        }
        
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = node;
    }
    
    public void prepend(int data){
        Node node = new Node();
        node.data = data;
        
        if(head == null){
            head = node;
            return;
        }
        
        node.next = head;
        head = node;
    }
    
    public void insertAt(int index, int data){
        if(index < 0){
            System.out.println("Index not valid for insertion.");
            return;
        }
        
        Node node = new Node();
        node.data = data;
        
        if(index == 0){
            prepend(data);
            return;
        }
        
        Node curr = head;
        while(curr.next != null && index > 1){
            curr = curr.next;
            index--;
        }
        
        if(curr.next == null && index >= 2){
            System.out.println("Index out of bound.");
        } else{
            node.next = curr.next;
            curr.next = node;
        }
    }
    
    public void deleteAtTail(){
        if(head == null){
            System.out.println("No node to be deleted.");
        }
        
        if(head.next == null){
            head = new Node();
        }
        
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }
    
    public void deleteAtIndex(int index){
        
        if(head == null){
            System.out.println("There is no node to delete.");
            return;
        }
        
        if(index < 0){
            System.out.println("Index not valid for deletion.");
        } else if (index == 0){
            head = head.next;
            return;
        }
        
        Node curr = head;
        while(curr.next != null && index > 1){
            curr = curr.next;
            index--;
        }
        
        if(curr.next == null){
            if(index > 1){
                deleteAtTail();
                return;
            } else{
                System.out.println("Index out of bound for deletion.");
            }
        } else {
            curr.next = curr.next.next;
        }
    }
    
    public void show(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
