package leetCode;

public class SubString {

    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int maximum = 0;
        while (right < s.length()) {
            char r = s.charAt(right);

            int index = chars[r];
            if (index >= left && index < right) {
                left = index + 1;
            }

            maximum = Math.max(maximum, right - left + 1);

            chars[r] = right;
            right++;
        }

        return maximum;
    }

}
