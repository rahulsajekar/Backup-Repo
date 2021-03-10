package LinkedList;

public class DoublyLinkedList {
    int data;
    DoublyLinkedList next;
    DoublyLinkedList prev;
    DoublyLinkedList head = null;
    DoublyLinkedList tail = null;
    int size;

    public DoublyLinkedList(int data) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public DoublyLinkedList() {
    }

    void add(int data){
        DoublyLinkedList newNode = new DoublyLinkedList(data);
        if (this.head == null){
            this.head = newNode;
            this.tail = newNode;
            this.next = newNode;
            //newNode.prev = this;
        }else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.size++;
    }

    void remove(int val) throws ElementNotFound {
        DoublyLinkedList temp = this.head;

        while (temp != null) {
            if (temp.data == val) {
                if (temp == this.head) {
                    this.head = temp.next;
                    temp.next.prev = temp.prev;
                    //this.tail = temp.tail;
                    this.size--;
                } else if (temp.next == null) {
                    this.tail = temp.prev;
                    temp.prev.next=null;
                    size--;
                } else {
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;

                    size--;
                }
                return;
            } else {
                temp = temp.next;
            }
        }
        throw new ElementNotFound(val + " is not present in list");

    }

    private String showValues() {
        String info = "";
        DoublyLinkedList temp = this.head;
        do {
            info += temp.data + " ";
            temp = temp.next;
        } while (temp != null);
        return info;
    }

    int search(int val) throws ElementNotFound {
        int index = 0;
        DoublyLinkedList temp = this.head;
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

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                showValues() +
                "} Size: "+this.size;
    }

    public static void main(String[] args) throws ElementNotFound {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.add(10);
        dl.add(30);
        dl.remove(30);
        dl.add(65);
        System.out.println(dl);
        System.out.println("65 is located at "+ dl.search(65));
    }
}
