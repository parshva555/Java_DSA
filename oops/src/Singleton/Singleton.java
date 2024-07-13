package Singleton;

public class Singleton {
    // Constuctor that is used only in this class as it is private
    // Singleton class is used to have only one object of a particular thing
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getInstance(){
        // check whether one object only is created or not.
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
