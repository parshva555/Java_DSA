public class LinearSearch{
    public static void main(String[] args) {
        int [] nums = {234,523,2134,453,123,4345,4};
        int target = 4;
        System.out.println(linear(nums,target));
    }
    // search in the array
    static int linear(int [] arr, int target){
        if ( arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i+1;
            }
        }
        return -1;
    }
}