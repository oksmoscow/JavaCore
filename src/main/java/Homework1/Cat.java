package Homework1;

import java.util.Objects;

public class Cat extends Animal{

    private boolean isWild;

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public void voice() {
        System.out.println("Кот мяукает");
    }

 }
