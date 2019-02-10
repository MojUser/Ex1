import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main2Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Double> liczby = new HashSet<>();
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Podaj liczbę: ");
            liczby.add(scanner.nextDouble());
        }
        //1. Użycie tablicy
        Double[] liczbyArray = new Double[liczby.size()];
        Double[] setArray = liczby.toArray(liczbyArray);
        Arrays.sort(setArray, Comparator.reverseOrder());
        System.out.println(Arrays.toString(setArray));
        //2. Użycie streamu
        List<Double> list = liczby.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);

    }
}
