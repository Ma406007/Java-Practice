package Util;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println(ArrayUtil.printArray(arr1));

        double[] arr2 = {1.5, 3.7, 4.9, 5.8, 6.6};

        System.out.println(ArrayUtil.getAverage(arr2));
    }
}
