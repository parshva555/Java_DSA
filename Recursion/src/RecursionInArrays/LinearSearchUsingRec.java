package RecursionInArrays;

public class LinearSearchUsingRec {
    public static void main(String[] args) {
        int[] arr = {123,3452,3,54,23};
        int target = 123;
        System.out.println(find(arr,target,0));
    }
    static boolean find(int [] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
}
