package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoNumbersSumTest {
    private TwoNumbersSum ts;

    @BeforeEach
    public void initialize() {
        this.ts = new TwoNumbersSum();
    }

    @Test
    public void sameLengthInputsTest() {
        ArrayList<Integer> l1 = new ArrayList<>( Arrays.asList(2, 4, 3) );
        ArrayList<Integer> l2 = new ArrayList<>( Arrays.asList(5, 6, 4) );
        ArrayList<Integer> res = new ArrayList<>( Arrays.asList(7, 0, 8) );
        ArrayList<Integer> result = ts.addTwoNumbers(l1, l2);
        Assertions.assertEquals(res, result);
    }

    @Test
    public void sameLengthBigInputsTest() {
        ArrayList<Integer> l1 = new ArrayList<>( Arrays.asList(9, 9, 9) );
        ArrayList<Integer> l2 = new ArrayList<>( Arrays.asList(9, 9, 9) );
        ArrayList<Integer> res = new ArrayList<>( Arrays.asList(8, 9, 9, 1) );
        ArrayList<Integer> result = ts.addTwoNumbers(l1, l2);
        Assertions.assertEquals(res, result);
    }

    @Test
    public void diffLengthInputsTest() {
        ArrayList<Integer> l1 = new ArrayList<>( Arrays.asList(2, 4, 3) );
        ArrayList<Integer> l2 = new ArrayList<>( Arrays.asList(5, 6, 4) );
        ArrayList<Integer> res = new ArrayList<>( Arrays.asList(7, 0, 8) );
        ArrayList<Integer> result = ts.addTwoNumbers(l1, l2);
        Assertions.assertEquals(res, result);
    }


}
