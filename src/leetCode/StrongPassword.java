package leetCode;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
    public static void main(String[] args) {
        String s = "2bbbb";
        int n = 5;

        int result = (returnMinimumCharactersToMakeStrongPassword(s, n));
        System.out.println(result);
    }

    private static int returnMinimumCharactersToMakeStrongPassword(String s, int n) {
        Pattern digitPattern = Pattern.compile("\\d");
        Pattern upperPattern = Pattern.compile("[A-Z]");
        Pattern lowerPattern = Pattern.compile("[a-z]");
        Pattern specialPattern = Pattern.compile("\\W");

        Matcher digitMatcher = digitPattern.matcher(s);
        Matcher upperMatcher = upperPattern.matcher(s);
        Matcher lowerMatcher = lowerPattern.matcher(s);
        Matcher specialMatcher = specialPattern.matcher(s);


        int result = 0;

        if (!digitMatcher.find()) {
            result++;
        }
        if (!upperMatcher.find()) {
            result++;
        }
        if (!lowerMatcher.find()) {

            result++;
        }
        if (!specialMatcher.find()) {
            result++;
        }
        if (n + result < 6) {
            result += 6 - (n + result);
        }
        return result;
    }
}
