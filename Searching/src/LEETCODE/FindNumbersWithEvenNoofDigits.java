package LEETCODE;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNumbersWithEvenNoofDigits {
    public static void main(String[] args) {
        int [] nums = {12,3451,2,6,7896, -3244};
        System.out.println(findNumbers(nums));
//        System.out.println(digits2(23623));
    }
    static int findNumbers(int [] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; // Get the current number from the array
            if (even(num)) {
                count++; // Increment the count if the number is even
            }
        }
        return count;
    }
    // Function to check if number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    // count number of digits in a number
    static int digits(int num){
        // For Negative Numbers
        if (num < 0){
            num = num * -1;
        }
        // If the number is array is 0
        if(num == 0){
            return 1;
        }


        int count = 0;

        while(num > 0){
            count++;
            num = num / 10;
        }

        return  count;
    }


    // Shortcut to find the number of digits
    static int digits2(int num){
        // For Negative Numbers
        if (num < 0){
            num = num * -1;
        }
        // If the number is array is 0
        if(num == 0){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
