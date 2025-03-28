package problems;

public class SearchInsert {

    public static void main(String[] args) {
        int[] nums = { 1,3,5,6};
        System.out.println(searchInsert(nums,5 ));
        searchInsert(nums,2 );
    }



        public static int searchInsert(int[] nums, int target) {
            int n = nums.length ;
            for(int i =0 ; i<n-1 ; i++){
                if( nums[i] >= target ){
                    return i ;
                }
            }
            return n;
        }

}
