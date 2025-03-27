package problems;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digi = {1,2,3,4,5};
        System.out.println(Arrays.toString(answer(digi)));
    }

    public static int[] answer(int[] digits){
        int n = digits.length;
        for(int i =n-1 ; i>=0 ;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newArr = new int[n+1];
        newArr[0]=1;
        return  newArr;
    }
}
