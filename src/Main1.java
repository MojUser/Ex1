import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 6, 11, 56, 22, -1 ,55, -5, 0, 100, 511, 55);
        System.out.println(integerList);
        integerList.sort(Comparator.naturalOrder());
        System.out.println(integerList);
        integerList.sort(Comparator.reverseOrder());
        System.out.println(integerList);
    }
}
