import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kurumi Tokisaki on 2021-2-26.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        int n = strs.length;
        int min = 200;
        for (int i = 0; i < n; i++) {
            if (min > strs[i].length())
                min = strs[i].length();
        }
        Map map = new HashMap();
        int j = 0;
        do {
            map.clear();
            j++;
            for (int i = 0; i < n; i++) {
                map.put(strs[i].substring(0, j), "");
            }
        } while (map.size() == 1 && j < min);
        return strs[0].substring(0, j);
    }

    public static void main(String[] args) {
//        String[] strs = {"qq","qqa"};
        String[] strs = new String[3];
        strs[0] = "flower";
        strs[1] = "flow";
        strs[2] = "flight";
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String str = longestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(str);
    }
}
