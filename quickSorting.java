public class quickSorting {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[],int si,int ei){
        //Base Case
        if(si>=ei){
            return;
        }
        int pivIdx=partition(arr,si,ei);
        quickSort(arr, si, pivIdx-1); //for left part
        quickSort(arr, pivIdx+1, ei); //for right part
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //for j=ei
        i++;
        int temp=pivot;
        arr[ei]=arr[i]; //pivot=arr[ei] as in java call by reference so
        arr[i]=temp;
        return i;
    }
    public static void main (String args[]){
        int arr[]={6,3,9,8,2,5,-2,-9,-1};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
