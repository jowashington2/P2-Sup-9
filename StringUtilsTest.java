import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testConvertToUpperCase() {
        String input = "hello world";
        String result = StringUtils.convertToUpperCase(input);
        assertEquals("HELLO WORLD", result, "String should be converted to uppercase");
    }

    @Test
    void testConvertToUpperCaseEmpty() {
        String input = "";
        String result = StringUtils.convertToUpperCase(input);
        assertEquals("", result, "Empty string should remain empty");
    }
}
