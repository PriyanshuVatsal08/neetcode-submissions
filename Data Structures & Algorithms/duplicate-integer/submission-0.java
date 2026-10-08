class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i : nums){
            int len=map.getOrDefault(i,0);
            map.put(i,len+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }

        return false;
    }
}