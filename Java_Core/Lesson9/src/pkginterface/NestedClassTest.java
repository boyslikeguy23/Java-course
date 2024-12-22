package pkginterface;

public class NestedClassTest {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass("Lớp ngoai", 2003);

        OuterClass.InnerClass inner = new OuterClass.InnerClass("Lớp trong", 2222);
        System.out.println(inner.toString());
    }
}
