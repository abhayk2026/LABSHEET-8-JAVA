/** Q09: Car JavaBean with make, model and year. */
public class CarBean {
    private String make;
    private String model;
    private int year;
    public CarBean() { }
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public static void main(String[] args) {
        CarBean car = new CarBean();
        car.setMake("Maruti Suzuki");
        car.setModel("Swift");
        car.setYear(2025);
        System.out.printf("%s %s (%d)%n", car.getMake(), car.getModel(), car.getYear());
    }
}
