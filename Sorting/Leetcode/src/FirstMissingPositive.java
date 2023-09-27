public class FirstMissingPositive {
    public static void main(String[] args) {

    }

    public int firstMissingPositive(int[] nums) {
            int i = 0;
            // so now here ham jo swithiching kar rahe hai wo positive ke liye hi karna padega so for that do like that
            while(i<nums.length){
                int correct = nums[i]-1;
                if(nums[i]>0 && nums[i]<nums.length && nums[i] != nums[correct]){
                    swap(nums, i , correct);
                }
                else{
                    i++;
                }
            }
            for (int index = 0; index<nums.length; index++){
                if (nums[index] != index+1){
                    return index+1;
                }
            }
            // else we have to return the last index
            return nums.length+1;  // ohterwise wo ek annge ka element return karega as sarre element present hai to next positive to useke annge ka hi hua nn isliye

    }
        void swap(int[] nums , int first , int second ){
            int temp = nums[first];
            nums[first]= nums[second];
            nums[second]= temp;
        }
        // so we have doen nothing but missing number walle ka concept lagaye hai with the case ki ham swap usse number ko tabhi kar rahe hai sort karne ke liye jab wo positive ho

}
