/**
 * Created by Kurumi Tokisaki on 2021-2-27.
 */
public class IsValid2 {
    public boolean isValid(String s) {
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }
        return s.length() == 0;
    }

    public static void main(String[] args) {
        String str = "([{}])";
        IsValid2 isValid2 = new IsValid2();
        System.out.print(isValid2.isValid(str));
    }
}
