package LinkedList;

import java.util.List;

public class ListOperations {
    int data;
    ListOperations next;
    ListOperations head = null;
    ListOperations tail = null;
    int size;

    public ListOperations(int data) {
        this.data = data;
        this.next = null;
    }

    public ListOperations() {

    }

    void add(int data) {
        ListOperations newNode = new ListOperations(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    void remove(int val) throws ElementNotFound {
        ListOperations temp = this.head;
        ListOperations prev = this;

        while (temp != null) {
            if (temp.data == val) {
                if (temp == this.head) {
                    System.out.println("First");
                    this.head = temp.next;
                    this.tail = temp.tail;
                    this.size--;
                } else if (temp.next == null) {
                    this.tail = prev;
                    prev.next = null;
                    size--;
                } else {
                    prev.next = temp.next;
                    size--;
                }
                return;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        throw new ElementNotFound(val + " is not present in list");

    }

    int search(int val) throws ElementNotFound {
        int index = 0;
        ListOperations temp = this.head;
        while (temp!=null){
            if(temp.data == val){
                return index;
            }else{
                temp=temp.next;
                index++;
            }
        }
        throw new ElementNotFound(val+" not present");
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ListOperations{" +
                showValues() +
                "} Size: "+this.size;
    }

    private String showValues() {
        String info = "";
        ListOperations temp = this.head;
        do {
            info += temp.data + " ";
            temp = temp.next;
        } while (temp != null);
        return info;
    }
}
