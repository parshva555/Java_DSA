public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //Descending
        int [] arr1 = {32345,5435,324,2,1,0,-18,-238746,};
        int targ1 = -18;
        int ans1 = orderAgnosticBinary(arr1,targ1);
        System.out.println("The element is found at index "+ans1);
        //Ascending
        int [] arr2 = {-123874623,-18,-2,0,1,2,3,4,5,6,7,8,89,};
        int targ2 = -18;
        int ans2 = orderAgnosticBinary(arr2,targ2);
        System.out.println("The element is found at index "+ans2);

    }
    static int orderAgnosticBinary(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // find whether the array is sorted in ascending order or descending.
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        } else{
            isAsc = false;
        }


        while(start <= end){

            int mid = start + (end - start) /2;
            // common condition for both ascending and descending
            if ( arr[mid]  == target){
                return mid;
            }
            // For ascending
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]){
                    start = mid + 1;
                }
            }
            // For descending
            else{
                if (target > arr[mid]){
                    end = mid-1;
                } else{
                    start = mid + 1;
                }
            }

        }
        // if element does not exist
        return -1;
    }
}
