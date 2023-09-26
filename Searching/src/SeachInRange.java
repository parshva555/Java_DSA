public class SeachInRange {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,56,2,423,523,453};
        System.out.println(searchrange(arr,1,3,56));
    }

    static int searchrange(int [] arr, int start, int end,int target){
        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
