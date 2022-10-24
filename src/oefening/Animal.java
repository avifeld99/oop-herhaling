package oefening;

public class Animal {

    private String name;
    private int number;
    private int age;

    public Animal() {
        System.out.println("this is a wonderful (Class) animal no args");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("this is a wonderful (Class) animal 1 para");
    }

    public Animal(String name, int number) {
        this.name = name;
        this.number = number;
        System.out.println("this is a wonderful (Class) animal 2 para");
    }

    public Animal(String name, int number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
        System.out.println("this is a wonderful (Class) animal all args");
    }


}
