class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;

        for(int i : nums){
            if(count==0){
                candidate=i;
                count=1;
            }else if(candidate==i){
                count++;
            }else{
                count--;
            }
        }

        count=0;

        for(int i: nums){
            if(candidate==i){
                count++;
            }
        }

        if(count > nums.length/2){
            return candidate;
        }

        return 0;
    }
}