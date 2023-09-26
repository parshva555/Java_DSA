public class BinarySearch {
    public static void main(String[] args) {
        // This is for ascending order
        int [] arr = {-18,-14,-12,-11,0,1,2,3,4,5,6,7,8,9};
        int targ = 3;
        int ans = binary(arr,targ);
        System.out.println("The element is found at index "+ans);

    }

    // return the index
    // return -1 if it doesn't exist

    // This is for ascending order, if its for descending order then we will change the code accordingly
    static int binary(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            // find the middle element
//            int middle = (start + end)/2;
            //integer has a fixed size. start and end may exceed the range of Integer which will give error
            // so instead we use
            int mid = start + (end - start) /2;
            // if we user basic mathematics its the same
            // i.e 2start + end - start / 2
            // i.e start + end / 2

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                // answer found
                return mid;
            }
        }
        // if element does not exist
        return -1;
    }
}
