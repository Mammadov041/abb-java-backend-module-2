package lesson2Tests;

import lesson2.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarTest {
    @Test
    @DisplayName("Checks out first car gear")
    void testFirstCarGear() {
        Assertions.assertEquals(Car.changeGear(1),"1");
    }

    @Test
    @DisplayName("Checks out second car gear")
    void testSecondCarGear() {
        Assertions.assertEquals(Car.changeGear(2),"2");
    }

    @ParameterizedTest
    @DisplayName("Checks out 3,4,5 car gear")
    @ValueSource(ints = {3,4,5})
    void testOthersCarGear(int gear) {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Car.changeGear(gear)
        );
    }

}
