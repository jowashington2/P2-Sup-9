import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class ListUtilsTest {

    @Test
    void testGetEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evens = ListUtils.getEvenNumbers(numbers);
        assertEquals(Arrays.asList(2, 4, 6), evens, "Even numbers should be [2, 4, 6]");
    }

    @Test
    void testGetLongestString() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        String longest = ListUtils.getLongestString(strings);
        assertEquals("banana", longest, "Longest string should be 'banana'");
    }
}
