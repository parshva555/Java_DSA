package RecursionInArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearchUsingRec {
    public static void main(String[] args) {
        int[] arr = {123,3452,3,3,54,54,23};
        int target = 3;
//        int ans  = findIndex(arr,target,0);
//        System.out.println(ans);
//        int ans1 = findIndexLast(arr,target,arr.length-1);
//        System.out.println(ans1);
////        findAllIndex(arr,3,0);
////        System.out.println(list);
//        System.out.println(findAllIndex(arr,3,0,new ArrayList<>()));
        System.out.println(findAllIndex2(arr,3,0));
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


    static ArrayList<Integer> findAllIndex(int [] arr, int target , int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
    static ArrayList<Integer> findAllIndex2(int [] arr, int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        // this is will contain answer for that function call only
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> answerFromBelowCalls =  findAllIndex2(arr,target,index+1);
        list.addAll(answerFromBelowCalls);
        return list;
    }
}
