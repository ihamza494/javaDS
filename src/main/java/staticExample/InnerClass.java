package staticExample;


public class InnerClass {
    //outside class can not static
    static class test{
         String name;

        public test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "test{" +
                    "name='" + this.name + '\'' +
                    '}';
        }
    }
//objects/instances created at run time , while static var/func doesn't dependent on objects/instances , hence
    // they compiled on compile time
    public static void main(String[] args) {
        test A = new test("Hamza");
        test B = new test("Iqbal");

        System.out.println(A.name);
        System.out.println(B.name);
        System.out.println(A);
    }
}
