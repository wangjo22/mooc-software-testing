package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.roman.RomanNumeral;

public class MirrorTest {
    private Mirror mirror;

    @BeforeEach
    public void initialize() {
        this.mirror = new Mirror();
    }

    @Test
    public void givenExampleTest1() {
        String ans = this.mirror.mirrorEnds("abXYZba");
        Assertions.assertEquals("ab", ans);
    }
    @Test
    public void givenExampleTest2() {
        String ans = this.mirror.mirrorEnds("abca");
        Assertions.assertEquals("a", ans);
    }
    @Test
    public void givenExampleTest3() {
        String ans = this.mirror.mirrorEnds("aba");
        Assertions.assertEquals("aba", ans);
    }
}
