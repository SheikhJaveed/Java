import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {7,3,1,2,8};
        //bubble sort
        //time complexity = O(n^2) because we ignore constants in (n-1),(n-2),... so nxn for i and j for loop
        for(int i=0;i<arr.length-1;i++){ //n-1 
            for(int j=0;j<arr.length-i-1;j++){ //n-i-1 
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //printing
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
