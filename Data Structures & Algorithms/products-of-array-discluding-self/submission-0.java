class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int noOfZeros = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0) {
                totalProduct *=  nums[i];
            } else {
                noOfZeros++;
            }
        }
        if (noOfZeros > 1) {
            return new int[nums.length];
        }
        for(int i=0;i<nums.length;i++) {
            if(noOfZeros == 0) {
                nums[i] = totalProduct/nums[i];
            } else if(noOfZeros == 1 && nums[i] == 0){ 
                nums[i] = totalProduct;
            } else if(noOfZeros == 1 && nums[i] != 0){ 
                nums[i] = 0;
            }
            
        }
        return nums;
    }
}  
