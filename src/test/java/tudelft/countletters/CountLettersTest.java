package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("catr|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void firstWordDoesNotMatch() {
        int words = new CountLetters().count("cat|dogs");
        Assertions.assertEquals(1, words);
    }


    @Test
    public void singleWordDoesNotMatch() {
        int words = new CountLetters().count("cat");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void singleWordDoesMatch() {
        int words = new CountLetters().count("catr");
        Assertions.assertEquals(1, words);
    }

}