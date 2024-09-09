package Array;

public class Stack {
    private int[] array;
    private int maxSize;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        top = -1;
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return array[top];
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return array[top--];
        }
    }
    public void push(int value){
        if (top == maxSize-1){
            System.out.println("Stack is full");
        }else{
            array[++top] = value;
        }

    }
}
