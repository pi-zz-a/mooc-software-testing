package tudelft.mirror;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorTest {
    private Mirror mirror;

    @BeforeEach
    public void setUp() {
        mirror = new Mirror();
    }

    @Test
    public void testEvenInput() {

        String mirrorEnds = mirror.mirrorEnds("abba");
        assertEquals("abba", mirrorEnds);
    }

    @Test
    public void testUnevenInput() {
        String mirrorEnds = mirror.mirrorEnds("aba");
        assertEquals("aba", mirrorEnds);
    }
}
