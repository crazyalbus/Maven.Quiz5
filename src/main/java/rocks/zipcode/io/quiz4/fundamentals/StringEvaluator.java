package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> substrings = new HashSet<>();

        for (int i = 0; i <= string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                substrings.add(string.substring(i,j));
            }
        }

        return substrings.toArray(new String[substrings.size()]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {

        String[] string1Substrings = getAllSubstrings(string1);
        List<String> string2Substrings = Arrays.stream(getAllSubstrings(string2)).collect(Collectors.toList());
        List<String> commonSubstrings = new ArrayList<>();

        for (String substring : string1Substrings) {
            if(string2Substrings.contains(substring)){
                commonSubstrings.add(substring);
            }
        }

        return commonSubstrings.toArray(new String[commonSubstrings.size()]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubstrings = getCommonSubstrings(string1, string2);
        String result = "";
        for (String substring : commonSubstrings) {
            if(result.length() < substring.length()){
                result = substring;
            }
        }
        return result;
    }
}
