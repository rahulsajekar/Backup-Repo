import java.util.Stack;

public class DefaultStackDemo {

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);

        Stack<String> s2 = new Stack<>();
        s2.push("Rahul");
        s2.push("Sajekar");

        s2.forEach(x-> System.out.println(x.toLowerCase()));
    }
}


