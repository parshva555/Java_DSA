public class StringB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        // keeps on changing in the orignal objects itself
        // It is mutable
        for (int i = 0; i < 26 ; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
