// This is a static stack class where the number of elements will be fixed
public class StaticStack {

    // Initialize the array to be of size 5
    int[] stack = new int[5];
    int top=0;

    public void push(int data){

        // To check if the stack is full
        if(top >= stack.length){
            System.out.println("The stack is full");
            return;
        }

        // Assign the value to stack
        stack[top] = data;
        top++;
    }

    // To check if the stack is empty or not
    public boolean isEmpty(){
        if(top <= 0){
            return true;
        }
        return false;
    }

    // Return the number of elements in stack
    public int size(){
        return top;
    }

    // Getting the last element of stack
    public int peek(){
        if(top <= 0){
            System.out.println("There is currently no element in the stack.");
            return -1;
        }
        return stack[top-1];
    }

    // Removing the last element of stack
    public int pop(){
        if(top <= 0){
            System.out.println("The stack is empty.");
            return -1;
        }

        top--;
        int data = stack[top];
        return data;
    }

    // Showing elements currently in stack from the last element to the first
    public void show(){
        if(top <= 0){
            System.out.println("There is currently no element in the stack.");
            return;
        }

        for(int i=top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
}
