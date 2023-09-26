public class SearchElementInSortedArrayOfInfiniteNumbers {
    // Geek for geeks
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

    // Since it is an infinite array we dont know the end index
    // that is why we can use the length function

    // we will move in chunks for this question
    // then we will apply binary search on that particular chunk
    // basically taking subsets of arrays and moving ahead

    // In normal binary search we went from top to bottom diving the array by 2 and atlast coming to a single element
    // In this approach we will go bottom to top we will start with 1 and go till doubling it......
    // by multiplying the size by 2
    public static void main(String[] args) {
        int [] arr = {2,3,5,6,7,8,9,10,11,100,110,170,200,210};
        int target = 10;
        System.out.println(ans(arr,target));
    }
    static int ans(int [] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end  = 1;

        // condition for the target to lie in the range
        // while the target is greater than end keep doubling
        while(target > arr[end]){
            int temp = end+1; // this is my new Start
            // double the box value
            // end  = previus end + sizeofbox * 2;
            end = end + ( end - start + 1 ) * 2;
            start = temp; // assigning the start the same as it was before
        }
        return binary(arr,target,start,end);
    }
    // Normal binary search with no start and end index as we dont know
    static int binary(int [] arr, int target,int start, int end){
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
                // answer found
                return mid;
            }
        }
        // if element does not exist
        return -1;
    }
}
