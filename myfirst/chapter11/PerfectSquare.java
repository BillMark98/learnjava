import java.util.ArrayList;
public class PerfectSquare {
    private ArrayList<Integer> list;
    private int squareToFind;
    public PerfectSquare(int m) {
        list = new ArrayList<>();
        squareToFind = m;
    }
    public void FindPrimeFactor() {
        int helpVar = squareToFind;
        for(int i = 2; i <= helpVar; i++) {
            while(helpVar % i == 0 && isPrime(i)) {
                helpVar /= i;
                list.add(i);
            }
        }
    }   
    public int FindNumberToSquare() {
        FindPrimeFactor();
        MyArrayListFunc.DeleteEvenTimesElements(list);
        MyArrayListFunc.removeDuplicate(list);
        int prod = 1;
        for (Integer var : list) {
            prod *= var.intValue();
        }
        return prod;
    }
    public static boolean isPrime(int number)
    {
        for(int divisor = 2; divisor <= number/2; divisor++)
        {
            if(number % divisor == 0)
            {
                return false;
            }
        }
        return true;
    } 
}