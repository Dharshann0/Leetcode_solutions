class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int lft = 0; 
        int rgt = nums.length-1;
        int idx = nums.length-1;
        while(lft <=rgt){
            if((int)Math.pow(nums[lft] , 2) < (int) Math.pow(nums[rgt] , 2)){
                res[idx] = (int) Math.pow(nums[rgt] , 2);
                rgt--;
                //idx--;
            }
            else{
                res[idx] =(int)  Math.pow(nums[lft] , 2);
                lft++;
                //idx--;
            }
        idx--;
        }
        return res;
    }
}