public class LinearSearch {
    public static void main(String[] args) {
        int [] nums = {234,523,2134,453,123,4345,4};
        int target = 43;
        System.out.println(linearsearch(nums,target));
    }
    // search in the array
    static int linearsearch(int [] arr, int target){
        if ( arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        // This Line will execute if none of the return statements above are executed
        // hence the target is not found
        return -1;
    }
}
