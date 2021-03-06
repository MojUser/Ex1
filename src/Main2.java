import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main2 {
    public static Set<Integer> numbers = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> liczby = new HashSet<>();
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Podaj liczbę: ");
            liczby.add(scanner.nextInt());
        }
        //1. Użycie tablicy
        Integer[] liczbyArray = new Integer[liczby.size()];
        Integer[] setArray = liczby.toArray(liczbyArray);
        Arrays.sort(setArray);
        System.out.println(Arrays.toString(setArray));
        //2. Użycie streamu
        List<Integer> list = liczby.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
    }
}
