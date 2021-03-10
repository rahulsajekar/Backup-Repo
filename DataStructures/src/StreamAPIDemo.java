import java.util.Stack;

public class StreamAPIDemo {
    public static void main(String[] args) {

        Stack<String> s1 = new Stack<>();
        s1.push("rahul");
        s1.push("chetan");
        s1.push("ketan");
        s1.push("tejas");
        s1.push("rina");

        // find names starts with 'r' and print them

       // Traditional Method
//        for(int i=s1.size(); i>0; i--){
//            String value = s1.pop();
//            if (value.startsWith("t")){
//                System.out.println(value);
//            }
//        }

        // using stream API
        s1.stream()
                .filter(x->x.startsWith("r"))
                .forEach(x-> System.out.println(x));


        Stack<Integer> s2 = new Stack<>();
        s2.push(10);
        s2.push(20);
        s2.push(30);
        s2.push(40);
        s2.push(50);

        // print the total of all values in stack
        final int total = 0;
        System.out.println(
                s2.stream()
                .mapToInt(Integer::intValue)
                .sum()
        );

        // find if all element in stack grater than or equal 15
        System.out.println(
                s2.stream().allMatch(x->x>=15)
        );
    }
}
