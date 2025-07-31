import java.util.*;

class secondLargest{
    public static void main(String args[]){
        int [] arr = {8,3,1,9,7,6,0,5};
        int firstLarge = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > firstLarge){
                secondLarge = firstLarge;
                firstLarge = arr[i];
            }
            else if(arr[i] > secondLarge && arr[i] != firstLarge){
                secondLarge = arr[i];
            }
        }
        System.out.println(secondLarge);
    }
}