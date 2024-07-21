package basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedTest {
    public int sum(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            return 0;
        }

    }

    @Test
    void simpleCase() {
        assertEquals(5, sum(2, 3));
    }

    @Test
    void maxInt() {
        assertEquals(-2147483648, sum(Integer.MAX_VALUE, 1));
    }

    @Test
    void minInt() {
        assertEquals(Integer.MIN_VALUE + 1, sum(Integer.MIN_VALUE, 1));
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(ints = {2, Integer.MAX_VALUE, Integer.MIN_VALUE})
    void parametrizedTest(int a) {
        assertEquals(a + 1, sum(a, 1));

    }

    @ParameterizedTest
    @MethodSource("methodInts")
    void parametrizedTest2(int a, int b, int result) {
        assertEquals(result, sum(a, b));
    }

    static Stream<Arguments> methodInts() {
        return Stream.of(
                Arguments.arguments(null, 1, 0),
                Arguments.arguments(null, null, 0),
                Arguments.arguments(Integer.MAX_VALUE, 3, Integer.MIN_VALUE),
                Arguments.arguments(Integer.MIN_VALUE, 1, Integer.MIN_VALUE + 1)
        );
    }


    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "0,  0, 0"

    })
    void parametrizedTest3(int a, int b, int result) {
        assertEquals(result, sum(a, b));
    }

    @ParameterizedTest
    @CsvFileSource(resources="/values.csv", numLinesToSkip=1)
    void parametrizedTest4(int a, int b, int result) {
        assertEquals(result, sum(a, b));

    }

}