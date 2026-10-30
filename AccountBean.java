import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/** Q06: Listeners are notified when the balance value changes. */
public class AccountBean {
    private double balance;
    private final PropertyChangeSupport changes = new PropertyChangeSupport(this);

    public AccountBean() { }
    public double getBalance() { return balance; }
    public void setBalance(double newBalance) {
        double previous = balance;
        balance = newBalance;
        changes.firePropertyChange("balance", previous, newBalance);
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changes.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changes.removePropertyChangeListener(listener);
    }
    public static void main(String[] args) {
        AccountBean account = new AccountBean();
        account.addPropertyChangeListener(event -> System.out.printf(
            "%s changed: %s -> %s%n", event.getPropertyName(),
            event.getOldValue(), event.getNewValue()));
        account.setBalance(5000);
    }
}
