public class FloorOfaGivenNo {
    public static void main(String[] args) {
        // This is for ascending order
        int [] arr = {2,3,6,7,9};
        int targ = 5;
        int ans = Floor(arr,targ);
        System.out.println("The element is found at index "+ans);
    }
    static int Floor(int [] arr, int target){
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
                return mid;
            }
        }
        return end;

        // if floor is asked instead of returning the start we return end

        // i.e for ceil we return start
        // for floor we return end
    }
}
