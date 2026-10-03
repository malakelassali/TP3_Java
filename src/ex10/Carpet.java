package ex10;

public class Carpet {
    private double cost;
    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }
    public double getCost() {
        return cost;
    }

    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(8.5);
        Carpet carpet2 = new Carpet(-4);

        System.out.println("cost1 = " + carpet1.getCost());
        System.out.println("cost2 = " + carpet2.getCost());
    }
}
