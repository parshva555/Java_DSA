public class FactorsOfANo {
    public static void main(String[] args) {
        factors2(20);
    }

    // O(n)
    static void factors1(int n){
        for (int i = 1; i <=n ; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    // O(sqrt(n))
    static void factors2(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.println(i);
                }else{
                    System.out.println(i + " " + n/i);
                }
            }
        }
    }
}
