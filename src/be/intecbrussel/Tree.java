package be.intecbrussel;

public class Tree {

    private String name;


    public Tree() {
        System.out.println("it's a tree");
    }

    public Tree(String name) {
        this.name = name;
        System.out.println("super class all args class Tree");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void typeOfTree() {
        System.out.println("this is a tree");
    }
}
