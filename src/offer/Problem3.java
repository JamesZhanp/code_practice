package offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: JamesZhan
 * @create: 2021 - 04 - 24 22:44
 */
public class Problem3 {

    public static int findRepeatNumber(int[] nums) {
        Set numsSet = new HashSet();

        for (int num : nums) {
            if (!numsSet.contains(num)){
                numsSet.add(num);
            }else {
                return num;
            }
        }
        return nums[0];
    }


    public static void main(String[] args) {
        int[] a = {2,3,1,0,5,3,2};
        System.out.println(findRepeatNumber(a));
    }
}
