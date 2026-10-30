/** Q10: Writable radius and read-only derived properties. */
public class CircleBean {
    private double radius;
    public CircleBean() { }
    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius must be >= 0");
        this.radius = radius;
    }
    public double getArea() { return Math.PI * radius * radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }
    public static void main(String[] args) {
        CircleBean circle = new CircleBean();
        circle.setRadius(3);
        System.out.printf("Area: %.2f, Circumference: %.2f%n",
            circle.getArea(), circle.getCircumference());
    }
}
