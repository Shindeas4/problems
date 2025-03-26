package problems;

public class palindromeNumber {
    public static void main(String[] args) {
        int num = -121 ;
        String s = num + "" ;
        System.out.println(checkPalindrome(s));
    }

    public  static  boolean checkPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}
//Another approach
///class Solution {
///     public boolean isPalindrome(int x) {
///          int reversed = 0 ;
///          int originalNum = x ;
///         while ( x > 0){
///             reversed =  reversed * 10 + x % 10 ;
///             x = x/10 ;
///         }
///         return (reversed == originalNum ) ? true : false ;
///     }
/// }