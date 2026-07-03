class Solution {
    public int[] twoSum(int[] nums, int n) {
        // Arrays.sort(nums);
        // int i=0, j=nums.length-1;
        int a=0,b=0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==n){
                    a=i;b=j;
                }
            }
        }
        // for(;i<nums.length && i!=j ;) {//2,3,3
        //     System.out.println("i "+i+" "+nums[i]+". "+nums[j]);
        //     if(nums[i]+nums[j] == target) {
        //         break;
        //     } else if(nums[i]+nums[j] > target) {
        //         j--;
        //     } else if(nums[i]+nums[j] < target) {
        //         i++;
        //     }
        // }

        return new int[]{a,b};
    }
}
