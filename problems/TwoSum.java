package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int nums [] = { 2, 4, 7, 8};
        int target = 9 ;
        int out[]=  idices(nums, target);
        System.out.println(Arrays.toString(out));

    }

    public static  int[] idices(int nums[], int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int remain = target - nums[i];
            if(map.containsKey(remain)){
                return new int[] {map.get(remain), i } ;
            }else{
                map.put( nums[i], i);
            }
        }
        return  new int[] {-1,-1};
    }
}
