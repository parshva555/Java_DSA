import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }
    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    // Asked in google
    // since the answer can be variable in size that is why they have used array list here
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i< nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    public static void swap (int [] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
