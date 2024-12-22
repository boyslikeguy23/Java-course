package pkgreview;
/*

 */
public abstract class Student {
    protected String name;
    protected int year;
    public Student(){}
    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    // method that has content
    public void show()
    {
        System.out.println("Name : " + name);
        System.out.println("Year : " + year);
    }

    //abstract method Average
    public abstract float average();

}
