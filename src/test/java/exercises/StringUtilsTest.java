package exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by gvquiroz on 4/4/2017.
 */
public class StringUtilsTest {

    @Test
    public void hasUniqueCharacters() {
        StringUtils stringUtils = new StringUtils();

        assertFalse(stringUtils.hasUniqueCharacters("gaabi"));
        assertFalse(stringUtils.hasUniqueCharacters("ggaabi"));
        assertFalse(stringUtils.hasUniqueCharacters("  a"));

        assertTrue(stringUtils.hasUniqueCharacters("gabi"));
        assertTrue(stringUtils.hasUniqueCharacters("abcdefghi"));
        assertTrue(stringUtils.hasUniqueCharacters("abcde fghi"));

    }

    @Test
    public void hasUniqueCharactersUsingSet() {
        StringUtils stringUtils = new StringUtils();

        assertFalse(stringUtils.hasUniqueCharactersUsingSet("gaabi"));
        assertFalse(stringUtils.hasUniqueCharactersUsingSet("ggaabi"));
        assertFalse(stringUtils.hasUniqueCharactersUsingSet("  a"));

        assertTrue(stringUtils.hasUniqueCharactersUsingSet("gabi"));
        assertTrue(stringUtils.hasUniqueCharactersUsingSet("abcdefghi"));
        assertTrue(stringUtils.hasUniqueCharactersUsingSet("abcde fghi"));
    }

}
