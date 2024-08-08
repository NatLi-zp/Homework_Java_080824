import java.util.Arrays;
import java.util.Random;

public class Class1 {
    public static void main(String[] args) {
        changeArray(createArray());
    }

    public static int[] createArray() {
        Random rand = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50) + 1;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

