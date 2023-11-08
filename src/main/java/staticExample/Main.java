package staticExample;

public class Main {
    public static void main(String[] args) {
        //main is static as we need to run it without creation of object of Main class.
        //static variable/function belongs to the class , do not belongs to the object.
        //static method can only access static data and can not access non static data.
        //something which is non static , belongs to object.

        Human hamza = new Human(25, "Hamza Iqbal", 60000, false);
        Human saad = new Human(24, "Saad Ali", 70000, false);

        System.out.println(Human.population);
        System.out.println(Human.population);

        //greetings(); //we can not access as it is non static member and depends on instances

        Main obj = new Main();
        obj.greetings();
    }

    void  greetings(){
        System.out.println("Hello world!");
    }
}
