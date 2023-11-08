package singleton;

public class Singleton {
    //if we want only one instance of that class to be created, only one instance/object is allowed,
    // we will create Singleton class

    public  Singleton() {

    }
    private Singleton instance;

    public Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
