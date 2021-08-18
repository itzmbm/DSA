 // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String args[]){
        int[] arr={437,315,322,431,686,264,442};
        System.out.println(findNumbers(arr));
    }
   public static int findNumbers(int[] nums) {
      int count=0;
     for(int num:nums){
         if(even(num)){
             count++;
         }
     }
        return count;
    }

    static boolean even(int num){
    //     if(digits(num)%2==0){
    //         return true;
    //     }
    //    return false; 
return digits(num) %2==0;   
}
static int digits(int num){
    if(num<0){
        num=num*-1;
    }
    return (int)(Math.log10(num))+1;
}
    // static int digits2(int num){
    //     if(num<0){
    //         num=num*-1;
    //     }
    //     if(num==0){
    //         return 1;
    //     }
    //     int count=0;
    //     while(num>0){
    //         count++;
    //         num=num/10;
    //     }
    //     return count;
    // }
    
}