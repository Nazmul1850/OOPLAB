package Reference;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Complex Number");
        Complex z1 = new Complex(2,4);
        Complex z2 = new Complex(4,3);
        Complex res = z1.sub(z2);
        System.out.println(res);
    }
}
