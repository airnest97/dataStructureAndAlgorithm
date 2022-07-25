package leetCode;

import java.util.Arrays;

public class ShiftingZeros {
    public static void main(String[] args) {
        int[] number = {1, 4, 0, 1, 0, 0, 9, 0, 1};
        System.out.println(Arrays.toString(zeros(number)));
    }

    public static int[] zeros(int[] nums) {
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[zero] = nums[i];
                zero++;
            }
        }
        for (; zero < nums.length; zero++) {
            nums[zero] = 0;
        }
        return nums;
    }
}
