/**
 * Created by Kurumi Tokisaki on 2021-2-26.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        //公共前缀比所有字符串都短，随便选一个先
        String s = strs[0];
        for (String string : strs) {
            while (!string.startsWith(s)) {
                if (s.length() == 0) return "";
                //公共前缀不匹配就让它变短！
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String[] strs = {"qq", "qqa"};
        //      String[] strs = new String[3];
//        strs[0] = "";
        // strs[1] = "";
        //strs[2] = "";
        Solution solution = new Solution();
        String str = solution.longestCommonPrefix(strs);
        System.out.println(str);
    }
}
