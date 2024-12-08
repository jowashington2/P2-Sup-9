import java.util.List;
import java.util.stream.Collectors;

public class ListUtils {

    /**
     * Returns all even numbers from the given list of integers.
     * @param numbers List of integers.
     * @return List<Integer> List of even numbers.
     */
    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .collect(Collectors.toList());
    }

    /**
     * Returns the longest string in the given list of strings.
     * @param strings List of strings.
     * @return String The longest string.
     */
    public static String getLongestString(List<String> strings) {
        return strings.stream()
                      .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                      .orElse("");
    }
}
