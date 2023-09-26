public class Max {
    public static void main(String[] args) {
        int [] arr = { 1 ,2,3,4,5,6,32,3223,54,23,4};
        System.out.println(Maximum(arr));
        System.out.println(MaximumRange(arr,1,3));
    }

    static int MaximumRange(int [] arr, int start,int end){
        // error handling
        if (end > start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        //
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int Maximum(int [] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0 ];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


}
