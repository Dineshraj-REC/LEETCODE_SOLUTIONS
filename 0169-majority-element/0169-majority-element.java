class Solution {
    public int majorityElement(int[] nums) {
        int ca=0;
        int c=0;
        for(int n:nums){
            if(c==0){
                ca=n;
            }
            if(n==ca){
                c++;
            }
            else{
                c--;
            }
            
        }
        return ca;
    }
}