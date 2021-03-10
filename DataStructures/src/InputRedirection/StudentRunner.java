package InputRedirection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[10];
        for(int i=0; i<10; i++){
            int id = sc.nextInt(); //1
            sc.nextLine();
            String name = sc.nextLine();//2
            s[i] = new Student(id,name);
        }


       // Arrays.sort(s,Student::compareTo);

        // sort using lambda
        Arrays.sort(s,(first,second)->first.id-second.id);

        Arrays.sort(s, Comparator.comparing(employee -> employee.name));
        Arrays.stream(s).forEach(x-> System.out.println(x));
    }
}