package Leetcode;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        // This is for ascending order
        char [] letters = {'c','f','j'};
        char targ = 'c';
        int ans = Ceil(letters,targ);
        System.out.println("The element is found at index "+ans);
    }
    static int Ceil(char [] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while(start <= end){

            int mid = start + (end - start) /2;


            if (target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length] ;


    }
}
