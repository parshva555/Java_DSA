package OOPS2;

public class callingFunctionMessage {
    public static void main(String[] args) {
        System.out.println("I am awesome");
    }
    public static void message(){
        System.out.println("Hello I am the message being called in staticc from callingFunctionMessage");
    }
    private static void message1()
    {
        System.out.println("This is inside a private function so the staticc.java wont ne able to call it as it is privat");
    }
}

