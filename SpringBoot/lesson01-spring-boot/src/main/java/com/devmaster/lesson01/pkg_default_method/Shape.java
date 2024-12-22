package com.devmaster.lesson01.pkg_default_method;

public interface Shape {
    void draw();
    default void setColor(String color) {
        System.out.println("Drawing color: " + color);
    }
}
