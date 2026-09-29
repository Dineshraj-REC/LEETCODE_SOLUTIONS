class Solution {
    public int missingNumber(int[] nums) {
        int a=(nums.length*(nums.length+1))/2;
        for(int n:nums){
            a-=n;
        }
        return a;
    }
}
