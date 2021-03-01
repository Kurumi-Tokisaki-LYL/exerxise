/**
 * Created by Kurumi Tokisaki on 2021-1-16.
 */
public class Demo3 {
    public boolean isPalindrome(int x) {
        int temp = 0, temp1 = x;
        while (x != 0) {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }
        return temp == temp1 && temp1 >= 0 ? true : false;
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        int num = 0;
        System.out.print(demo3.isPalindrome(num));
    }
}
