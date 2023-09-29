public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int [] arr  = {1,5,6,7,31};
        int target = 5;
        int ans = binary(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int binary(int [] arr, int target,int s , int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(target< arr[m]){
            return binary(arr,target,s,m-1);
        }
        return binary(arr,target,m+1,e);

    }
}
