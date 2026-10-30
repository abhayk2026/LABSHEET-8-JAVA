/** Q02: Rectangle JavaBean for area and perimeter. */
public class RectangleBean {
    private double length;
    private double width;

    public RectangleBean() { }
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getArea() { return length * width; }
    public double getPerimeter() { return 2 * (length + width); }

    public static void main(String[] args) {
        RectangleBean rectangle = new RectangleBean();
        rectangle.setLength(6);
        rectangle.setWidth(4);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
