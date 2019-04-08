package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] substrings = StringEvaluator.getAllSubstrings(string);
        List<String> palindromes = new ArrayList<>();
        for (String substring : substrings) {
            if(isPalindrome(substring)){
                palindromes.add(substring);
            }
        }
        return palindromes.toArray(new String[palindromes.size()]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(string);
        return reversedString.reverse().toString();
    }
}