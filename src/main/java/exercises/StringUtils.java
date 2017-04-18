package exercises;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gvquiroz on 4/4/2017.
 */
public class StringUtils {

    public boolean hasUniqueCharactersUsingSet(String inputString) {
        Set<Character> tempSet = new HashSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (!tempSet.add(inputString.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean hasUniqueCharacters(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            int index = inputString.indexOf(inputString.charAt(i), i + 1);
            if (index != -1) {
                return false;
            }
        }
        return true;
    }

}
