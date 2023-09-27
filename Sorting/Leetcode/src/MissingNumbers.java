import java.util.Arrays;
//https://leetcode.com/problems/missing-number/submissions/
public class MissingNumbers {

    //https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {
        int [] arr = {0,1,3,5,2,6,8,9,7,10};
        int ans = MissingNumber(arr);
        System.out.println(ans);
    }
    static int MissingNumber(int [] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i];
            if (arr[i]< arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        // case 2
        return arr.length;
    }
    static  void swap (int [] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
