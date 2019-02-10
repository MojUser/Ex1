import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(getSumWithForLoop(arr));
        System.out.println(getSumWithStream(arr));
        System.out.println(getSumRecurrent(arr));
    }

    public static int getSumWithForLoop(int[] array){
        int accumulator = 0;
        for (int i = 0; i < array.length ; i++) {
            accumulator += array[i];
        }
        return accumulator;
    }

    public static int getSumWithStream(int[] array){
        return Arrays.stream(array).sum();
    }

    public static int getSumRecurrent(int[] array){
        return getSumRecurrentInternal(array, 0, 0);
    }

    private static int getSumRecurrentInternal(int[] array, int index, int accumulator) {
        if(index >= array.length){
            return accumulator;
        }
        int updatedAccumulator = accumulator + array[index];
        return getSumRecurrentInternal(array, index+1, updatedAccumulator);
    }
}
