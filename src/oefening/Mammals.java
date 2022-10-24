package oefening;

public class Mammals extends Animal {

    private int quantity;
    private double size;

    public Mammals() {
        System.out.println("Mammals = zoogdieren");
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 50) {
            this.quantity = quantity;
        } else {
            System.out.println("too big for our farm");
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    public void mammalsCharacter() {
        System.out.println("drinks milk from mother");
    }

}
