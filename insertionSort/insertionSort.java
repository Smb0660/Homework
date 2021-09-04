package insertionSort;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5,4,8,6,2,3};
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > current)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        System.out.println(Arrays.toString(array));
    }
}
