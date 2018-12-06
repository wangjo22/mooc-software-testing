package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.mirror.Mirror;

public class GHappyTest {
    private GHappy gh;

    @BeforeEach
    public void initialize() {
        this.gh = new GHappy();
    }

    @Test
    public void regularInputWhichReturnTrue() {
        boolean ans = this.gh.gHappy("xxggxx");
        Assertions.assertEquals(true, ans);
    }
    @Test
    public void regularInputWhichReturnFalse() {
        boolean ans = this.gh.gHappy("xxgxx");
        Assertions.assertEquals(false, ans);
    }
    @Test
    public void moreComplexRegularInputWhichReturnsFalse() {
        boolean ans = this.gh.gHappy("xxggyygxx");
        Assertions.assertEquals(false, ans);
    }

    @Test
    public void boundaryCheckWhichReturnFalse() {
        boolean ans = this.gh.gHappy("g");
        Assertions.assertEquals(false, ans);
    }

    @Test
    public void boundaryCheckWhichReturnTrue() {
        boolean ans = this.gh.gHappy("gg");
        Assertions.assertEquals(true, ans);
    }

    @Test
    public void emptyInput() {
        boolean ans = this.gh.gHappy("");
        Assertions.assertEquals(true, ans);
    }

    @Test
    public void nullInput() {
        boolean ans = this.gh.gHappy(null);
        Assertions.assertEquals(true, ans);
    }
}
