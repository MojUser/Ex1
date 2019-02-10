import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        int[] array1 = new int[] {0,5,6,5,6};
        int[] array2 = new int[] {1,8,3,10};
        Integer[] joinedAndSorted = sortAndJoin(array1, array2);
        System.out.println(Arrays.toString(joinedAndSorted));
    }

    public static Integer[] sortAndJoin(int[] firstArr, int[] secondArr) {
        List<Integer> joined = new ArrayList<>();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);
        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));
        int i = 0;
        int j = 0;
        while (joined.size() != firstArr.length + secondArr.length) {
            if(i >= firstArr.length) {
                joined.add(secondArr[j]);
                j++;
            } else if(j >= secondArr.length){
                joined.add(firstArr[i]);
                i++;
            }else if(firstArr[i] >= secondArr[j]) {
                joined.add(secondArr[j]);
                j++;
            } else {
                joined.add(firstArr[i]);
                i++;
            }

        }
        Integer[] integers = new Integer[joined.size()];
        return joined.toArray(integers);
    }
}
