给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。如果不存在符合条件的连续子数组，
返回 0。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int ret=nums.length+1;
        int sum=0;
        int left=0;
        int right=0;
        while(right<nums.length){
            sum+=nums[right];
            right++;
            while(left<right&&sum>=s){
                ret=Math.min(ret,right-left);
                sum-=nums[left];
                left++;
            }
        }
        return ret==nums.length+1?0:ret;
    }
}