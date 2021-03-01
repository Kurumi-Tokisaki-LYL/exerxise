/**
 * Created by Kurumi Tokisaki on 2021-1-16.
 */
public class Demo {
    public int[] twoSum(int[] nums, int target) {
        int[] re = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    re[0] = i;
                    re[1] = j;
                    return re;
                }
            }
        }
        return null;
    }
}


