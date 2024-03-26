package org.example.main;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester() {
        this("No name", "No surname");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = "Beginner";
        this.salary = 0.0;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }

    public void printInfo(boolean showSalary) {
        printInfo();
        if (showSalary) {
            System.out.println("Salary: " + salary);
        }
    }

    public void printInfo(boolean showSalary, boolean showEnglishLevel) {
        printInfo(showSalary);
        if (showEnglishLevel) {
            System.out.println("English Level: " + englishLevel);
        }
    }

    public static void greetTester() {
        System.out.println("Hello, Tester!");
    }
}
