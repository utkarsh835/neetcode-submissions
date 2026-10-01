class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int comp = target-nums[i];
            if(list.contains(comp))return new int []{list.indexOf(comp),i};
            list.add(nums[i]);
        }
        return new int []{};
    }
}
