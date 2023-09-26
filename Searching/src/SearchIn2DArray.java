import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,234234523    ,3},
                {235,234,4563},
                {56,2364512,22354353},
                {43,645}
        };
        int target = 23645;
        int [] ans  = search(arr,target); // format of return value {row,col}
        System.out.println(Arrays.toString(ans));

        int ans2 = max(arr);
        System.out.println((ans2));
    }
    static int[] search(int [][] arr, int target){
        for (int row = 0; row < arr.length ; row++) {
            for(int col = 0; col< arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col}; // this is because the array we n
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int [][] arr){
        int ans = arr[0][0];
        for (int row = 0; row < arr.length ; row++) {
            for(int col = 0; col< arr[row].length;col++){
                if(arr[row][col] > ans){
                    ans= arr[row][col] ;
                }
            }
        }
        return ans;
    }
        // Alternative method to find the maximum value
    // Almost same only difference in line 43
    static int max2(int [][] arr){
        int ans = Integer.MIN_VALUE; // This is just the most minimum value that an integer can have
        // i.e -2147483648 You can check it by using System.out.println(Integer.MIN_VALUE);
        for (int row = 0; row < arr.length ; row++) {
            for(int col = 0; col< arr[row].length;col++){
                if(arr[row][col] > ans){
                    ans= arr[row][col] ;
                }
            }
        }
        return ans;
    }

}
