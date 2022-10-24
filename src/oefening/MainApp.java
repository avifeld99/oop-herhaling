package oefening;

public class MainApp {

    public static void main(String[] args) {

        Cow cow = new Cow(9.8, 9);
        System.out.println(cow);
        Cow cowBettie = new Cow();

        cow.setQuantity(8);
        System.out.println(cow.getQuantity());

    }

}
