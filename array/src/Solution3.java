import org.junit.Test;

/**
 * 移动零
 *
 * @author zzj
 * @since 2022/4/28 16:47
 */
public class Solution3 {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
     * @param nums
     */
    public int[] moveZeroes(int[] nums) {
        int[] newNums = new int[nums.length];
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                newNums[x] = nums[i];
                x++;
            }
        }
        return newNums;
    }
    public void moveZeroes2(int[] nums) {
        if (nums == null){
            return;
        }
        int j = 0;
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for (int i = j; i < nums.length ; i++) {
            nums[i] = 0;
        }
    }

    public void moveZero3(int[] nums){
        if (nums == null){
            return;
        }
        //两个指针i和j
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0){
                //当前元素!=0，就把其交换到左边，等于0的交换到右边
                if (nums[j] == 0){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j++] = tmp;
                }
            }
        }
    }



}
