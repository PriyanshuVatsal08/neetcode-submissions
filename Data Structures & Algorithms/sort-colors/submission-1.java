class Solution {
    public void swap(int[] nums,int s,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
    public void sortColors(int[] nums) {
        int left=0,mid=0,right=nums.length-1;
        while(mid <= right){
            if(nums[mid]==0){
                swap(nums,left,mid);
                left++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,right,mid);
                right--;
            }
        }
    }
}