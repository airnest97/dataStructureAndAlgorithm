package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[] args) {
        int [] twoArray = {5,1,3,4,8,5};

        System.out.println(Arrays.toString(twoSum(twoArray, 8)));
        System.out.println(Arrays.toString(sum(twoArray, 8)));
    }

    public static int[] twoSum(int[] array, int target){
        int[] newArray = new int[2];
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == target){
                    newArray[0] = i;
                    newArray[1] = j;
                }
            }
        }
        return newArray;
    }

    public static int[] sum(int[] array, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int difference = target - array[i];
            if (map.containsKey(difference)){
                return new int[] {map.get(difference), i};
            }
            map.put(array[i], i);
        }
        return null;
    }
}
