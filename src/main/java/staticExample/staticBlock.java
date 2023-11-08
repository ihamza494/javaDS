package staticExample;

public class staticBlock {
    static int a=10;
    static int b;

    static { //this gets called only once , when the class loaded and first object/instance created.
        System.out.println("I am in static block");
        b = a* 5;
    }

    public static void main(String[] args) {
        System.out.println(staticBlock.a+" "+ staticBlock.b);
        staticBlock obj = new staticBlock();
        System.out.println("-> "+obj.a + " " + obj.b);

        obj.b += 5;
        System.out.println("-> "+obj.a + " " + obj.b);

        staticBlock obj2 = new staticBlock();
        System.out.println("obj2-> "+obj2.a + " " + obj2.b);

    }


}
