public class rotated_sorted_array {
    public static int search(int arr[],int tar,int si,int ei){
        //Time Complexity:O(logn)
        //Base case
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2; //(si+ei)/2
        //Best case
        if(arr[mid]==tar){
            return mid;
        }
        //If mid exist on L1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static int linearSearch(int arr[],int tar){
        //time complexity:O(n)
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target=1;
        int idx=search(arr, target, 0, arr.length-1);
        System.out.println(idx);
        System.out.println(linearSearch(arr, target));
    }
}
