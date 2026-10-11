class Solution {
    public static void swap(int[]nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int s=0,mid=0,e=nums.length-1;

        while(mid<=e){
            if(nums[mid]==0){
                swap(nums,s,mid);
                s++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,e);
                e--;
            }
        }
    }
}