public class FindMinInArray {
    public static void main(String[] args) {
        int [] arr = {234,343,-235,234,-237};
        System.out.println(min(arr));
    }
    // assume arr.length is not equal to 0
    // return the minimum value in the array
    static int min(int [] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
