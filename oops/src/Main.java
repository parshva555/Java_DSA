import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // new keyword dynamically allocated the memory and returns a reference variable to it
        Student hello = new Student(10,"ParshvaDani",23);
        System.out.println(hello.rno);
        System.out.println(hello.name);
        System.out.println(hello.marks);
        hello.newName("Nidhi");
        hello.greeting();
        Student bye = new Student();
        System.out.println(bye.rno);
        // testing constructor calling a constructor
        // this will call the default constructor and the default constructor will call the parameterized construcxtor
        Student random = new Student();

    }
}
class Student{
    int rno;
    String name;
    float marks;


    void newName(String newName){
        name = newName;
    }
    void greeting(){
        System.out.println("Hello! My name is " + name);
    }
    public Student() {
        // This is how you call a constructor from another constructor
        this (13,"Default person",100);
    }
    public Student(int i, String main_name, float v) {
        this.rno = i;
        this.name = main_name;
        this.marks = v;

    }
}