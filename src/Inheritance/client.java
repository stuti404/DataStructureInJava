package Inheritance;

public class client {
    public static void main(String[] args) {
        p parent = new p();
        c child = new c();
        p obj = new c();
        System.out.println(((c)(obj)).d2);

    }
}
