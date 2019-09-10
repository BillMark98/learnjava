public class DequeSort {
    // move the top card to the bottom of the deck
    public static void cycleShift(int[] arr) {
        int n = arr.length;
        int zero = arr[0];
        // System.out.println("Before cycle shift");
        // printArr(arr);
        for(int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = zero;
        System.out.println("After cycle shift");
        printArr(arr);
    }
    // exchange the top two cards
    public static void swapTop(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void dequeSort(int[] arr) {
        int n = arr.length;
        int count = 0;
        int turns = n;
        int smallerCount = 0;
        while(turns > 0) {
            // System.out.println("count : " + count + "  turns: " + turns);
            count++;
            if(count == turns){
                turns--;
                int moveCount = 0;
                while(moveCount < n - turns) {
                    cycleShift(arr);
                    moveCount++;
                }
                if(smallerCount == turns) {
                    break;
                }
                count = 0;
                smallerCount = 0;
                continue;
            }
            if(arr[0] < arr[1]) {
                cycleShift(arr);
                smallerCount++;
            }
            else {
                swapTop(arr);
                cycleShift(arr);
            }
        }
    }
    public static void main(String[] args) {
        // int[] arr = {1,5,2,3,10,6,33,23,12,18,11};
        int[] arr = {23,1,44,2,5,9,7,54,2,2};
        System.out.println("Before sorting");
        for(int a : arr) {
            System.out.print( a + "  ");
        }
        System.out.println();
        dequeSort(arr);
        System.out.println("After sorting");
        for(int a : arr) {
            System.out.print( a + "  ");
        }
        System.out.println();
    }
    public static void printArr(int [] arr) {
        for(int a : arr) {
            System.out.print( a + "  ");
        }
        System.out.println();
    }
}