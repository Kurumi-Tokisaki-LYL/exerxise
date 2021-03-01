import java.util.Arrays;

/**
 * Created by Kurumi Tokisaki on 2021-1-16.
 */
public class Test {
    public static void main(String[] args) {
        Demo dem = new Demo();
        int a[] = {2, 7, 11, 16};
        int b = 9;
        System.out.print(Arrays.toString(dem.twoSum(a, b)));
    }
}
