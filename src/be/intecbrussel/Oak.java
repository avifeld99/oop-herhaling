package be.intecbrussel;

public class Oak extends Tree {

    private int height = 5;
    private int age;
    private String color;

    public Oak() {
        //this(200);
        //super();
        System.out.println("constructor no args oak");
    }

    public Oak(int height) {
        //this(145, 5, "green");
        this.height = height;
        System.out.println("constructor 1 parameter oak");
    }

    public Oak(int height, int age, String color) {
        setHeight(height);
        this.age = age;
        this.color = color;
        System.out.println("constructor all args oak");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 100) {
            this.height = height;
        } else {
            System.out.println("te groot");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Oak{" +
                "height=" + height +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}
