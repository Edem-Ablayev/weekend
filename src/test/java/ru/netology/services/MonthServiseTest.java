package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthServiseTest {

    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2",
    })
    public void calcNumberOfMonthsOfRest(int income, int expenses, int threshold, int expected) {
        MonthServise servise = new MonthServise();
        int actual = servise.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
