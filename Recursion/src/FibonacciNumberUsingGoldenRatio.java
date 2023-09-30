public class FibonacciNumberUsingGoldenRatio {
    public static void main(String[] args) {
        for (int i = 0  ; i < 11; i++) {
            System.out.println(FiboFormula(i));
        }
    }
    static int FiboFormula(int n){
        //just for demo use long int
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1- Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
