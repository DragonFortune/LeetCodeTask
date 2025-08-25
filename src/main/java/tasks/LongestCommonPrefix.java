package tasks;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        return Arrays.stream(strs)
                .reduce((s1, s2) -> {
                    int minLength = Math.min(s1.length(), s2.length());
                    int i = 0;
                    while (i < minLength && s1.charAt(i) == s2.charAt(i)) {
                        i++;
                    }
                    return s1.substring(0, i);
                })
                .orElse("");
    }
}
