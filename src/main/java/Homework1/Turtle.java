package Homework1;

public class Turtle extends Animal{

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public void voice() {
        System.out.println("Черепаха издает звук");
    }

}
