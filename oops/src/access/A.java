package access;

public class A {
    private int num;
    String name;
    int [] arr;
    // getter
    public int getNum(){
        return num;
    }
    // setter
    public void setNum(){
        this.num = num;
    }
    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
