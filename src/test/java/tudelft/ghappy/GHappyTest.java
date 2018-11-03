package tudelft.ghappy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GHappyTest {

    @Test
    public void testSingleG() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("g"));
    }

    @Test
    public void testSingleSurroundedG() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("xgx"));
    }

    @Test
    public void testDoubleG() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("gg"));
    }

    @Test
    public void testDoubleGNotNeighbours() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("xgxg"));
    }

}
