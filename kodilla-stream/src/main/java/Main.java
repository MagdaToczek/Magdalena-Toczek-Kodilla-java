import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static long getCountEmptyStringUsingJava8(List<String> strings) {
        return strings.stream()
                .filter(String::isEmpty)
                .count();
    }

    public static long getCountLength3UsingJava8(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() == 3)
                .count();
    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {

        return strings.stream()
                .filter(s -> s.length() != 0)
                .collect(Collectors.toList());
    }

    public static String getMergedStringUsingJava8(List<String> strings, String s) {
        return strings.stream()
                .filter(string -> string.length() != 0)
                .collect(Collectors.joining(s));
    }

    public static List<Integer> getSquaresJava8(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static Integer getMaxJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(i -> i)
                .max()
                .getAsInt();
    }

    public static Integer getMinJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(i -> i)
                .min()
                .getAsInt();
    }

    public static Integer getSumJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(i -> i)
                .sum();
    }

    public static Integer getAverageJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(i -> i)
                .sum()/numbers.size();
    }
}
