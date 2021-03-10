package LinkedList;

public class JavaOperationsRunner {
    public static void main(String[] args) throws ElementNotFound {
        ListOperations obj = new ListOperations();
        obj.add(56);
        obj.add(34);
        obj.add(45);
        obj.add(63);
        System.out.println(obj.search(55));
        obj.remove(56);
        obj.remove(45);
        obj.remove(63);
        System.out.println(obj);
        System.out.println(obj.getSize());


    }
}
