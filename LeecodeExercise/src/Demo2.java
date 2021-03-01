/**
 * Created by Kurumi Tokisaki on 2021-1-16.
 */
public class Demo2 {
    public int reverse(int x) {
        long temp = 0;
        while (x != 0) {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }
        return temp == (int) temp ? (int) temp : 0;
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        int num = -123;
        System.out.print(demo2.reverse(num));
    }
}
