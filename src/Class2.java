import java.util.Arrays;
import java.util.Random;

public class Class2 {
    public static void main(String[] args) {
        boolean flag = checkArray(createArray());
        if (flag) {
            System.out.println("Массив - строго возрастающая последовательность.");
        } else {
            System.out.println("Массив - не строго возрастающая последовательность.");
        }
    }

    public static int[] createArray() {
        Random rand = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(90) + 10;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static boolean checkArray(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
            return false;
            }
        }
        return true;
    }
}
