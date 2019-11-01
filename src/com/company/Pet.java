package com.company;

import java.util.Random;
import java.util.SplittableRandom;

public class Pet {
    private int age=generateDefaultAge();
    private Color Color;
    private Sheltor Sheltor;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public com.company.Color getColor() {
        return Color;
    }

    public void setColor(com.company.Color color) {
        Color = color;
    }

    public Sheltor getSheltor() {
        return Sheltor;
    }

    public void setSheltor(Sheltor sheltor) {
        Sheltor = sheltor;
    }

 private int generateDefaultAge()
    {
        Random random= new Random(1);
        int a = random.nextInt(10);
        return a;

    }

    public String getInfo() {
        return getAge()+" "+getSheltor().getName();

    }

}
