package RecursionInArrays;

import java.util.ArrayList;

public class LinearSearchUsingRec {
    public static void main(String[] args) {
        int[] arr = {123,3452,3,3,54,54,23};
        int target = 3;
        int ans  = findIndex(arr,target,0);
        System.out.println(ans);
        int ans1 = findIndexLast(arr,target,arr.length-1);
        System.out.println(ans1);
        findAllIndex(arr,3,0);
        System.out.println(list);
    }
    static boolean find(int [] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    static int findIndex(int [] arr, int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        else{
            return findIndex(arr,target,index+1);
        }
    }
    static int findIndexLast(int [] arr, int target , int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        else{
            return findIndexLast(arr,target,index-1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int [] arr, int target , int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
}
