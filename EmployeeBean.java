import java.io.*;

/** Q03: Serializable JavaBean and serialization round-trip. */
public class EmployeeBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private int empId;
    private String empName;
    private double salary;

    public EmployeeBean() { }
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }
    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EmployeeBean employee = new EmployeeBean();
        employee.setEmpId(12);
        employee.setEmpName("Isha");
        employee.setSalary(48000);
        // In-memory serialization, so no extra files are created.
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try (ObjectOutputStream output = new ObjectOutputStream(bytes)) {
            output.writeObject(employee);
        }
        EmployeeBean restored;
        try (ObjectInputStream input = new ObjectInputStream(
                new ByteArrayInputStream(bytes.toByteArray()))) {
            restored = (EmployeeBean) input.readObject();
        }
        System.out.printf("Restored: %d, %s, %.2f%n",
            restored.getEmpId(), restored.getEmpName(), restored.getSalary());
    }
}
