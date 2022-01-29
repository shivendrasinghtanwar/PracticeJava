import com.sunny.challenges.arrays.ReverseArray;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        ReverseArray.reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
}
