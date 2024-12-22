public class DemoGenericClass<T> {

    public T bienKieuT;
    public void set(T value){
        this.bienKieuT = value;
    }
    public T get(){
        return this.bienKieuT;
    }

    //Su dung (Test)
    public static void main(String[] args) {
        DemoGenericClass<Integer> obj = new DemoGenericClass<Integer>();
        obj.set(13125);
        System.out.println(obj.get());
        DemoGenericClass<Float> obj2 = new DemoGenericClass<>();
        obj2.set(3.14f);
        System.out.println(obj2.get());

        DemoGenericClass<String> obj3 = new DemoGenericClass<>();
        obj3.set("Chung");
        System.out.println(obj3.get()); //Tren nay la Generic lay luon gia tri
        /*
        DemoGenericClass<Student> dgcStudent = new DemoGenericClass<Student>();
        Student student = new Student(100, "Devmaster", 10);
        dgcStudent.set(student);
        dgcStudent.get().show(); //Dưới này có nghĩa là bên Class Student có phương thức show() nên mình sẽ gọi ra như là một phương thức get() với các kiểu primitive ở bên trên để hiển thị thông tin
        */

    }

}
