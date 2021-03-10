import java.util.Arrays;
import java.util.Collections;

class QueueFullException1 extends Exception{
    public QueueFullException1(String message) {
        super(message);
    }
}

class QueueIsEmptyException1 extends Exception{
    public QueueIsEmptyException1(String message) {
        super(message);
    }
}

class ElementNotFound1 extends Exception{
    public ElementNotFound1(String message) {
        super(message);
    }
}

public class PriorityQueue {

    int front = -1; // Removal of element on front pointer
    int rear = -1; // insertion of element on rear pointer
    Integer[] arr;
    int elements=0;

    public PriorityQueue(int size) {
        this.arr = new Integer[size];
    }

    public PriorityQueue(PriorityQueue obj){
        this.front = obj.front;
        this.rear = obj.rear;
        this.arr = obj.arr;
    }

    public void insert(int val) throws QueueFullException1 {
        if(this.rear < this.arr.length){
            if(this.front == -1){
                this.front = 0;
            }
            this.rear++;
            this.arr[rear] = val;
            this.elements++;
            Arrays.sort(this.arr, this.front,this.rear+1,Collections.reverseOrder());
        }
        else{
            throw new QueueFullException1("Queue is Full");
        }
    }

    public int delete() throws QueueIsEmptyException1 {
        if(front < 0 ){
            throw new QueueIsEmptyException1("Queue is empty");
        }
        else if(this.front == this.rear){
            // if only one element present, remove it and reset queue
            int val = this.arr[front];
            this.front = -1;
            this.rear = -1;
            this.elements--;
            return val;
        }
        else{
            // more than one element present, remove from front
            int val = this.arr[front];
            this.front ++;
            this.elements--;
            return val;
        }
    }

    boolean isFull(){
        return this.rear == this.arr.length;
    }

    boolean isEmpty(){
        return this.front == -1;
    }

    int getSize(){
        return elements;
    }

    // distance of element from front
    int search(int val) throws ElementNotFound1 {
        for(int i=this.front; i<=this.rear; i++){
            if(this.arr[i] == val){
                return i-front;
            }
        }
        throw new ElementNotFound1("Not Found");
    }

    @Override
    public String toString() {
        String element="";
        for(int i=this.front; i<=this.rear;i++){
            element += this.arr[i]+" , ";
        }
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                ", arr=" + element +
                '}';
    }

    public static void main(String[] args) throws ElementNotFound1, QueueFullException1 {
        PriorityQueue q = new PriorityQueue(5);
        q.insert(7);
        q.insert(22);
        q.insert(11);
        q.insert(2);

        System.out.println(q);
       // System.out.println(q.search(65));
        System.out.println(q.getSize());
        PriorityQueue q1 = new PriorityQueue(q);


    }
}
