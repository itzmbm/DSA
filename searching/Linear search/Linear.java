import java.util.*;
import java.io.*;

public class Linear {
    public static void main(String args[]) {
        int[] arr={10,30,5,1,-11,25,-3};
        int target=5;
     int index=search(arr,target);
     if(index==-1){
         System.out.println("Element not found");
     }
     else{
         System.out.println("Element found at index :"+index);
     }
    }
    static int search(int[] arr,int target){
        if(arr.length==0)
        {
            return -1;
        }
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]==target)
         {
             return i;
         }
     }
     return -1;
    }
}