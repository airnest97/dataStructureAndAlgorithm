package leetCode;

public class PeakElement {

    public static void main(String[] args) {
        int [] arr = {2,3,4,2,2,1,2,3,3,2,4};
        System.out.println(peak(arr));
    }

    public static int peak(int[] array){
        int index = 0;
        for (int i = 1; i < array.length-1; i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1]) {
                index = i;
            }
        }
        return index;
    }
}
