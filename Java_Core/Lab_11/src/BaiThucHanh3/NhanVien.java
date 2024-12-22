package BaiThucHanh3;

import java.io.Serializable;

public class NhanVien implements Serializable{
    String name;
    int age;
    String address;
    public NhanVien(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return name + "(" + age + ")" + address;
    }

}
