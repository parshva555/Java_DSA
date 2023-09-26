public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println("The message is :" + message);
//        String personalized = myGreet("Parshva");
//        System.out.println(personalized);
        String personalized =trimmedmessage("parshva");
        System.out.println(personalized);
    }
    // Returning a Stirng
    static String greet(){
        String greeting = "How aree you ";
        return greeting;
    }
    //Just an additional operation no need to see the logic
    static String trimmedmessage(String message){
        String trimmed = String.valueOf(message.trim().charAt(0));
        return trimmed;
    }


    static String myGreet(String message){
        String name  = "Hello" + message;
        return name;
    }
}
