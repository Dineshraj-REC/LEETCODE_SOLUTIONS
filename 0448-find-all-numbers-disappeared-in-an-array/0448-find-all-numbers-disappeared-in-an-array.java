class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int len = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }

        List<Integer> out = new ArrayList<>();

        for (int j = 1; j <= len; j++) {
            if (!set.contains(j)) {
                out.add(j);
            }
        }

        return out;
    }
}