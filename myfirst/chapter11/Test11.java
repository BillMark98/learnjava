import java.util.Scanner;
import java.util.ArrayList;
public class Test11 {
    public static void main(String[] args)
    {
        // problem 11.13
        // System.out.print("Enter ten Integers: ");
        // Scanner input = new Scanner("34 5 3 5 6 4 33 2 2 4");
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 1; i <= 10; i++)
        // {
        //     int next = input.nextInt();
        //     list.add(next);
        // }
        // MyArrayListFunc.removeDuplicate(list);
        // System.out.print("The distinct integers: ");
        // MyArrayListFunc.printArray(list);
        // System.out.println();
        // input.close();


        // problem 11.17
        System.out.print("Enter an integer m: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        PerfectSquare ps = new PerfectSquare(m);
        System.out.println("The smallest number n for m * n to be a perfect square is : " + ps.FindNumberToSquare());
        input.close();

    }
}