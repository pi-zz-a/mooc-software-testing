package tudelft.caesarshift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarShiftCipherTest {

    @Test
    public void testMiddleOfAlphabetPosShift() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertEquals("df", csc.CaesarShiftCipher("ce",1));
    }

    @Test
    public void testMiddleOfAlphabetNegShift() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertEquals("bd", csc.CaesarShiftCipher("ce",-1));
    }

    @Test
    public void testBeginOfAlphabetNegShift() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertEquals("yz",csc.CaesarShiftCipher("ab", -2));
    }

    @Test
    public void testEndOfAlphabetPosShift() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertEquals("zb",csc.CaesarShiftCipher("xz", 2));
    }
}
