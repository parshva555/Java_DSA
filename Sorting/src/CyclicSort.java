import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {1,4,3,5,2,6,8,9,7,10,15,14,12,13,11};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static  void swap (int [] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
