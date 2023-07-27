import org.w3c.dom.ls.LSOutput;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getPoint1() {
        return x;
    }
    public int getPoint2() {
        return y;
    }
    public void setPoint1(int x) {
        this.x = x;
    }
    public void setPoint2(int y) {
        this.y = y;
    }
    public double distance() {
        return Math.sqrt( x * x + y * y);
    }

    public double distance( Point p ) {
        int xDist = this.x - p.x;
        int yDist = this.y - p.y;

        return Math.sqrt( xDist * xDist + yDist * yDist );
    }
    public double distance( int a , int b ) {
        int xDist = this.x - a;
        int yDist = this.y - b;

        return Math.sqrt( xDist * xDist + yDist * yDist );
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        Point point = new Point(0,0);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        System.out.println("distance()= " + point.distance());
    }
}
