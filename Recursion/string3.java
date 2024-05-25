//checking if an array is sorted or not
public class string3 {
    public static boolean isSorted(int arr[],int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            //array is unsorted
            return false; 
        }else{
            return isSorted(arr, idx+1);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,3,3};
        System.out.println(isSorted(arr, 0));
    }
}
