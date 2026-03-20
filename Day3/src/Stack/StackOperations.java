package Stack;

import java.util.Scanner;

public class StackOperations {

    public int length;
    public double[] stackarr;
    public int top;

    public StackOperations(int size) {
        this.length = size;
        this.stackarr = new double[length];
        this.top = -1; // Stack starts empty
    }

    public double push(double number){
        if(top==length-1) {
            System.out.println("Stack Overflow! Cannot push " + number);
        }
        stackarr[++top] = number;
        System.out.println("Pushed: " + number);
        return 0;
    }

    public double pop(){
        if(top==-1) {
            System.out.println("Stack Underflow! Cannot pop ");
        }
        return stackarr[top--];
    }

    public double peek(){
        if (top == -1)
            return -1;
        return stackarr[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

}









