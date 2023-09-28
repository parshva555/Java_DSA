public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 456.234f;
        System.out.printf("Formatted number is %.1f" , a); // Denotes the number of decimal places and also rounds it off
        System.out.println("\n");
        System.out.printf("Formatted PI number is %.2f", Math.PI);  // the f in printf denotes formatted
        System.out.println("\n");
        System.out.printf("hello my name is %s %s","parshva","dani");
    }
}
