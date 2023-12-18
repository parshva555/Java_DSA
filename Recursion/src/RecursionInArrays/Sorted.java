package RecursionInArrays;

public class Sorted {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,5};
        System.out.println(sortedOrNot(arr,0));
    }
    static boolean sortedOrNot(int [] arr, int index){
        // base condition
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index +1] && sortedOrNot(arr,index+1);
    }
}
