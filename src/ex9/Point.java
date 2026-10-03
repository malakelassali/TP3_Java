package ex9;

public class Point {

    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x= x;
        this.y= y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x= x;
    }

    public void setY(int y) {
        this.y= y;
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(Point point) {
        return Math.sqrt(
                (point.x-x) * (point.x-x)
                        + (point.y-y) * (point.y-y)
        );
    }

    public double distance(int x, int y) {
        return Math.sqrt(
                (x-this.x) * (x-this.x)
                        + (y-this.y) * (y-this.y)
        );
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("first x= " + first.getX());
        System.out.println("first y= " + first.getY());
        System.out.println("distance from first to (0,0)= " + first.distance());
        System.out.println("distance from first to second= " + first.distance(second));
        System.out.println("distance from first to (2,2)= " + first.distance(2, 2));

        first.setX(10);
        first.setY(20);
        System.out.println("new x= " + first.getX());
        System.out.println("new y= " + first.getY());
    }
}
