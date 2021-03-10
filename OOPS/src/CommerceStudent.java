import java.util.Arrays;
import java.util.Scanner;

public class CommerceStudent extends Student {

    String[]  abitities= new  String[]{"Book Keeping","Accounting"};
    boolean isCA=false;

    String[] courses = new String[5];

    public CommerceStudent(String name, String email_id, String address, String course, String branch, int rollno) {
        super(name, email_id, address, course, branch, rollno);
    }

    @Override
    public String toString() {
        return "CommersStudent{" +
                "abitities=" + Arrays.toString(abitities) +
                ", isCA=" + isCA +
                ", name='" + getName() + '\'' +
                ", email_id='" + email_id + '\'' +
                ", address='" + address + '\'' +
                ", Course='" + Course + '\'' +
                ", Branch='" + Branch + '\'' +
                ", Rollno=" + Rollno +
                ", Course_fee=" + Course_fee +
                '}';
    }

    void applyForCA(){
        System.out.println("Retrun Result");
    }

    void changeStatus(){
        this.isCA=true;
    }
    public void Update_Course(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of courses that you have did (atmost 5)");
        int n=sc.nextInt();
        System.out.println("Enter courses:");
        for(int i=0;i<n;i++)
        {
            courses[i]=sc.next();
        }
    }

    public void Update_Status(){
        this.isCA=true;
    }
    public void Update_HighestStudies(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you going abroad for Higher Studies: 1 for yes and 2 for no");
        int ans = sc.nextInt();
        if (ans == 1) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter country name: ");
            String country = s.nextLine();
            System.out.println("All the best future studies in: " + country);
        } else {
            System.out.println("All the best for future work");
        }
    }

    public void Set_Specialization(){
        Integer Specialization;
        Scanner sc = new Scanner(System.in);
        System.out.println("                                     WELCOME TO SPECIALIZATION SECTION");
        System.out.println("Some courses are provided for Specialization, Select anyone course in which you want to do Specialization");
        System.out.println("1.Financial Accounting\n" +

                "2.Business Organization and Management\n" +

                "3.Generic elective courses like Macro-economics, Foreign exchange markets, etc.\n" +

                "4.Company Law\n" +

                "5.Indirect Tax Laws\n" +

                "6.Auditing and Corporate Governance\n" +

                "7.Fundamentals of Financial Management\n" +

                "8.Investment Management\n"
        );
        System.out.println("Choose by entering value from range of [1-8]");
        Specialization = sc.nextInt();
        switch (Specialization) {
            case 1:
                System.out.println("1.Financial Accounting");
                break;
            case 2:
                System.out.println("\n2.Business Organization and Management");
                break;
            case 3:
                System.out.println("\n\"3.Generic elective courses like Macro-economics, Foreign exchange markets, etc.");

                break;
            case 4:
                System.out.println("\n4.Company Law");
                break;

            case 5:
                System.out.println("5.Indirect Tax Laws");
                break;

            case 6:
                System.out.println("\n6.Auditing and Corporate Governance");
                break;

            case 7:
                System.out.println("\n7.Fundamentals of Financial Management");
                break;
            case 8:
                System.out.println("\n8.Investment Management");
                break;
            default:
                System.out.println("\nOops you've chosen Wrong Option \nPlease choose correct option");
                return;
        }
        System.out.println("Great you have Selected most trending topic for Specialization");
    }

    void ShowTopp(int arr[], int arr_size,String names[])
    {
        int i,first, second, third;
        //String k;
        String name = " ";

        if (arr_size < 3) {
            System.out.print(" Invalid Input ");
            return;
        }
        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            //for (int k = 0; k<arr_size; k++)
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
                //name=names[k];
            }

            else if (arr[i] > second) {
                third = second;
                second = arr[i];
                //name=names[k];
            }
            else if (arr[i] > third)
                third = arr[i];

        }

        System.out.println("First topper " + name+"and score is "+first);
        System.out.println("Second topper "+name+"and score is "+second);
        System.out.println("third topper "+name+"and score is "+third);
    }

    void counselling(){
        String answer1;
        String answer2;
        String answer3;
        String answer4;
        Scanner q1=new Scanner(System.in);
        System.out.println("Career Guidance for Commerce Students");
        System.out.println("After Graduation preparing for CA?    Enter Yes or No:  ");
        answer1= q1.nextLine();
        //System.out.println(answer1);
        if (answer1.equals("Yes"))
        {
            System.out.println("Preparing for CA");
        }
        else{
            System.out.println("Not preparing for CA");
        }
        System.out.println("After Graduation applying for Government jobs?");
        answer2= q1.nextLine();
        if (answer2.equals("Yes"))
        {
            System.out.println("Applying for Government jobs");
        }
        else{
            System.out.println("Not applying for Government jobs");
        }
        System.out.println("After Graduation applying for Bank exams?");
        answer3= q1.nextLine();
        if (answer3.equals("Yes"))
        {
            System.out.println("Applying for Bank exams");
        }
        else{
            System.out.println("Not applying for Bank exams");
        }
        System.out.println("After Graduation interested in MCOM?");
        answer4= q1.nextLine();
        if (answer4.equals("Yes"))
        {
            System.out.println("Opting for MCOM");
        }
        else{
            System.out.println("Not interested in MCOM");
        }
        System.out.println();
    }
}


