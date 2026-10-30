import java.time.LocalDate;

/** Q04: Read-only currentDate computed every time it is requested. */
public class DateBean {
    public DateBean() { }
    public LocalDate getCurrentDate() { return LocalDate.now(); }

    public static void main(String[] args) {
        System.out.println("Today's date: " + new DateBean().getCurrentDate());
    }
}
