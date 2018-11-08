package tudelft.sum;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    private TwoNumbersSum twoNumbersSum;
    private ArrayList<Integer> first;
    private ArrayList<Integer> second;
    private ArrayList<Integer> result;

    @BeforeEach
    public void setUp(){
        this.twoNumbersSum = new TwoNumbersSum();
        first = new ArrayList<>();
        second = new ArrayList<>();
    }

    @Test
    public void addNumbersWithEqualLengthTest() {
        first.add(1);
        first.add(2);
        second.add(1);
        second.add(3);
        result = new ArrayList<>(asList(2,5));
        assertEquals(result, twoNumbersSum.addTwoNumbers(first, second));
    }

    @Test
    public void addNumbersWithoutEqualLengthTest() {
        first.add(2);
        second.add(8);
        result = new ArrayList<>(asList(1,0));
        assertEquals(result, twoNumbersSum.addTwoNumbers(first, second));
    }

    @Test
    public void addNumbersWithoutEqualLengthTest2() {
        first.add(1);
        first.add(0);
        second.add(2);
        result = new ArrayList<>(asList(1,2));
        assertEquals(result, twoNumbersSum.addTwoNumbers(first, second));
    }


    @Test
    public void addTwoNegativeNumbersTest() {
        first.add(-1);
        first.add(0);
        second.add(-2);
        second.add(0);
        result = new ArrayList<>(asList(-3,0));
        assertEquals(result, twoNumbersSum.addTwoNumbers(first, second));
    }

    @AfterEach
    public void breakDown() {
        first = null;
        second = null;
        result = null;
    }
}
