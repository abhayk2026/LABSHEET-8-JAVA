/** Q01: JavaBean with private fields and public getter/setter methods. */
public class StudentBean {
    private int id;
    private String name;
    private double grade;

    public StudentBean() { }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }

    public static void main(String[] args) {
        StudentBean student = new StudentBean();
        student.setId(101);
        student.setName("Aarav");
        student.setGrade(89.5);
        System.out.printf("ID: %d, Name: %s, Grade: %.1f%n",
            student.getId(), student.getName(), student.getGrade());
    }
}
