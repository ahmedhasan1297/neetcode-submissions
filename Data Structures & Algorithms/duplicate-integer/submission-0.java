class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> input = new HashSet<>();
        for(int a:nums) {
            var res = input.add(a);
            if(!res) {
                return true;
            }
        }
        return false;
    }
}