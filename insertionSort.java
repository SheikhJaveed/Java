public class insertionSort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        //time complexity = O(n^2)
        //insertion sort
        for(int i=1;i<arr.length;i++){ //i=1 because we are assuming first element to be sorted and other elements to be sorted
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){ //we are using j>=0 to traverse through the sorted array
                arr[j+1] = arr[j]; //basically we are swapping the numbers  like arr[1]=arr[0] so 7=3 and 3 and 7 will exchange places
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
