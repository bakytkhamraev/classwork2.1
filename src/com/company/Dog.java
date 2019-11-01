package com.company;

final public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog() {

    }

    public Dog(String name, String breed, Color color, Sheltor sheltor) {
        this.name = name;
        this.breed = breed;
        this.setColor(color);
        this.setSheltor(sheltor);

    }

    public Dog(String name, String breed, Color color, Sheltor sheltor, String[] commands) {
        this.name = name;
        this.breed = breed;
        this.setColor(color);
        this.setSheltor(sheltor);
        this.commands = commands;

    }


    void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    void makeVoice() {
        System.out.println("gav");
    }

    public String getInfo() {
        return super.getInfo() + " " + getBreed() + " " + getName() + "" + getAge() + "" + getCommands();


    }
}