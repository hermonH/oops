class Outer {
    int outer_x = 100;
    private static int outer_y=55;
    static class Inner {
    void display() {
    System.out.println("display: outer_y = " + outer_y);
    Outer o = new Outer();
    System.out.println("display: outer_x = " + o.outer_x);
    }
    }
    }
    class NestedClass {
public static void main(String args[]) {
// outer.test();
Outer.Inner i = new Outer.Inner();
i.display();
}
}
