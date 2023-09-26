import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Parshva";
        char target = 'b';
        String name1 = "Parshva";
        char target1 = 'P';
        System.out.println(search(name,target));
        System.out.println(search2(name1,target1));

        System.out.println(Arrays.toString(name.toCharArray()));
    }
    // Both the  functions are doing the same thing just the search2 function
    // is an enhanced version
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
