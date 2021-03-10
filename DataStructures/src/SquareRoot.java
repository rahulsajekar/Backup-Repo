import java.util.Scanner;

public class SquareRoot {

    static void CalculateSquareRoot(int[] arr){
        for (int val: arr){
            System.out.println(Math.sqrt((double)val));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); //1
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt(); //2
        }
        CalculateSquareRoot(arr);
    }
}
