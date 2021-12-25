public class Queue {

    int[] queue = new int[5];
    int front;
    int rear;
    int size;

    public boolean isEmpty(){
        if(rear <= 0){
            return true;
        }
        return false;
    }

    public int size(){
        return rear - front;
    }

    public int peek() {
        return queue[front];
    }

    public void enQueue(int data){
        queue[rear] = data;
        rear++;
        size++;
    }

    public int deQueue(){
        if(size == 0 && front == rear){
            System.out.println("There are no elements to deQueue.");
            return -1;
        }
        int data = queue[front];
        front++;
        size--;
        return data;
    }

    public void show(){
        for(int i=front; i<=size; i++){
            System.out.println(queue[i]);
        }
    }
}
