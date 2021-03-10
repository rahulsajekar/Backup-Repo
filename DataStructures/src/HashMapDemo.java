import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.stream.Collectors;

public class HashMapDemo {
    public static void main(String[] args) {
//        String[] a = {"rahul","Rwsgfg"};
//        Arrays.stream(a).filter(x->x.startsWith("r") || x.startsWith("R")).collect(Collectors.toList());


        HashMap<Integer,Student> s = new HashMap<>();
        s.put(1,new Student("rahul","IT"));
        s.put(2,new Student("tejas","EE"));

        s.forEach((key,value) -> System.out.println(value.name));


//        System.out.println("Starts With t using procedural programming");
//        for (Integer k:s.keySet()) {
//            Student s1 = s.get(k);
//            if(s1.name.startsWith("t")){
//                System.out.println(s1.name);
//            }
//        }

        System.out.println("Starts with r using Functional Programming");
        s.entrySet().stream()
                .filter((x->x.getValue().name.startsWith("r")))
                .forEach(x-> System.out.println(x.getValue().name));

        // find name of student with branch commerce
        s.entrySet().stream()
                .filter((x->x.getValue().branch.equals("commerce")))
                .forEach(x-> System.out.println(x.getValue().name));

        HashMap<String,HashMap<Integer,Student>> hm = new HashMap<>();
        hm.put("ERP201",s);
        hm.put("ERP202",s);

        // find record of student with roll no 1
        hm.get("ERP201").entrySet().stream()
                .filter(x->x.getKey().equals(1))
                .forEach(x-> System.out.println(x));

        // alternative for above code
        hm.get("ERP202").entrySet().stream()
                .filter(x->x.getKey().equals(2))
                .findFirst()
                .ifPresent(x-> System.out.println(x));
    }
}

class Student{
    String name;
    String branch;

    public Student(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}