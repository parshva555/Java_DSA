package patterns;

public class patterns {
    public static void main(String[] args) {
        traingle(4,0);
        traingle2(4,0);

    }
    static void traingle (int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            traingle(r,c+1);
        }
        else{
            System.out.println();
            traingle(r-1,0);
        }
    }
    static void traingle2(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            traingle2(r,c+1);
            System.out.print("*");
            
        }
        else{
            traingle2(r-1,0);
            System.out.println();

        }
    }

}
