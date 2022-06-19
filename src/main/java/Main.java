import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String words = scanner.nextLine();

        Function<String, Set<String>> function = wordsIn -> Arrays.stream(wordsIn.split(" "))
                .map(word -> word.replaceAll("(?U)[\\pP\\s]", ""))
                .collect(Collectors.toSet());

        System.out.println(function.apply(words));
        scanner.close();
    }
}
