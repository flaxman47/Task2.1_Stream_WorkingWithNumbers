import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intListSort = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {

            int x = intList.get(i);
            if (x > 0 && x % 2 == 0) {
                intListSort.add(x);
            }
        }

        intListSort.sort(Comparator.naturalOrder());

        for (int i = 0; i < intListSort.size(); i++) {
            System.out.print(intListSort.get(i) + " ");
        }
    }
}