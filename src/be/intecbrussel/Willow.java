package be.intecbrussel;

public class Willow extends Oak {
    private int width;
    private int numberOfLeaves;


    public Willow() {
        System.out.println("Willow class no args");
    }

    public Willow(int width, int numberOfLeaves) {
        this.width = width;
        this.numberOfLeaves = numberOfLeaves;
        System.out.println("Willow class all args");
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public void setNumberOfLeaves(int numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }


    // methode overloading
    public void calculateMass() {
        System.out.println("Nope need parameters");
    }

    public int calculateMass(int width) {
        return width * super.getHeight();
    }

    public double calculateMass(double width) {
        return width * super.getHeight();
    }

    public int calculateMass(int width, int numberOfLeaves) {
        return width;
    }

}
