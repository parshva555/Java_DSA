import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int [] nums = {123,325432,1232,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums)); // it will print the changed value
    }
    static void change (int [] arr){
        arr[0] = 99;
    }
}
