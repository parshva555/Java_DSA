public class CheckPowerOf2 {
    public static void main(String[] args) {
        int n = 256;
        System.out.println(Powerof2(n));
    }
    static boolean Powerof2(int n){
        int ans = n & 1;
        if (ans == 0){
            return true;
        }
        return false;
    }
}
