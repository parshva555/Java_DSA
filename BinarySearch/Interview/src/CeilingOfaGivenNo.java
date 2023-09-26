// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


// There is no change in the code only the one condition is changed i.e when end becomes
// greater than start instead of returning -1 we return the start which is our answer
// basically when the while loop condition breaks we get the answer
public class CeilingOfaGivenNo {
    public static void main(String[] args) {
        // This is for ascending order
        int [] arr = {-18,-14,-12,-11,0,1,2,3,6,7,9};
        int targ = -10;
        int ans = Ceil(arr,targ);
        System.out.println("The element is found at index "+ans);

    }
// basically find the smallest number greater than or equal to the target number

    static int Ceil(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        // but what if target number is the largest number
        if(target >= arr[arr.length-1]){
            return -1;
        }
        while(start <= end){
            // find the middle element
//            int middle = (start + end)/2;
            //integer has a fixed size. start and end may exceed the range of Integer which will give error
            // so instead we use
            int mid = start + (end - start) /2;
            // if we user basic mathematics its the same
            // i.e 2start + end - start / 2
            // i.e start + end / 2

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                // answer found if target is equal to the element
                return mid;
            }
        }
        // answer found if smallest number  is greater than target number
        return start;   // if asked floor return end

        // if floor is asked instead of returning the start we return end

        // i.e for ceil we return start
        // for floor we return end
    }
}

//Similarly
// IF FLOOR IS ASKED
// GREATEST NUMBER SMALLER 0R EQUAL TO THE TARGET NUMBER
// therefore for 4 instead of returning the start we return the end
