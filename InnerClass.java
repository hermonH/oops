class Outer {
    int outer_x = 100;
    // void test() {
    // Inner inner = new Inner();
    // inner.display();
    // }
    // this is an inner class
    class Inner {
    void display() {
    System.out.println("display: outer_x = " + outer_x);
    }
    }
    }
    class InnerClass {
public static void main(String args[]) {
Outer outer = new Outer();
// outer.test();
Outer.Inner i = outer.new Inner();
i.display();
}
}