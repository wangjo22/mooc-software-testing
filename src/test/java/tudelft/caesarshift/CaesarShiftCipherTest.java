package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher csc;

    @BeforeEach
    public void initialize() {
        this.csc = new CaesarShiftCipher();
    }

    @Test
    public void inputWhichReturnTrueWithPositiveShift() {
        String ans = this.csc.CaesarShiftCipher("abcde", 3);
        Assertions.assertEquals("defgh", ans);
    }

    @Test
    public void inputWhichReturnTrueWithNegativeShift() {
        String ans = this.csc.CaesarShiftCipher("abcde", -5);
        Assertions.assertEquals("vwxyz", ans);
    }

    @Test
    public void capitalInputWhichReturnTrueWithNegativeShift() {
        String ans = this.csc.CaesarShiftCipher("abcD", 1);
        Assertions.assertEquals("invalid", ans);
    }

    @Test
    public void specialCharacterInputWhichReturnTrueWithNegativeShift() {
        String ans = this.csc.CaesarShiftCipher("abc*#", 1);
        Assertions.assertEquals("invalid", ans);
    }

    @Test
    public void emptyInputWhichReturnTrueWithNegativeShift() {
        String ans = this.csc.CaesarShiftCipher("", -5);
        Assertions.assertEquals("", ans);
    }

//    @Test
//    public void nullInputWhichReturnTrueWithNegativeShift() {
//        String ans = this.csc.CaesarShiftCipher(null, -5);
//        Assertions.assertEquals("", ans);
//    }
}
