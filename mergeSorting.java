public class mergeSorting{
    public static void mergeSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid); //for LEFT part
        mergeSort(arr, mid+1, ei);  //for RIGHT part
        merge(arr,si,mid,ei); //Combine in another Function
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;    //Iterator for right
        int j=mid+1; //Iterator for left
        int k=0;     //Iterator for temp

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++; k++;
            }
            else{
                temp[k]=arr[j];
                j++;k++;
            }
        }
        //for left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for Right Part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //Now Combine all
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
            
        }
       
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}