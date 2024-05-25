public class Merge_sort {
    //time complexity = nlog(n)
    public static void conquer(int arr[],int si,int mid,int ei){
        int merged[] =new int[ei-si+1]; //+1 because index starts from zero
        int idx1 = si; //tracks the first sorted array
        int idx2 = mid+1; //tracks the second sorted array
        int x=0; //to track the merged[] array
        while(idx1<=mid && idx2<=ei){ //both arrays are traversed till the end
            if(arr[idx1]<=arr[idx2]){  //we are comparing 1st and 2nd sorted array
                merged[x++]=arr[idx1++]; // instead of writing x++ and idx++ in next line we can do it in the same line 
            }else{
                merged[x++]=arr[idx2++];
            }
        }
        //any one of the two while loops will work
        //we do this to keep the remaining elements after sorting in the merged[] array
        while(idx1 <=mid)
            merged[x++]=arr[idx1++];
        while(idx2<=ei)
            merged[x++]=arr[idx2++];

        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];  //arr[0]=merged[0] say arr[0]=2 - we are storing the sorted values in the same array
        }
    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2; //we can use (si+ei)/2 also but in some cases when numbers are large it goes out of int range, so we use this new formula
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,2,5,8};
        int n = arr.length;
        divide(arr, 0, n-1);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
