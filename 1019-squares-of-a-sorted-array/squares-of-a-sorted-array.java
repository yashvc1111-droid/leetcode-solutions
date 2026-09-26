class Solution {
    public int[] sortedSquares(int[] nums) {
    
        int [] result = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        for(int i = nums.length-1; i >= 0; i--){

            int left = nums[start] * nums[start];
            int right = nums[end] * nums[end];

            if(left > right){
                result[i] = left;
                start++;
            }

            else {
                result[i] = right;
                end--;
            }
        }
        return result;
    }
}