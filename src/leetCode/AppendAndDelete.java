package leetCode;


public class AppendAndDelete {

    public static void main(String[] args) {
        System.out.println(appendAndDelete("ashley", "ash", 5));
    }
    private static String appendAndDelete(String s, String t, int k) {
        int toDelete;
        int i = 0;
        while (i < s.length() && i < t.length() && s.charAt(i) == t.charAt(i)) {
            i++;
        }
        toDelete = s.length() - i;
        int ops = toDelete + (t.length() - i);
        if (ops <= k && ((k - ops) % 2 == 0 || (k - ops) > 2 * i)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
