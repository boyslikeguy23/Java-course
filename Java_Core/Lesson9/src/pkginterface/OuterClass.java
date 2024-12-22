package pkginterface;

public class OuterClass {
    protected String name;
    private int year;

    OuterClass(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "pkginterface.OuterClass{"+name+", year="+year+"}";
    }

    //InnerClass
    public static class InnerClass {
        private String name;
        private int year;
        InnerClass(String name, int year) {
            this.name = name;
            this.year = year;
        }
        @Override
        public String toString() {
            return "InnerClass{"+name+", year="+year+"}";
        }
    }
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("Bob", 2018);
        System.out.println(outerClass.toString());

        InnerClass inner = new InnerClass("Bob", 2018);
        System.out.println(inner.toString());
    }
}
