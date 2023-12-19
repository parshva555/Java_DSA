package patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class patterns {
    public static void main(String[] args) {
//        traingle(4,0);
//        traingle2(4,0);
        int [] arr = {34,23,45,12};
//        bubblesort(arr,arr.length-1,0);
//        System.out.println(Arrays.toString(arr));
        selectionsort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));

    }
    static void traingle (int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            traingle(r,c+1);
        }
        else{
            System.out.println();
            traingle(r-1,0);
        }
    }
    static void traingle2(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            traingle2(r,c+1);
            System.out.print("*");

        }
        else{
            traingle2(r-1,0);
            System.out.println();

        }
    }
    static void bubblesort (int [] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                //swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubblesort(arr, r, c + 1);
        } else {
            bubblesort(arr, r - 1, 0);
        }
    }
    static void selectionsort (int []arr,int r, int c,int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                selectionsort(arr,r,c+1,c);
            }
            else{
                selectionsort(arr,r,c+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionsort(arr,r-1,0,0);
        }
    }

}
