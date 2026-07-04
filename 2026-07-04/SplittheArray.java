class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int count=-1;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i : nums){
            int currentCount = map.getOrDefault(i, 0) + 1;
            map.put(i, currentCount);
            
            if (currentCount > 2) {
                count = i; 
                break;
                } 
        } 
        if (count != -1){
            return false;
        }  
        else {
            return true;
        }
    } 
}