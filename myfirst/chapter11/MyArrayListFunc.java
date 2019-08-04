import java.util.ArrayList;
public class MyArrayListFunc {
    public static void removeDuplicate(ArrayList<Integer> list) {
        for(int index = 0; index < list.size(); index++) {
            Integer n = list.get(index);
            // if the element appears more than once in the list delete all the copies of it
            if(list.lastIndexOf(n) > index) {
                for(int subindex = index + 1; subindex < list.size(); subindex++) {
                    if(list.get(subindex).equals(n)) {
                        list.remove(subindex);
                        subindex--;
                    }
                }
            }
        }
    }
    public static void printArray(ArrayList<Integer> list) {
        for (Integer var : list) {
            System.out.print(var + " ");
        }
    }
    // delete elements that appear even times
    public static void DeleteEvenTimesElements(ArrayList<Integer> list) {
        for(int index = 0; index < list.size(); index++) {
            Integer n = list.get(index);
            int count = 1;
            for(int subindex = index + 1; subindex < list.size(); subindex++) {
                if(list.get(subindex).equals(n)) {
                    count++;
                }
            }
            if(count % 2 == 0) {
                // element appears even times, delete that element
                for(int delIndex = 0; delIndex < list.size(); delIndex++) {
                    if(list.remove(n)) {
                        delIndex--;
                    }
                }
                // since delete the element at index
                index--;
            }
            else {
                // have to proceed to another integer instead of hoverint over the same number
                // e.g 5 5 5 since count = 3, will not delete 5, then index proceed to the second 5
                // then the count will be 2, now will delete 5 , what we dont want to happen
                while(index < list.size() && list.get(index).equals(n)) {
                    index++;
                }
                index--;
            }
        }
    }
}