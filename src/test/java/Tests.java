import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

    @Test
    public void testGreaterThanMaxLength() {
        String input = "This is a long string that is greater than 25 characters";
        String expectedOutput = ShortenString.shortenString(input, 25);
        assertEquals(expectedOutput, ShortenString.shortenString(input, 25));
    }

        @Test
        public void testEqualMaxLength() {
            String input = "This is a string that is 25 characters";
            String output = ShortenString.shortenString(input, 90);
            assertEquals(input + "...", output);
        }

        @Test
        public void testLessThanMaxLength() {
            String input = "This is a short string";
            assertNotEquals(input, ShortenString.shortenString(input, 22));
        }

        @Test
        public void testZeroMaxLength() {
            String input = "This is a long string";
            String expectedOutput = "";
            assertEquals(expectedOutput, ShortenString.shortenString(input, 0));
        }

        @Test
        public void testNotNull() {
            String input = "This is a long string";
            Assert.assertNotNull(ShortenString.shortenString(input, 10));
        }

    @Test
    public void testOtherLanguage() {
        String input = "Воля и разум";
        Assert.assertEquals(input + "...", ShortenString.shortenString(input, 17));
    }
    @Test
    public void testOtherLanguageCh() {
        String input = "福 喜 愛 永愛 幸 富錢";
        Assert.assertNotEquals(input, ShortenString.shortenString(input, 2));
    }
    @Test
    public void testSpace() {
        String input = "     ";
        Assert.assertNotEquals(input, ShortenString.shortenString(input, 0));
    }
    @Test
    public void testSymbol() {
        String input = "!@ # $ % ^&*()?><|";
        Assert.assertEquals(input + "...", ShortenString.shortenString(input, 30));
    }

    public static void main(String[] args) {
        String str = ShortenString.shortenString("!@ # $ % ^&*()?><|", 9);
        System.out.println(str);
        String input = "!@ # $ % ^&*()?><|" + "...";
        System.out.println(input.length());
    }
    }


