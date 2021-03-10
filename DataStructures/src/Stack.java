import java.util.Scanner;

class StackUnderFlow extends Exception{
    public StackUnderFlow(String message) {
        super(message);
    }
}

class StackOverFlow extends Exception{
    public StackOverFlow(String message) {
        super(message);
    }
}

class NotFoundException extends Exception{
    public NotFoundException(String message) {
        super(message);
    }
}

public class Stack {
    int size;
    int top = -1;
    int[] arr;

    public Stack(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public Stack(Stack obj){
        this.top = obj.top;
        this.size = obj.size;
        this.arr = obj.arr;
    }

    public void push(int val) throws StackOverFlow {
        if (this.top == this.size - 1) {
            throw new StackOverFlow("Stack is Full");
        } else {
            this.top++;
            this.arr[top] = val;
        }
    }

    int peek() {
        if (this.top == -1) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return this.arr[this.top];
        }
    }

    int pop() throws StackUnderFlow {
        if (this.top == -1) {
            throw new StackUnderFlow("Stack is Empty");
        } else {
            int e = this.arr[this.top];
            this.top--;
            return e;
        }
    }

    void copy(Stack obj){
        for(int i=0; i<obj.size; i++){
            this.top++;
            this.arr[i] = obj.arr[i];
        }
    }

    int search(int val) throws NotFoundException {
        for(int i= top; i>=0; i--){
            if(this.arr[i] == val){
                System.out.println("Your element is "+ (top-i) +" distance away from top");
                return (top-i);
            }
        }
        throw new NotFoundException("Element is not present");
    }

    boolean isEmpty() {
        return this.top == -1;
    }

    boolean isFull() {
        return this.top == this.size - 1;
    }

    @Override
    public String toString() {
        String elements = "";
        for (int i = 0; i <= this.top; i++) {
            elements += this.arr[i] + " ";
        }
        return "Stack{" +
                "size=" + size +
                ", top=" + top +
                ", arr=" + elements +
                '}';
    }

    public static void main(String[] args) throws NotFoundException, StackOverFlow {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        Stack s1 = new Stack(size);

        s1.push(20);
        s1.push(32);
        s1.push(65);
        s1.push(55);
        s1.push(66);

        System.out.println(s1);
        try {
            System.out.println("Item Poped : " + s1.pop());
        } catch (StackUnderFlow stackUnderFlow) {
            stackUnderFlow.printStackTrace();
        }
        System.out.println(s1);
        System.out.println("Element at TOP = " + s1.peek());

        s1.search(20);

        Stack s2 = new Stack(s1);
        System.out.println(s2);

    }
}
        // ACTIVITY  1//

        // take 5 values from user push it in to stack
        // check the element at the top and print whether element is odd or even number
        // print factorial of top number
//        Stack s1 = new Stack(5);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter 5 Integers");
//        for(int i=0; i<5; i++){
//            s1.push(sc.nextInt());
//        }
//
//        int topElement = s1.peek();
//        System.out.println((topElement%2 == 0) ? topElement+" is Even" : topElement+" is Odd" );
//
//        System.out.println("Factorial of "+topElement+" is "+factorial(topElement));
//
//    static int factorial(int val){
//        if(val == 1){
//            return 1;
//        }
//        return val*factorial(val-1);
//    }
