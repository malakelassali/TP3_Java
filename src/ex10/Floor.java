package ex10;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width= width < 0 ? 0 : width;
        this.length= length < 0 ? 0 : length;
    }

    public double getArea() {
        return width*length;
    }

    public static void main(String[] args) {
        Floor floor1= new Floor(5, 4);
        Floor floor2= new Floor(-3, 6);

        System.out.println("area1 = " + floor1.getArea());
        System.out.println("area2 = " + floor2.getArea());
    }
}
