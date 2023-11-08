package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    //such properties that are not directly related tor dependent on objects is static i.e .,
    // Population in case of Human characteristics
    //static properties/functions can be access without creating its object or instances. we can access population
    //without any object creation.

    static long population;
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population += 1;
    }
}
