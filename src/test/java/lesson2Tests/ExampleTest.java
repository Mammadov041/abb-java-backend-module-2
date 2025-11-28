package lesson2Tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class ExampleTest {
    @DisplayName("Add metodu düzgün toplama qaytarmalıdır")
    @Test
    void testAdd() {
        Assertions.assertEquals(5, 2 + 3);
    }

    @Disabled("Hələ implement olunmayıb")
    @Test
    void skippedTest() {}

    @RepeatedTest(5)
    void testRepeat() {
        Assertions.assertTrue(Math.random() < 1);
    }

    @Tag("fast")
    @Test
    void testFast() {}

    @AfterAll
    static void endAll() {
        System.out.println("Bütün testlər tam bitti!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test bitdi");
    }

    @BeforeAll
    static void initAll() {
        System.out.println("Bütün testlər başlamadan əvvəl 1 dəfə işləyir");
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "10, 5, 15",
            "1, 1, 2"
    })
    void testAdd(int a, int b, int expected) {
        Assertions.assertEquals(expected, a + b);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 10})
    void testNumbers(int number) {
        Assertions.assertTrue(number > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ali", "Veli", "Saed"})
    void testNames(String name) {
        Assertions.assertTrue(name.length() > 0);
    }


}
