package oefening;

public class Cow extends Mammals {

    private double weight;
    private int tagNum;

    public Cow() {
        //super();
        //this(6.6, 4);
    }

    public Cow(double weight, int tagNum) {
        this.weight = weight;
        this.tagNum = tagNum;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "weight=" + weight +
                ", tagNum=" + tagNum +
                '}';
    }
}
