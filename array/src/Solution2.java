import org.junit.Test;

/**
 * 搜索插入位置
 *
 * @author zzj
 * @since 2022/4/26 15:01
 */
public class Solution2 {
    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
     * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 请必须使用时间复杂度为 O(log n) 的算法。
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        if (target < nums[0]){
            return 0;
        }
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] <= target && nums[i + 1] >= target) {
                return i + 1;
            }
        }
        return nums.length;
    }

    @Test
    public void test() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }
}
