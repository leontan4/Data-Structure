public class DynamicStack {

    // Initialize the array to be of size 5
    int top = -1;
    int[] stack = new int[2];
    
    // Adding elements into the stack
    // Once stack is full, it will increase the capacity by 2 times
    public void push(int data){
        top++;
        if(top >= stack.length){
            increaseCapacity();
        }
        stack[top] = data;
    }
  
    // Removing the last element of the stack
    public int pop(){
        if(top <= 0){
            size();
            return -1;
        } else if((stack.length/2) > top){
            decreaseCapacity();
        }
        return stack[top--];
    }
    
    // Getting the last element from the stack
    public int peek(){
        return stack[top];
    }
    
    // Getting the stack length
    public int size(){
        if(top <= 0){
            System.out.println("There are no elements in the stack.");
            return -1;
        }
        return stack.length;
    }
    
    // Checking to see if the stack is empty or not
    public boolean isEmpty(){
        if(top <= 0){
            return true;
        }
        return false;
    }

    // Increasing the capacity of stack if stack is full
    public void increaseCapacity(){
        int[] newStack = new int[top * 2];

        for(int i=0; i<stack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }
    
    // Decrease stack if elements is less than stack/2
    // This is to remove any extra space
    public void decreaseCapacity(){
        int[] newStack = new int[stack.length/2];

        for(int i=0; i<newStack.length; i++){
            newStack[i] = stack[i];
        }
        stack = newStack;
    }
    
    // Display elements of stack
    public void show(){
        for(int elem : stack){
            System.out.println(elem);
        }
    }
}
