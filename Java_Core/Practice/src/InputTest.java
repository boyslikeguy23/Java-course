import javax.swing.*;

public class InputTest {
    public static void main(String[] args)
    {
        //Get username
        String name = JOptionPane.showInputDialog("Enter your name");

        String input = JOptionPane.showInputDialog("How old are you?");

        int age = Integer.parseInt(input);
        System.out.println("Hello, " + " is " + name + ". Next year, you'll be " + (age + 1) + " years old");
        System.exit(0);
    }
}
