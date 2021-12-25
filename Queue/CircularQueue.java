public class CircularQueue{
    private int front;
    private int rear;
    private int[] nums;

    public CircularQueue(int intialSize){
        this.front = this.rear = -1;
        this.nums = new int [intialSize];
    }

    public void enQueue(int data){
        if(isFull()){
            resize();
        } else if (isEmpty()) {
            front++;
        }
        rear = (rear + 1) % nums.length;
        nums[rear] = data;
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("There are no elements to dequeue.");
            return -1;
        }
        int data = nums[front];
        if(front == rear){
            front = rear = -1; // FRONT will not meet REAR in any circumstances. (Only will meet during initialization, which is -1)
        } else {
            front = (front + 1) % nums.length; // this is just like front++, but in a circular manner;
        }
        return data;
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("There are no elements in Queue.");
            return -1;
        }
        return nums[front];
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return (rear + 1) % nums.length == front; // if front and rear are equal aside from initialization phase (-1), then it is full
    }

    public void resize(){
        int[] newArr = new int[nums.length * 2];
        for(int i=front; i<=rear; i++){
            newArr[i] = nums[i];
        }
        nums = newArr;
    }
}
