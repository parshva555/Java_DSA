public class RotationCount {
    // https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }
    // basically it is the same that we did in the last leetcode question i.e rotatedBinarySearch
    // the rotate count will be the pivot index + 1
    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        if (pivot == -1){
            //array is not rotated
            return  0;
        }
        return pivot +1;
    }
    //use this for non duplicates
    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid  = start + (end - start) / 2;
            // 4 Cases over here
            if(mid < end  && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
//    use this for duplicates
    static int findPivotWithDuplicates(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid  = start + (end - start) / 2;
            // 4 Cases over here
            if(mid < end  && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            // if elements at middle,start,end are equal just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                //Note what if the elements at the start and the end were the pivots??
                //check if start is pivot
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                //check if end is pivot
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in the right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end  =mid-1;
            }
        }
        return -1;
    }


}
